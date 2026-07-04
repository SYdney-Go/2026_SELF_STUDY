package sec01_array.EX09_ReadArrayData_2D;

/*2차원 배열의 원소값 출력*/

public class ReadArrayData_2D {
	public static void main(String[] args) {
		//#1. 2차원 데이터의 배열의 길이
		int[][] array1 = new int[2][3];
		System.out.println(array1.length); //2
		System.out.println(array1[0].length); //3 첫번째 행이 가리키는 1차원 배열의 개수
		System.out.println(array1[1].length); //3 두번째 행이 가리키는 1차원 배열의 개수
		System.out.println();

		int[][] array2 = new int[][] { { 1, 2 }, { 3, 4, 5 } };
		System.out.println(array2.length); //2
		System.out.println(array2[0].length); //2 첫번째 행이 가리키는 1차원 배열의 개수
		System.out.println(array2[1].length); //3 두번째 행이 가리키는 1차원 배열의 개수
		System.out.println();

		//#2. 2차원 배열 출력 1: 인덱스로 직접 접근
		System.out.print(array2[0][0] + " ");
		System.out.print(array2[0][1] + " ");
		System.out.println();
		System.out.print(array2[1][0] + " ");
		System.out.print(array2[1][1] + " ");
		System.out.println(array2[1][2]);
		System.out.println();

		//#3. 2차원 배열 출력 2: 이중 for문 (행 i → 열 j 순회)
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		//#4. 2차원 배열 출력 3: for-each 문 (행 → 행 안의 원소 순회)
		// for(꺼낸 하나의 원소를 저장할 수 있는 변수:집합객체) {} for each 구문
		for (int[] array : array2) {
			for (int k : array) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
