package b_operator;

public class Etc {

	public static void main(String[] args) {
		/*
		 * << 비트 연산자 >>
		 * - |(OR)	: 피연산자 중 한 쪽이라도 값이 1이면, 1을 그외는 0을 결과로 얻는다.
		 * - &(AND) : 피연산자 양 쪽이 모두 1이어야만 1을 그외는 0을 결과로 얻는다.
		 * - ^(XOR) : 피연산자의 값이 서로 다를 때만 1을 같을때는 0을 결과로 얻는다.
		 * - ~(비트전환) : 피연산자를 0은 1로 1은 0으로 바꾼다.
		 * - <<(쉬프트) : 피연산자의 각 자리를 왼쪽으로 이동시킨다. 빈칸은 0으로 채운다.
		 * - >>(쉬프트) : 피연산자의 각 자리를 오른쪽으로 이동시킨다. 빈칸은 앞자리와 동일한 값으로 채운다.
		 * 
		 * << 기타 연산자 >>
		 * - .(참조연산자) : 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다. -- 어떤한 것 안에 들어있을때 .을 사용하여 참조
		 * - (type)	: 형변환(casting)
		 * - ?:(삼항연산자)	조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장 :
		 * - instanceof : 참조형 타입 확인
		 */
		
		//1바이트는 8비트로 이루어져 있고 1비트는 0 또는 1을 표현할 수 있다.
		//즉, 1바이트는 8개의 0 또는 1 을 표현할 수 있다.
		
		/*
		 * - 10진수 -> 2진수 : 10진수 값을 1이 될 때 까지 나눈다.
		 * 10 / 2
		 * 5 % 0
		 * 2 % 1
		 * 1 % 0
		 * -> 1010 //10진수를 2진수로 표현한것.
		 * 
		 * 15를 2진수로 만들어주세요.
		 * 15 / 2
		 * 7 % 1
		 * 3 / 1
		 * 1 / 1
		 * -> 1111
		 * 
		 * - 2진수 -> 10진수 : 각 자리에 1, 2, 4, 8, 16, 32...를 곱한값을 더한다.
		 * 1 0 1 0
		 * 8 4 2 1
		 * 8+0+2+0 = 10
		 * 
		 * 1 1 1 1을 10진수로 만들어 주세요.
		 * 8 4 2 1
		 * 8+4+2+1 = 15
		 */
		//00001010 : 10 -- 1byte로 계산시 앞에 0 4개 추가
		//00001111 : 15 -- 1byte로 계산시
		
		//| : 00001111
		System.out.println(10 | 15);
		//& : 00001010
		System.out.println(10 & 15);
		//^ : 00000101
		System.out.println(10 ^ 15);
		//~ : 11110101
		System.out.println(~10);
		//<< : 00010100
		System.out.println(10 << 1);
		//>> : 00000101
		System.out.println(10 >> 1);
		
		int x = 10;
		int y = 20;
		int result = x < y ? x : y;
		//true : int result = x;
		//false : int result = y;
		System.out.println(result);
		
		int score = 50;
		String res = 60 <= score ? "합격" : "불합격";
		//시험점수가 60점 이상이면 합격 미만이면 불합격
		System.out.println(score + "점은 " + res + " 입니다.");
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 3; //주민등록번호 첫자리
		String gender = regNo == 1 ? "남자" : "여자";
		System.out.println("당신의 설병은 ☆" + gender + "☆ 입니다.");
		
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가");
		System.out.println("당신의 설병은  ○" + gender + "○ 입니다.");
		
		//두개의 변수에 저장된 수 중에 큰 숫자를 출력해주세요.
		int nu1 = 7;
		int nu2 = 5;
		int nu3 = nu1 > nu2 ? nu1 : nu2;
		System.out.println("두개의 리터널중 더 큰 숫자를 출력해 주세요. 답은: " + nu3 + "입니다." );
		
		//변수에 저장된 수의 절대값을 출력해주세요.
		int re = -5;
		int max = 0 <= re ? re : -1 * re;
		System.out.println(max);
		
		//변수에 저장된 주민등록번호 뒷자리의 첫번째 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		//그외의 숫자는 확인불가를 출력해주세요.
		int m = 5;
		String gen = m == 1 ? "남자" : (m == 3 ? "남자" : (m == 2 ? "여자" : (m == 4 ? "여자" : "확인불가")));
		System.out.println("당신의 성별은 :" + gen + " 입니다.");
		int w = 3;
		String ds = w == 1 || w == 3 ? "남자" : (w == 2 || w == 4 ? "여자" : "확인불가");
		System.out.println(ds);
	}

}