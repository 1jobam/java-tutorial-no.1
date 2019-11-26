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
		System.out.println("** 컴퓨터와 야구게임 하기  ** \n생각 하시는 답을 입력해주시면 \n게임이 시작됩니다...\n1~9까지 중 세가지 수를 입력하세요.");
		int input = Integer.parseInt(s.nextLine());
		

		//st 값에 input 값의 마지막 , ba 값에 

		int count = 0;
		int st = 0, ba = 0, ou = 0;
		
			st = input % 10;
			int d = input / 10;
			ba = d % 10;
			int f = d / 10;
			ou = f % 10;
			
			System.out.println(ou + "," + ba + "," + st);
			
			int zx = 0, as = 0, df = 0;
			
			do{
				count++;
				// 스트라이크 값 구하기
				if(one == ou || two == ba || thr == st) {
					zx = 0;
					zx += 1;
					input = Integer.parseInt(s.nextLine());
				}
				if((one == ou && two == ba) || (one == ou && thr == st) || (two == ba && thr == st)) {
					zx = 0;
					zx += 2;
					input = Integer.parseInt(s.nextLine());
				}
				if(one == ou && two == ba && thr == st) {
					zx = 0;
					zx += 3;
					System.out.println("정답을 맞추셨습니다.");
//					break;
				}
				// 볼 값 구하기
				if(!(one == ou || two == ou || thr == ou || one == ba || two == ba || thr == st || one == st || two == st || thr == st)) {
					as = 0;
					as += 1;
					input = Integer.parseInt(s.nextLine());
				}
				if(!((one == ou && two == ou) || (one == ou && thr == ou) || (two == ba && thr == ou))) {
					as = 0;
					as += 2;
					input = Integer.parseInt(s.nextLine());
				}
				if(!(one == ou && two == ou && thr == ou || one == ba && two == ba && thr == ba || one == st && two == st && thr == st || 
					one == ou && thr == ou && two == ou || one == ba && thr == ba && two == ba || one == st && thr == st && two == st ||
					two == ou && one == ou && thr == ou || two == ba && one == ba && thr == ba || two == st && one == st && thr == st ||
					two == ou && thr == ou && one == ou || two == ba && thr == ba && one == ba || two == st && thr == st && one == st ||
					thr == ou && two == ou && one == ou || thr == ba && two == ba && one == ba || thr == st && two == st && one == st ||
					thr == ou && one == ou && two == ou || thr == ba && one == ba && two == ba || thr == st && one == st && two == st)) {
					as = 0;
					as += 3;
					input = Integer.parseInt(s.nextLine());
				}
				// 아웃 값 구하기
				if(!(one == ou || two == ba || thr == st)) {
					df = 0;
					df += 1;
					input = Integer.parseInt(s.nextLine());
				}
				if(!(one == ou && two == ba) || !(one == ou && thr == st) || !(two == ba && thr == st)) {
					df = 0;
					df += 2;
					input = Integer.parseInt(s.nextLine());
				}
				if(!(one == ou && two == ba && thr == st)) {
					df = 0;
					df += 3;
					input = Integer.parseInt(s.nextLine());
				}
				System.out.println("스트라이크 :" + zx + "\t" +"볼 :" + as + "\t" + "아웃 :" + df);
				System.out.println("현재까지 시도한 횟수 : " + count);
			}while(input == one && input == two && input == thr);
		
	}

}
