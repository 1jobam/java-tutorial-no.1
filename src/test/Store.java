package test;

import java.util.*;

public class Store {

	Scanner s = new Scanner(System.in);
	
	String[] cho = {"물약 상점", "무기 상점", "방어구 상점"};
	
	String pot = "기본 HP물약";
	int hpPotion = 100;
	String sod = "기본 검";
	int gg = 500;
	String def = "기본 방패";
	int dd = 400;
	
	
	//전체 상점중 선택
	void select() {

		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("상점에 오신걸 환영 합니다. \n 원하시는 상점을 선택하여 주세요.");
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("1. "+ cho[0] + " 으로 이동하기");
		System.out.println("2. "+ cho[1] + " 으로 이동하기");
		System.out.println("3. "+ cho[2] + " 으로 이동하기");
		System.out.println("4. 메인화면으로 돌아가기");
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		
		int mov = Integer.parseInt(s.nextLine());
		
		if(mov == 1) {
			liquid();
		}else if(mov == 2) {
			weapon();
		}else if(mov == 3) {
			armor();
		}else if(mov == 4) {
			LottoRpg ab = new LottoRpg();
			ab.main();
		}
	}
	
	//물약상점
	void liquid() {
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println(cho[0] + " 입니다.");
		System.out.println(pot + "의 효과는 HP + 10 증가 입니다.");
		System.out.println("현재는 " + pot + " 만을 판매 중입니다. \n가격은" + hpPotion + "입니다.");
		System.out.println("1. 구매하기");
		System.out.println("2. 취소하기");
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		int number = Integer.parseInt(s.nextLine());
		if(number == 1) {
			LottoRpg pp = new LottoRpg();
			pp.coin-= 50;
			pp.hp+= 20;
			System.out.println("구매 감사드립니다.");
			pp.main();
		}else if(number == 2) {
			select();
		}
	}
	
	//무기상점
	void weapon() {
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println(cho[1] + " 입니다.");
		System.out.println(sod + " 의 효과는 공격력  + 10 증가 입니다.");
		System.out.println("현재는 " + sod + " 만을 판매 중입니다. \n가격은 500원 입니다.");
		System.out.println("1. 구매하기");
		System.out.println("2. 취소하기");
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		int number = Integer.parseInt(s.nextLine());
		if(number == 1) {
			LottoRpg pp = new LottoRpg();
			pp.coin -= 500;
			pp.damage += 10;
			System.out.println("구매 감사드립니다.");
			pp.main();
		}else if(number == 2) {
			select();
		}
	}
	
	//방어구상점
	void armor() {
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println(cho[2] + " 입니다.");
		System.out.println(def + "는 방어력 + 5 입니다.");
		System.out.println("현재는" + def + "을 판매 중입니다. \n가격은 400원 입니다.");
		System.out.println("1. 구매하기");
		System.out.println("2. 취소하기");
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		int number = Integer.parseInt(s.nextLine());
		if(number == 1) {
			LottoRpg pp = new LottoRpg();
			pp.coin -= 400;
			pp.defense += 5;
			System.out.println("구매 감사드립니다.");
			pp.main();
		}else if(number == 2) {
			select();
		}
	}
	
}
