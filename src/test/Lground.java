package test;

import java.util.*;

public class Lground {
	
	Scanner s = new Scanner(System.in);
	
	//유저 로또번호
	int[] userlotto = new int[3];
	int[] userbonus = new int[1];

	//로또 번호
	int[] mlotto = new int[3];
	int[] mbonus = new int[1];
	
	//대전 사냥터 구현
	static void mon() {
		Scanner s = new Scanner(System.in);
		
		LottoRpg a = new LottoRpg();
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("		  - " + a.maps[0] + " 사냥터 -");
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("현재 사냥터는 미구현 입니다.");
		System.out.println("1. 메인화면으로 이동하기");
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		int mov = Integer.parseInt(s.nextLine());
		if(mov == 1) {
			new LottoRpg();
			LottoRpg.main();
		}
	}

	
	//유저 로또 번호 출력
	void UserLotto(){
		for(int i = 0; i < userlotto.length; i++) {
			int userrandom = (int)(Math.random() * 15) + 1;
			userlotto[i] = userrandom;
			for(int j = 0; j < i; j++){
				if(userlotto[i] == userlotto[j]) {
					i--;
				}
			}
		}
		for(int i = 0; i < userbonus.length; i++) {
			int bonusrandom = (int)(Math.random() * 15) + 1;
			userbonus[i] = bonusrandom;
		}
		System.out.println("당신의 로또 번호는 " + userlotto[0] + "," + userlotto[1] + "," + userlotto[2]);
		System.out.println(userbonus[0]);
	}
	
	//매 턴 로또 번호 출력
	void LottoRandom(){
		for(int i = 0; i < mlotto.length; i++){
			int lottorandom = (int)(Math.random() * 15) + 1;
			mlotto[i] = lottorandom;
			for(int j = 0; j < i; j++){
				if(mlotto[i] == mlotto[j]){
				i--;
				}
			}
		}
		System.out.println("이번 턴의 추첨 로또 번호는 " + mlotto[0] + "," + mlotto[1] + "," + mlotto[2] + " 입니다.");
	}
	
	
}
