package h_useful;

import java.util.Arrays;

public class StringClass {
	
	public static void main(String[] args) {
		/*
		 * equals()		: 문자열을 비교하여 같으면 true 다르면 false를 반환한다.
		 * length()		: 문자열의 길이를 반환한다.
		 * substring()	: 주어진 범위에 해당하는 문자열을 반환한다.
		 * charAt()		: 지정된 위치의 문자를 반환한다.
		 * indexOf()	: 주어진 문자의 위치를 반환한다.
		 * lastIndexOf(): 주어진 문자의 마지막 위치를 반환한다.
		 * replace()	: 문자열 내의 주어진 문자(문자열)를 새로운 문자(문자열)로
		 * 				바꾼 문자열을 반환한다.
		 * replaceAll()	: 문자열 내의 주어진 정규표현식과 일치하는 문자열을 새로운
		 * 				문자열로 바꾼 문자열을 반환한다.
		 * split()		: 문자열을 주어진 정규표현식과 일치하는 문자열로 나누어
		 * 				문자열 배열로 반환한다.
		 * startsWith()	: 주어진 문자열로 시작하는 여부를 반환한다.
		 * endsWith()	: 주어진 문자열로 끝나는지 여부를 반환한다.
		 * toUpperCase(): 문자열을 대문자로 변환한 문자열을 반환한다.
		 * toLowerCase(): 문자열을 소문자로 변환한 문자열을 반환한다.
		 * trim()		: 양끝의 공백을 제거한 문자열을 반환한다.
		 */
		String str = "abc abc  abc";
		System.out.println(str.indexOf("a"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.indexOf("a", 1)); // 몇번 인덱스부터 시작할지를 지정해줄수있다.
		
		System.out.println(str.replace("a", "0")); //어떤문자열을 어떤 문자열로 바꿀지
		System.out.println(str.replaceAll("[a-z]", "0")); //정규표현식 [a-z] [0-9] [A-Z] 등등 으로 찾아 어떠한것으로 바뀔지를 정해줄수있다.
		
		System.out.println(Arrays.toString(str.split(" "))); // 공백을 기준으로 문자열을 나누어 배열로 저장해준다.
		System.out.println(Arrays.toString(str.split(" +"))); // 정규표현식의 하나로 +앞에 있는 문자를 한개이상으로 표현하여 나누어 준다.
		
		System.out.println(str.startsWith("a")); // 주어진 문자로 시작을하는 지 true / false로 표현해준다.
		System.out.println(str.startsWith("b")); // 주어진 문자로 시작을하는 지 true / false로 표현해준다.
		
		System.out.println(str.endsWith("c")); // 주어진 문자로 끝나는지 확인하며 비교후 true / false로 표현해준다.
		System.out.println(str.endsWith("b"));
		
		System.out.println(str.toUpperCase()); // 문자를 대문자로 바꾸어 반환
		System.out.println(str.toUpperCase().toLowerCase()); // 문자를 소문자로 바꾸어 반환
		
		String str2 = " abc abc ";
		System.out.println(str2);
		System.out.println(str2.trim()); // 양 쪽의 공백을 제거 후 출력을 해준다.
		
		
		// 468 ~ 471 까지 입력하기 과제
		
		
		
		
		
		
		
		
		
		
	}

}
