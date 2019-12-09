package test;

import java.util.*;

public class LottoRpg {

	/* -- 발표 --
	* 프로그램 주제
	* 프로그램 기능
	* 프로그램 메서드 구성
	* 프로그램 시연
	* */
	
	//입력값 만들기
	Scanner s = new Scanner(System.in);
	
	//사용자 인터페이스 설정
	boolean start;
	static String name;
	public int level;
	int hp;
	int damage;
	int defense;
	int coin;
	public int exp;
	// 맵 설정
	String[] map = {"대한민국", "미국"};
	String[] maps = {"대전", "서울"};
	
	//생성자 만들기
	LottoRpg(){
		//유저 기본 값
		start = false;
		level = 0;
		hp = 0;
		damage = 0;
		defense = 0;
		coin = 0;
		exp = 0;
	}
	
	//게임시작 만들기
	void Strat() {
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println("\n		게임을 시작하시겠습니까? \n		     y / n");
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		if(s.nextLine().equals("y")){
		start = !start;
		UserName();
		}else{
			System.out.println("게임을 종료 하겠습니다.");
		}
	}
	
	
	//이름설정 만들기
	void UserName() {		
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println("\n		이름을 입력하세요");
		System.out.println("	※ 이름을 입력 하시면 게임이 시작됩니다. ");
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		name = s.nextLine();
		main();
	}
	
	//메인화면 만들기
	void main() {
		
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println("\n      현재 지도 : " + map[0] + "     ||||||||||    " + "위치 : " + maps[0]);
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println("\n캐릭터 이름 : " + name);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + damage);
		System.out.println("방어력 : "+ defense);
		System.out.println("돈 : "+ coin + "원");
		System.out.println("경험치 : "+ exp);
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		if(level <= 5) {
			System.out.println("\n1. 언젠가는 로또1등 되는 입문 사냥터 " + maps[0] + "으로 이동하기 (미구현)");	
		}else if(level > 5) {
			System.out.println("\n1. 사냥터 " + maps[0 + 1] + "으로 이동하기 (미구현)");
		}
		System.out.println("2. 지도 및 위치 이동하기  (미구현)");
		System.out.println("3. 상점으로 이동하기 ");
		System.out.println("4. 각 번호의 능력 확인하러 가기 ");
		System.out.println("5. 게임 종료하기");
		for(int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println("\n	입장하실 장소를 입력 해주세요.	");
		for(int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		
		// 선택 창으로 이동하기.
		int mov = Integer.parseInt(s.nextLine());
		if(mov == 1) {
			Lground pp = new Lground();
			pp.mon();
			
		}else if(mov == 2) {
			Mapchange mc = new Mapchange();
			mc.Map();
		}else if(mov == 3) {
			Store se = new Store();
			se.select();
			
		}else if(mov == 4) {
			Lottohint pm = new Lottohint();
			pm.hint();
		
		}else if(mov == 5){
			System.exit(0);
		}else {
			System.out.println("이동 위치를 다시 입력 하여주세요.");
		}
		
	}
	
	

	
	
	
	
	
	
	
}

