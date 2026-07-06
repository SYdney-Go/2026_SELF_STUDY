package sec02_string.EX06_MethodsOfString_2;

/*String 클래스의 주요 메서드2*/

import java.util.Arrays;

public class MethodsOfString_2 {
	public static void main(String[] args) {
		//#5. 문자열 수정 (원본은 그대로, 변경된 새 String 객체 반환)
		//@toLowerCase() — 모든 문자를 소문자로 변환
		//@toUpperCase() — 모든 문자를 대문자로 변환
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase()); //java study
		System.out.println(str1.toUpperCase()); //JAVA STUDY

		//@replace() — 지정 문자열을 다른 문자열로 치환
		System.out.println(str1.replace("Study", "공부")); //Java 공부

		//@substring() — begin ~ end-1 범위만 잘라내기
		System.out.println(str1.substring(0, 5)); //Java

		//@split() — 정규식 구분자로 나눠 String 배열 반환
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray)); //[abc, def, ghi, jkl]

		//@trim() — 앞뒤 공백 제거
		System.out.println("   abc   ".trim());

		System.out.println();

		//#6. 문자열의 내용 비교 (equals(), equalsIgnoreCase())
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");

		//@== — 같은 객체(메모리 주소)인지 비교
		System.out.println(str2 == str3); //false
		System.out.println(str3 == str4); //false
		System.out.println(str4 == str2); //false

		//@equals() — 문자열 내용이 같은지 비교 (대소문자 구분)
		//@equalsIgnoreCase() — 내용 비교 (대소문자 무시)
		System.out.println(str2.equals(str3)); //true
		System.out.println(str3.equals(str4)); //false
		System.out.println(str3.equalsIgnoreCase(str4)); //true
	}
}
