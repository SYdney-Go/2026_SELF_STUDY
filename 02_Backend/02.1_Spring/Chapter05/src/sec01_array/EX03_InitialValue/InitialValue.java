package sec01_array.EX03_InitialValue;

/*
 * 스택 vs 힙 초기화 정리
 *
 * [스택] main() 안 로컬 변수 → JVM이 0/null 자동 대입 안 함 → 쓰기 전에 직접 값 넣어야 함
 * [힙]   new로 만든 배열 객체의 각 칸 → 타입별 기본값으로 자동 초기화됨
 *
 * int value3, int[] value4 도 스택 변수지만, 아래처럼 "직접" 넣은 값이지 자동 초기화가 아님!
 */

import java.util.Arrays;

public class InitialValue {
	public static void main(String[] args) {
		// ── #1. 스택: 로컬 변수 (자동 초기화 X) ──────────────────────────

		int value1; // 스택 | int | 선언만 → 값 없음
		// System.out.println(value1); // 컴파일 에러: might not have been initialized

		int[] value2; // 스택 | int[] 참조 | 선언만 → 어떤 배열도 가리키지 않음
		// System.out.println(value2); // 컴파일 에러 (위와 같은 이유)

		// ↓ 직접 초기화한 경우만 사용 가능 (JVM이 자동으로 0/null 준 게 아님!)
		int value3 = 0; // 스택 | int | 내가 0을 넣음
		System.out.println(value3); // 0

		int[] value4 = null; // 스택 | int[] 참조 | "아직 배열 없음"을 표현
		System.out.println(value4); // null (힙에 배열 객체가 없다는 뜻)
		System.out.println();

		// ── #2. 힙: new 배열의 각 칸 (자동 초기화 O) ─────────────────────
		// array2 같은 "변수"는 스택, new int[3]으로 생긴 "배열 칸"은 힙

		//@기본자료형 배열 — 힙 칸에 값이 자동으로 들어감
		boolean[] array1 = new boolean[3]; // 힙: [false][false][false]
		for (int i = 0; i < 3; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();

		int[] array2 = new int[3]; // 힙: [0][0][0]
		for (int i = 0; i < 3; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();

		double[] array3 = new double[3]; // 힙: [0.0][0.0][0.0]
		for (int i = 0; i < 3; i++) {
			System.out.print(array3[i] + " ");
		}
		System.out.println();

		//@참조자료형 배열 — 힙 칸은 "String 참조"이므로 null
		String[] array4 = new String[3]; // 힙: [null][null][null] (문자열 3개가 아님!)
		for (int i = 0; i < 3; i++) {
			System.out.print(array4[i] + " ");
		}
		System.out.println();
		System.out.println();

		// Tip. 배열을 쉽게 출력할 수 있는 방법
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
	}
}
