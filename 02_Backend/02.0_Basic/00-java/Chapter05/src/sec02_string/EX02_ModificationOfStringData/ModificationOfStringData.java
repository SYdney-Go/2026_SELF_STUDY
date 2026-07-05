package sec02_string.EX02_ModificationOfStringData;

/*String 객체의 문자열 수정 및 다른 참조자료형과의 비교*/

import java.util.Arrays;

public class ModificationOfStringData {
	public static void main(String[] args) {
		//#1. 문자열 수정 (객체내의 내용변경 불가 --> 새로운 객체 생성)
		String str1 = new String("안녕"); // str1 → "안녕" 객체
		String str2 = str1; // str2도 같은 "안녕" 객체를 가리킴

		str1 = "안녕하세요"; // "안녕" 내용을 바꾸는 게 아니라, str1이 "안녕하세요" 새 객체를 가리키도록 바뀜

		System.out.println(str1); //안녕하세요 (13번 줄 이후 str1이 가리키는 새 객체)
		System.out.println(str2); //안녕 (10번 줄 때 str1과 같던 "안녕" 객체는 그대로)

		//#2. 배열 참조자료형 (같은 배열을 가리키면, 한쪽에서 수정하면 둘 다 바뀜)
		int[] array1 = new int[] { 3, 4, 5 };
		int[] array2 = array1;
		array1[0] = 6;
		array1[1] = 7;
		array1[2] = 8;

		System.out.println(Arrays.toString(array1)); //[6, 7, 8]
		System.out.println(Arrays.toString(array2)); //[6, 7, 8]
	}
}
