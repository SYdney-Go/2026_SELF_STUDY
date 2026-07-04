package sec04_thiskeyword.EX02_ThisKeyword_2;

/*
 * [EX02] 명시적(직접) this 키워드 — EX01과의 차이점!
 *
 * EX01: 매개변수 이름(a, b) ≠ 필드 이름(m, n)  →  this 생략 가능
 * EX02: 매개변수 이름(m, n) = 필드 이름(m, n)  →  this 없으면 필드에 값이 안 들어감!
 *
 * ★ 왜? Java는 "이름이 같은 변수"가 있으면 가까운 쪽(매개변수)을 우선함
 *   → 이걸 "변수 섀도잉(shadowing)" 이라고 함
 *   → m = m; 은 "매개변수 m = 매개변수 m" (필드는 건드리지 않음!)
 *   → this.m = m; 은 "필드 m = 매개변수 m" (의도한 대로 동작)
 */

// ── 클래스 A: this 없음 → 필드가 0 그대로 ──
class A {
	int m;  // 필드
	int n;  // 필드

	void init(int m, int n) {
		// ⚠ 이름 충돌! init 안에서 "m"이라고 쓰면 필드가 아니라 매개변수 m을 가리킴

		m = m;
		// ↑ 실제 의미: 매개변수m = 매개변수m  (자기 자신에 2를 넣는 것, 필드는 무시)
		//   필드 this.m 은 전혀 건드리지 않음 → 필드 m은 초기값 0 유지

		n = n;
		// ↑ 마찬가지: 매개변수n = 매개변수n  → 필드 n도 0 유지
	}
}

// ── 클래스 B: this 사용 → 필드에 값이 정상 저장 ──
class B {
	int m;
	int n;

	void init(int m, int n) {
		this.m = m;
		//  ↑       ↑
		//  필드     매개변수
		// "이 객체의 필드 m" ← "넘어온 값 2"

		this.n = n;
		// "이 객체의 필드 n" ← "넘어온 값 3"
	}
}

public class ThisKeyword_2 {
	public static void main(String[] args) {
		// ── #1. this 없는 경우 (클래스 A) ──
		A a = new A();
		a.init(2, 3);
		// init(2,3) 호출 시:
		//   매개변수 m=2, n=3 이 들어옴
		//   m=m → 매개변수끼리 대입 (필드 변경 없음!)
		//   n=n → 매개변수끼리 대입 (필드 변경 없음!)
		System.out.println(a.m); // 0  ← 필드는 한 번도 바뀌지 않음
		System.out.println(a.n); // 0

		// ── #2. this 있는 경우 (클래스 B) ──
		B b = new B();
		b.init(2, 3);
		// init(2,3) 호출 시:
		//   this.m = 2  → b 객체의 필드 m = 2
		//   this.n = 3  → b 객체의 필드 n = 3
		System.out.println(b.m); // 2
		System.out.println(b.n); // 3
	}
}
