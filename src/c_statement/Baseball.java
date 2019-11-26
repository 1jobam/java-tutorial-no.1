package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		//숫자 야구 게임을 만들어주세요.
		
		//랜덤 숫자 3가지 뽑기
		int one, two, thr;
		
		one = (int)(Math.random() * 9) + 1;
		do{
		two = (int)(Math.random() * 9) + 1;
		}while(one == two);
		do{
		thr = (int)(Math.random() * 9) + 1;
		}while(one == thr || two == thr);
		System.out.println("컴퓨터가 뽑은 숫자" + one + two + thr);
		
		Scanner s = new Scanner(System.in);
		System.out.println("** 컴퓨터와 야구게임 하기  ** \n생각 하시는 답을 입력해주시면 \n게임이 시작됩니다...");
		
		int count = 0;
		
		//입력하기
		
		int input = Integer.parseInt(s.nextLine());

		//S값 , B값, O값 담기
		int st = 0, ba = 0, ou = 0;
		
			st = input % 10;
			int d = input / 10;
			ba = d % 10;
			int f = d / 10;
			ou = f % 10;
			
			System.out.println(st + "," + ba + "," + ou);
			
			int zx = 0, as = 0, df = 0;
			
			do{
				count++;
				if(one == ou){
					zx++;
					System.out.println(zx);
				}
				
			}while(one == ou && two == ba && thr == st);
			
			System.out.println("현재까지 시도한 횟수 : " + count);
			

		// 각 자리 비교하기
		
	}

}
