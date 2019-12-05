package e_oop;

import java.util.*;

public class SimLiTest {
	
	public static void main(String[] args){
		new SimLiTest().question1();
	}
	
	String[] questions = {
			"나는 금사빠다.(y/n)",
			"연애할 때 끌려다니는 타입이다.(y/n)",
			"데이트 코스는 미리 짜는게 편하다.(y/n)",
			"감정기복이 크지 않다.(y/n)",
			"감정 표현에 솔직한 편이다.(y/n)",
			"활동적인 데이트가 좋다.(y/n)",
			"연락이 없어도 믿고 기다리는 편이다.(y/n)",
			"이성친구는 존재할 수 없다.(y/n)",
			"아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.(y/n)"
	};
	
	String[] result = {
			"당신의 타입은 A형 타입 입니다. (서로에 대한 신뢰감이 깊고 존중해주는 어른스러운 연애를 하는 타입!)",
			"당신의 타입은 B형 타입 입니다. (구속을 하는 것도 받는 것도 싫은 자유로운 연애를 하는 타입!)",
			"당신의 타입은 C형 타입 입니다. (이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!)",
			"당신의 타입은 D형 타입 입니다. (무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!)"
	};
	
	Scanner s = new Scanner(System.in);
	
	void question1(){
		System.out.println(questions[0]);
		String input = s.nextLine();
		if(input.equals("y")){
			question2();
		}else if(input.equals("n")){
			question3();
		}
		
	}
	
	void question2(){
		System.out.println(questions[1]);
		String input = s.nextLine();
		if(input.equals("y")){
			question5();
		}else if(input.equals("n")){
			question3();
		}
		
	}
	
	void question3(){
		System.out.println(questions[2]);
		String input = s.nextLine();
		if(input.equals("y")){
			question6();
		}else if(input.equals("n")){
			question5();
		}
	}
	
	void question4(){
		System.out.println(questions[3]);
		String input = s.nextLine();
		if(input.equals("y")){
			question7();
		}else if(input.equals("n")){
			question5();
		}
	}
	
	void question5(){
		System.out.println(questions[4]);
		String input = s.nextLine();
		if(input.equals("y")){
			question8();
		}else if(input.equals("n")){
			question6();
		}
	}
	
	void question6(){
		System.out.println(questions[5]);
		String input = s.nextLine();
		if(input.equals("y")){
			question8();
		}else if(input.equals("n")){
			question9();
		}
	}
	
	void question7(){
		System.out.println(questions[6]);
		String input = s.nextLine();
		if(input.equals("y")){
			System.out.println(result[0]);
		}else if(input.equals("n")){
			question8();
		}
	}
	
	void question8(){
		System.out.println(questions[7]);
		String input = s.nextLine();
		if(input.equals("y")){
			question9();
		}else if(input.equals("n")){
			System.out.println(result[1]);
		}
	}
	
	void question9(){
		System.out.println(questions[8]);
		String input = s.nextLine();
		if(input.equals("y")){
			System.out.println(result[3]);
		}else if(input.equals("n")){
			System.out.println(result[2]);
		}
	}
}
