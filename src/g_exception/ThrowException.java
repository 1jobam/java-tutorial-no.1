package g_exception;

import java.io.IOError;
import java.io.IOException;

public class ThrowException {
	
	public static void main(String[] args) {
		/*
		 * << 예외 발생 시키기 >>
		 * - throw new Exception();
		 * - thrown 키워드와 예외 클래스의 객체로 예외를 고의로 발생시킬 수 있다.
		 */
		
		//Exception 클래스의 자식
		IOException ioe = new IOException(); 
		
		try {
			throw ioe;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//RuntimeException 클래스의 자식
		throw new NullPointerException(); //예외처리가 강제되지 않는다.
		
	}

}
