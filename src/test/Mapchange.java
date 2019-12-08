package test;

import java.util.Scanner;

public class Mapchange {

	void Map() {
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
	System.out.println("		  - " + "미구현" + " -");
	for(int i = 1; i < 50; i++) {
		System.out.print("-");
	}
	System.out.println();
	System.out.println("현재 맵변경은 미구현 입니다.");
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
}
