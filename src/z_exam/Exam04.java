package z_exam;

public class Exam04 {

	public static void main(String[] args) {
		/*
		 * 4 - 9 , 4 - 12 , 4 - 13 제외
		 */
		
		
		
/*		[4-1] 다음의 문장들을 조건식으로 표현하라.
		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x = 15;
			if(x > 10 && x < 20){
			System.out.println("int x가 10보다 크고 20보다 작을 때 표시");
		}
		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch = '\u0000';
			if(ch != ' ' && ch != '\u0000'){
			System.out.println("공백이나 탭이 아닐때 표시");
		}
		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		char ch = 'x';
			if(ch == 'x' || ch == 'X'){
			System.out.println("char ch가 x 또는 X 일때 true 일때 표시");
		}
		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
		char ch;
		ch = '1';
			if('0' <= ch && ch <= '9'){
			System.out.println("ch가 0 ~ 9 일때 true");
		}
		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		char ch;
		ch = 'd';
			if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')){
			System.out.println("ch가 영문자(대문자 또는 소문자)일때 표시");
		}
		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
		않을 때 true인 조건식
		int year = 300;
			if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
			System.out.println("int형 변수 year가 400으로 나눠 떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을때 표시");
		}

		7. boolean형 변수 powerOn가 false일 때 true인 조건식
		boolean powerOn = false;
			if(powerOn == false){
			System.out.println("powerOn이 fase일 때 true이면 표시");
		}
		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
		String str = "yes";
		if(str.equals("yes")){
			System.out.println("str이 yes일때 true이면 표시");
		}
		*/

		
		
		/*[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.*/
//		int a = 0;
//		for(int b = 0; b <= 20; b++){
//			if(b % 2 != 0 && b % 3 != 0){
//				a += b;
//			}
//		}
//			System.out.println("2 또는 3의 배수가 아닌 수의 총합 = " + a);
		
		
		/*[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.*/
//		int a = 0;
//		for(int b = 1; b <= 10; b++){
//			for(int c = 1; c <= b; c++){
//				a += c;
//			}
//		}System.out.println(a);
		
		
		
		
		/*[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
		100이상이 되는지 구하시오.*/
//		int a = 0;
//		int b = 0;
//		
//		while(a<100){
//			++b;
//			if(b % 2 == 0) a -= b;
//			else a += b;
//			System.out.println(a);
//		}
//		System.out.println(b + "일 때, 총합이 " + a + "이 된다.");
		
		
		
/*		[4-5] 다음의 for문을 while문으로 변경하시오.
		[연습문제]/ch4/Exercise4_5.java
		public class Exercise4_5 {
		public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
		for(int j=0; j<=i; j++)
//		System.out.print("*");
//		System.out.println();
		}
		} // end of main
		} // end of class
		*/		
		

//		int i = 0;
//		while((i++) !=11){
//			int a = i;
//			while((a--)!=0){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
/*		[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
		로그램을 작성하시오.*/
//		int c = 0;
//		for(int a = 1; a <= 6; a++){
//			for(int b = 1; b <= 6; b++){
//				if((a + b) == 6){
//					System.out.println("첫번째 주사위 = " + a + "두번째 주사위 = " + b);	
//				}
//			}
//		}
		
		
		
/*		[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
		코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
		[연습문제]/ch4/Exercise4_7.java
		class Exercise4_7 {
		public static void main(String[] args) {
		int value = (  (1)  );
		System.out.println("value:"+value);
		}
		}*/
		
//		int value = (int)(Math.random()*6)+1;
//		System.out.println("value : " + value);
		
		
		
/*		[4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
		0<=x<=10, 0<=y<=10 이다.*/
//		for(int x = 1; x <= 10; x++){
//			for(int y = 0; y <= 10; y++){
//				if((2 * x) + (4 * y) == 10){
//					System.out.println("x = " + x + "y =" + y);
//				}				
//			}
//		}
			
//		[실행결과]
//		x=1, y=2
//		x=3, y=1
//		x=5, y=0*/
		
/*		[4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
		완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1)
		에 알맞은 코드를 넣으시오.
		[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
		[연습문제]/ch4/Exercise4_10.java
		class Exercise4_10 {
		public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		
		
		System.out.println("sum="+sum);
		}
		}*/
		
//		int num = 12345;
//		int sum = 0;
//		
//		while(num > 0){
//			
//			sum += num % 10;
//			num /= 10;
//			System.out.println("num =" + num);
//		}
//		
//		
//		System.out.println("sum="+sum);
		
//		[실행결과]
//		15

		
		
/*		[4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가
		는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는
		1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터
		시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
		[연습문제]/ch4/Exercise4_11.java
		public class Exercise4_11 {
		public static void main(String[] args) {
		// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1+","+num2);
		for (int i = 0 ; i < 8 ; i++ ) {
		
		(1) 알맞은 코드를 넣어 완성하시오.
		
		}
		} // end of main
		} // end of class

		[실행결과]
		1,1,2,3,5,8,13,21,34,55*/
		
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0; // 세번째 값
//		System.out.print(num1+","+num2);
//		for (int i = 0 ; i < 4 ; i++ ) {
//			num3 = num1 + num2;
//			num1 = num3;
//			num2 = num3 + num2;
//			System.out.println("," + num1 + "," + num2);
//		}

		
		
		
		
/*		[4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력
		해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자
		신이 생각한 값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면
		게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프
		로그램을 완성하시오.
		[연습문제]/ch4/Exercise4_14.java
		class Exercise4_14
		{
		public static void main(String[] args)
		{
		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer =  (1) ;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
		count++;
		System.out.print("1과 100사이의 값을 입력하세요 :");
		input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
		
		(2) 알맞은 코드를 넣어 완성하시오.
		
		} while(true); // 무한반복문
		} // end of main
		} // end of class HighLow
		[실행결과]
		1과 100사이의 값을 입력하세요 :50
		더 큰 수를 입력하세요.
		1과 100사이의 값을 입력하세요 :75
		더 큰 수를 입력하세요.
		1과 100사이의 값을 입력하세요 :87
		더 작은 수를 입력하세요.
		1과 100사이의 값을 입력하세요 :80
		더 작은 수를 입력하세요.
		1과 100사이의 값을 입력하세요 :77
		더 작은 수를 입력하세요.
		1과 100사이의 값을 입력하세요 :76
		맞췄습니다.
		시도횟수는 6번입니다.*/
		
//		int answer = (int)(Math.random()*100)+1 ;
//		int input = 0; // 사용자입력을 저장할 공간
//		int count = 0; // 시도횟수를 세기위한 변수
//		// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
//		java.util.Scanner s = new java.util.Scanner(System.in);
//		do {
//		count++;
//		System.out.print("1과 100사이의 값을 입력하세요 :");
//		input = Integer.parseInt(s.nextLine()); // 입력받은 값을 변수 input에 저장한다.
//			System.out.println(count + "번 시도 하셨습니다.");
//		if(answer < input){
//			System.out.println(input + "보다 작습니다.");
//		}else if(answer > input){
//			System.out.println(input + "보다 큽니다.");
//		}else{
//			System.out.println("정답 입니다.!!");
//		}
//		} while(input != answer); // 무한반복문

		
		
		
		
/*		[4-15] 다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽
		어도 앞으로 읽는 것과 같은 수를 말한다. 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한
		다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		[Hint] 나머지 연산자를 이용하시오.
		[연습문제]/ch4/Exercise4_15.java
		class Exercise4_15
		{
		public static void main(String[] args)
		{
		int number = 12321;
		int tmp = number;
		int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
		while(tmp !=0) {
		
		(1) 알맞은 코드를 넣어 완성하시오.
		
		}
		if(number == result)
		System.out.println( number + "는 회문수 입니다.");
		else
		System.out.println( number + "는 회문수가 아닙니다.");
		} // main
		}
		[실행결과]
		12321는 회문수 입니다.*/
		
//		int number = 12321;
//		int tmp = number;
//		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
//			while(tmp > 0) {
//				result = result * 10 + tmp % 10;
//				tmp = tmp % 10;
//				System.out.println(result);
//			}
//			if(number == result)
//				System.out.println( number + "는 회문수 입니다.");
//			else
//				System.out.println( number + "는 회문수가 아닙니다.");
		
	}

}