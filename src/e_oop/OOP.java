package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * << OOP(Object Oriented Programming) : 객체지향 프로그래밍 >>
		 * - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * << 객체 생성(인스턴스화) >>
		 * - 클래스를 사용하기 위해 메모리 (heap 영역)에 올려놓은 것.
		 * - new 클래스명(); -> 객체가 저장된 메모리 주소 반환.
		 * - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 * - 객체는 생성될때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 */
		
		SampleClass sc = new SampleClass();
		
		sc.method1();
		
		sc.method2(5);
		
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);

		
		//test1() 호출시 출력되는 문장에 번호를 붙여주세요.
		sc.test1();
		
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		ClassMaker cm = new ClassMaker();
		//객체가 저장된 변수를 통해 메서드들을 호출해주세요.
		//파라미터가 있는 메서드는 타입이 맞는 값을 넘겨주시고,
		//리턴타입이 있는 메서드는 리턴받은 값을 출력해주세요.
		String a = cm.qwe();
		System.out.println(a);
		cm.asd();
		cm.zxc("asd ");
		int gg = cm.gogo(3, 1234);
		System.out.println(gg);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ구분라인ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		//5개의 산술연산을 각각 수행하는 5개의 메서드를 만들어주세요.
		//각 메서드는 2개의 파라미터를 받아 연산결과를 리턴해주세요.
		//계산기 활용하기
		Calculator as = new Calculator();
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		double ps = as.plus(123456, 654321);
		System.out.println(ps);

		double my = as.multiply(ps, 123456);
		System.out.println(my);

		double de = as.divide(my, 123456);
		System.out.println(de);

		double ms = as.minus(de, 654321);
		System.out.println(ms);

		double rr = as.remainder(ms, 123456);
		System.out.println(rr);
		
		
		//요런 방식도 있습니다.
		double result = as.plus(123456, 654321);
		result = as.multiply(result, 123456);
		result = as.divide(result, 123456);
		result = as.minus(result, 654321);
		result = as.remainder(result, 123456);
		System.out.println((int)result);
		
	}

}
















