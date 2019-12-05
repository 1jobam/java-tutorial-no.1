package e_oop;

import java.lang.reflect.Method;

public class ClassMaker {

	//전역변수 하나를 선언 및 초기화 해주세요.
	String field = "가나다니";
	
	//리턴타입과 파라미터가 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 출력해주세요.
	void asd(){
		System.out.println(field);
	}
	
	//전역변수와 동일한 타입의 리턴타입이 있고 파라미터가 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 리턴해주세요.
	String qwe(){
		System.out.println("너는 전역변수를 return 하자");
		return field;
	}
	
	//리턴타입은 없고 파라미터가 하나 있는 메서드를 만들어주세요.
	//메서드 안에서 파라미터를 출력해주세요.
	void zxc(String parameter){
		System.out.println(parameter + "너는 파라미터 입니다.");
	}
	
	//int타입의 리턴타입과 int타입의 파라미터 두개가 있는 메서드 하나를 만들어주세요.
	//메서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
	
	int gogo(int a , int b){
		System.out.println("곱하고 리턴하자");
		return a * b;
		
	}
	
}
