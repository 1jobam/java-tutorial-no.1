package c_statement;

import java.util.Scanner;

public class ALoveTest {

	public static void main(String[] args) {
		
		// && m == "YES" && m == "Yes" && m == "YEs" && m == "yES" && m == "yeS"
		// && m == "NO" && m == "No" && m == "nO"
//		System.out.println("나의 연애 유형 테스트를 시작하겠습니다. \n답변은 항상 YES or NO로 하세요.");
		
		Scanner s = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요 >");
		String a = s.nextLine();
		System.out.println(a);
		
		if(a == "yes"){
			System.out.println("당신");
		}else if(a == "no"){
			System.out.println("아니");
		}else{
			System.out.println("오키");
		}
	}
}
