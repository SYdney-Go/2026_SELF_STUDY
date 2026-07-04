package sec02_string.EX05_MethodsOfString_1;

/*String 클래스의 주요 메서드1*/

import java.util.Arrays;

public class MethodsOfString_1 {
	public static void main(String[] args) {
		//#1. 문자열길이 (length()) — 문자 개수 반환
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		System.out.println(str1.length()); //11
		System.out.println(str2.length()); //13
		System.out.println();

		//#2. 문자열 검색 (charAt(), indexOf(), lastIndexOf())
		//@charAt() — index 위치의 문자 1개 반환
		System.out.println(str1.charAt(1)); //e
		System.out.println(str2.charAt(1)); //녕
		System.out.println();

		//@indexOf() — 앞에서부터 찾기 (첫 등장 위치, 없으면 -1)
		//@lastIndexOf() — 뒤에서부터 찾기 (마지막 등장 위치, 없으면 -1)
		System.out.println(str1.indexOf('a')); //7
		System.out.println(str1.lastIndexOf('a')); //9
		System.out.println(str1.indexOf('a', 8)); //9 — 8번 인덱스부터 앞방향 검색
		System.out.println(str1.lastIndexOf('a', 8)); //7 — 8번 인덱스까지 역방향 검색
		System.out.println(str1.indexOf("Java")); //6
		System.out.println(str1.lastIndexOf("Java")); //6
		System.out.println(str2.indexOf("하세요")); //2
		System.out.println(str2.lastIndexOf("하세요")); //2
		System.out.println(str1.indexOf("Bye")); //-1
		System.out.println(str2.lastIndexOf("고맙습니다.")); //-1
		System.out.println();

		//#3. 문자열 변환 및 연결 (String.valueOf(), concat())
		//@String.valueOf() — 기본자료형을 String으로 변환
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);

		//@concat() — 뒤에 다른 문자열을 이어 붙임
		String str5 = str3.concat(str4);
		System.out.println(str5);

		// valueOf() + concat() 은 "+" 연산과 같은 결과
		String str6 = "안녕" + 3; //안녕3
		String str7 = "안녕".concat(String.valueOf(3)); //안녕3
		System.out.println(str6);
		System.out.println(str7);
		System.out.println();

		//#4. 문자열 → byte[] (getBytes()), 문자열 → char[] (toCharArray())
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";

		//@getBytes() — 문자열을 byte 배열로 변환
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

		//@toCharArray() — 문자열을 char 배열로 변환 (문자 단위)
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
	}
}
