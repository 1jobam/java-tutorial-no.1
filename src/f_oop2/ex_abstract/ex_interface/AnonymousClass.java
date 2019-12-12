package f_oop2.ex_abstract.ex_interface;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {
	
	public static void main(String[] args) {
		//하나의 부모 클래스나 인터페이스를 상속받아 클래스를 선언함과 동시에 --선언과 동시에 상속받아 사용되는 위치에서만 사용이가능하다. 그래서 이름이 없다.
		//객체를 생성하는 클래스
		Button b = new Button();
		
		b.addActionListener(new ActionListener(){
			//ActionListener를 상속받은 자식 클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 누르면 실행");
				
			}
		});
	}

}
