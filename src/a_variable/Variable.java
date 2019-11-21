package a_variable;

public class Variable {

	public static void main(String[] args) {
		/*
		 * << 변수 >>>
		 * - 하나의 데이터를 저장할 수 있는 메모리상의 공간
		 * 
		 * << 사용 가능한 기본형 데이터의 종류 >>
		 * - 정수 : byte, short, int, long
		 * - 실수 : float, double
		 * - 문자 : char
		 * - 논리 : boolean
		 * - 1byte = byte,boolean
		 * - 2byte = short, char
		 * - 4byte = int, float
		 * - 8byte = long, double
		 * 
		 * - byte는 8개의 bit로 이루어져 있다.
		 * - 데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지,
		 *   그것의 이름이 무엇인지 알려줘야 한다.
		 * - 명명규칙은 자바의정석 25~26쪽 참조
		 */
		
		//변수 선언 방법 : 데이터 타입 + 변수 이름		
		//byte abc;
		//char moonja;
		
		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		boolean h;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
		//System.out.println(a); //컴파일 에러 발생(문법이 틀렸다)
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
		
		//=(대입 연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
		a = 127; //타입에 맞는 값을 저장해야 한다.
		b = 30000;
		c = 20;
		d = 900L; // long 접미사 : L
		e = 3.14f; // float 접미사 : f
		f = 3.14; // double 접미사 : d(생략가능)
		g = '가';
		h = true; // boolean 타입은 true , false (두개)
		//초기화 : 변수에 처음으로 값을 저장하는 것.
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(a+b+c+d+e+f+g);
		//ctrl + f11 : 프로그램 실행
		//f11 : 디버그 모드 실행 (원하는 지점에서 한줄씩 검사하여 실행)
		
		c = 30;
		System.out.println(c);
		c = 30 + 40;
		System.out.println(c);
		c = b;
		System.out.println(c);
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
		
		a = 63;
		b = a;
		c = 10;
		d = 450L;
		e = 1.57f;
		f = 1.57;
		g = '나';
		h = false;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		 
		String _String = new String("abcd");
		System.out.println(_String);
		_String = "1234";
		System.out.println(_String);
		
		/*
		 * << 리터럴의 종류 >>
		 * 숫자 : 0, 10. -5, 3.14
		 * 문자 : '가', 'a', '0', ' '
		 * 문자열 : "가나다", "abc", "123", " ", ""
		 * 그외 : true, false, null(값이 없다)
		 * 
		 * << 참조형 타입 >>
		 * - 기본형 타입을 제외한 모든 테이터 타입(배열, 클래스)
		 * - ex) String, ABC, Variable
		 * - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * - 변수의 크기는 4byte 이다.
		 */
		
		//기본값 : 전역 변수에 아무것도 저장하지 않았을때 저장되어 있는 값
		a = 0;
		b = 0;
		c = 0;
		d = 0L;
		e = 0.0f;
		f = 0.0;
		g = '\u0000'; //' ' 공백 유니코드 16진수 
		h = false;
		_String = null;
		
		
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		a = 127;
		c = 128;
		a = (byte)c; //형변환 : 데이터 타입을 변환하는 것
		System.out.println(a); //128 -> -128 (오버플로우)
		
		a = -128;
		c = -129;
		a = (byte)c;
		System.out.println(a); // -129 -> 127 (언더플로우)
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다.
		
		//double 타입에서 int 타입으로 형변환 해서 출력 해주세요.
		f = 3.14123;
		c = (int)f;
		System.out.println(c); //int는 소수점을 표현할수 없으므로 소수점이 손실된다.
		
		//표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다.
		//그러므로 형변환을 생략할 수 있다.
		c = a;
		d = c;
		f = c;
		f = e;
		
		/*
		 * << 상수 >>
		 * - 값을 한번 저장하면 변경할 수 없는 저장공간
		 * - final int MAX_NUMBER = 10;
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 */
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
		//MAX_NUMBER = 100; // 상수로 지정한 값을 변경하려 하니 컴파일 에러 발생
		
		System.out.println(MAX_NUMBER);
		
		String QW = new String("123");
		System.out.println(QW);
		QW = "1234";
		System.out.println(QW);
	}
}