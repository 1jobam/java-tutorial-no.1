package f_oop2.test;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier {
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		System.out.println(am.publicVar);
		am.publicMethod();
		 
//		System.out.println(am.protetedVar); //같은 패키지 또는 상속 받은 클래스에서 사용이 가능하다
//		am.protectedMethod();
//		
//		System.out.println(am.defaultVar);
//		am.defaultMethod();
//		
//		System.out.println(am.privateVar);
//		am.privateMethod();
		
		AccessTest an = new AccessTest();  //단 protected 는 상속을 받은 클래스의 객체로 생성을 해줘야 사용이 가능하다.
		System.out.println(an.protectedVar);
		an.protectedMethod();
		
	}

}
