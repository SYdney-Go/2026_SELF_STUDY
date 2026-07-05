package sec04_thiskeyword.EX01_ThisKeyword_1;

/*
 * [EX01] 묵시적(자동) this 키워드
 *
 * this = "지금 이 객체(나 자신)"을 가리키는 참조
 *   예) A a = new A();  a.work();  →  work() 안의 this는 a 객체를 가리킴
 *
 * ★ 핵심: 매개변수 이름(a, b)과 필드 이름(m, n)이 다를 때
 *   → this를 안 써도 컴파일러가 알아서 필드에 this.를 붙여줌
 *   → this.m = a;  를  m = a;  로 써도 동작은 같음
 */

class A {
	int m;  // 필드(멤버 변수) — 객체가 태어날 때 만들어지고, 객체가 살아 있는 동안 유지
	int n;

	void init(int a, int b) {
		// ── 여기 안에 있는 변수 3종류 ──
		//   ① 필드:     m, n        (클래스 { } 바로 아래 선언)
		//   ② 매개변수: a, b         (메서드 ( ) 안에 선언, 호출할 때 값이 들어옴)
		//   ③ 지역변수: c            (메서드 { } 안에 선언, 메서드 끝나면 사라짐)

		int c;
		c = 3;          // 지역변수 — this 붙이면 안 됨 (this.c는 필드를 찾으려 해서 오류)

		this.m = a;     // "이 객체의 필드 m" ← "매개변수 a의 값"
		this.n = b;     // "이 객체의 필드 n" ← "매개변수 b의 값"
		// ↓ 아래처럼 this. 생략해도 OK (이름이 달라서 컴파일러가 구분 가능)
		// m = a;
		// n = b;
	}

	void work() {
		this.init(2, 3);  // "이 객체의 init() 호출"
		// ↓ this. 생략해도 OK
		// init(2, 3);
	}
}

public class ThisKeyword_1 {
	public static void main(String[] args) {
		A a = new A();    // a = A 타입 객체 하나 생성 (이때 m=0, n=0)

		a.work();
		// 실행 순서:
		//   1) a.work()        → work() 안에서 init(2, 3) 호출
		//   2) init(2, 3)      → a.m=2, a.n=3 으로 필드 저장
		//   3) a.m 출력 → 2
		//   4) a.n 출력 → 3

		System.out.println(a.m); // 2  ← main에서는 객체 변수 a를 통해 필드 접근
		System.out.println(a.n); // 3
	}
}
