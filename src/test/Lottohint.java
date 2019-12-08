package test;

import java.util.*;

public class Lottohint {

	Scanner s = new Scanner(System.in);
	
	int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	
	//부여될 능력 배열 구분
	String[] hint = {"없습니다.", 
					 "공격력  + 3 입니다.", 
					 "공력력  + 4 입니다.", 
					 "방어력 + 3 입니다.", 
					 "방어력 + 4 입니다.",
					 "체력 + 5 입니다.",
					 "체력 + 10 입니다.",
					 "체력 - 5 입니다.",
					 "공력력  - 3 입니다.",
					 "공력력  - 4 입니다.",
					 "방어력 - 3 입니다.",
					 "방어력 - 4 입니다."};
	//로또 당첨시 부여될 능력 배열 구분	
	String[] hints = {"모든 능력치를 10배 증가 시킵니다.",
					  "모든 능력치를 5배 증가 시킵니다.",
					  "모든 능력치를 2배 증가 시킵니다.",
					  "모든 능력치를 + 1 증가 시킵니다."};
	
	// 번호별 부여 능력 보기
	void hint() {
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println(num[0] + "번의 능력은 " + hint[0]);
		System.out.println(num[1] + "번의 능력은 " + hint[3]);
		System.out.println(num[2] + "번의 능력은 " + hint[8]);
		System.out.println(num[3] + "번의 능력은 " + hint[9]);
		System.out.println(num[4] + "번의 능력은 " + hint[0]);
		System.out.println(num[5] + "번의 능력은 " + hint[4]);
		System.out.println(num[6] + "번의 능력은 " + hint[6]);
		System.out.println(num[7] + "번의 능력은 " + hint[1]);
		System.out.println(num[8] + "번의 능력은 " + hint[7]);
		System.out.println(num[9] + "번의 능력은 " + hint[0]);
		System.out.println(num[10] + "번의 능력은 " + hint[10]);
		System.out.println(num[11] + "번의 능력은 " + hint[0]);
		System.out.println(num[12] + "번의 능력은 " + hint[5]);
		System.out.println(num[13] + "번의 능력은 " + hint[10]);
		System.out.println(num[14] + "번의 능력은 " + hint[2]);
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("1. 메인화면으로 돌아가기");
		System.out.println("2. 로또 당첨시 능력 확인하기");
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		
		int mov = Integer.parseInt(s.nextLine());
		if(mov == 1) {
			LottoRpg mo = new LottoRpg();
			mo.main();
		}else if(mov == 2) {
			hints();
		}
	}
	
	// 로또 당첨시 부여 능력
	void hints() {
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println(num[0] + "등의 능력은 " + hints[0]);
		System.out.println(num[1] + "등의 능력은 " + hints[1]);
		System.out.println(num[2] + "등의 능력은 " + hints[2]);
		System.out.println(num[3] + "등의 능력은 " + hints[3]);
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("1. 뒤로 돌아가기");
		System.out.println("2. 메인화면으로 돌아가기");
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		
		int mov =  Integer.parseInt(s.nextLine());
		if(mov == 1) {
			hint();
		}else if(mov == 2) {
			LottoRpg pp = new LottoRpg();
			pp.main();
		}
		
	}
	
}
