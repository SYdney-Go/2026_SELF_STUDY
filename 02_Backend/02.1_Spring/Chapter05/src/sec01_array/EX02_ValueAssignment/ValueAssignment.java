package sec01_array.EX02_ValueAssignment;

/*1차원 배열의 원소값 대입의 3가지 방법*/

public class ValueAssignment {
	public static void main(String[] args) {
		//#1. 배열의 원소값 대입 방법 1
		int[] array1 = new int[3];
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);

		int[] array2;
		array2 = new int[3];
		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;
		System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);

		//#2. 배열의 원소값 대입 방법 2
		int[] array3 = new int[] { 3, 4, 5 };
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);

		int[] array4;
		array4 = new int[] { 3, 4, 5 };
		System.out.println(array4[0] + " " + array4[1] + " " + array4[2]);

		//#3. 배열의 원소값 대입 방법 3
		int[] array5 = { 3, 4, 5 };
		System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);

		// int[] array6;
		// array6 = {3, 4, 5}; // 불가능
		// System.out.println(array6[0]+ " "+ array6[1]+ " " + array6[2]);

		//#4. 값 대입 없이 출력 (힙 배열의 기본값 초기화)
		int[] array7 = new int[3];
		System.out.println(array7[0] + " " + array7[1] + " " + array7[2]); // 0 0 0

		boolean[] array8 = new boolean[3];
		System.out.println(array8[0] + " " + array8[1] + " " + array8[2]); // false false false

		String[] array9 = new String[3];
		System.out.println(array9[0] + " " + array9[1] + " " + array9[2]); // null null null
	}
}
