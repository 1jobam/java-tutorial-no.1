package test;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		
		
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 맞추기 게임을 시작하시겠습니까?");
		do {	
		count++;
		
		input = Integer.parseInt(s.nextLine());	
		
		System.out.println("현재까지" + count + "만큼 시도 하였습니다.");
		if(input < answer) {
			System.out.println(input + "보다 업");
		}else if(input > answer) {
			System.out.println(input + "보다 다운");
		}else {
			System.out.println("승리 하셨습니다.");
		}
			
		}while(input != answer);
		
		
		
		
		
		
		
	}

}
