package f_oop2;

public class Store {
	
	public static void main(String[] args) {
		Customer c = new Customer();
		
		Product p = new Desktop();
		p.info();
		c.buy(p);
		
		p = new Tv();
		p.info();
		c.buy(p);
		
		c.showItem();
		/*
		 * << 데이터 >>
		 * - 8가지 기본형 타입
		 * - 배열 : 같은 타입의 데이터를 묶어서 사용
		 * - 구조체 : 다른 타입의 데이터를 묶어서 사용  //배열도 불편해서 만든건데 자바에는 없는것.. 다른언어에는 있지만 C언어에서 사용
		 * - 클래스 : 다른 타입의 데이터를 묶어서 사용  + 관련 메서드
		 */
		/*
		Struct Product{ // 다른 타입을 묶어서 사용
			String name;
			int price;
		}
		
		//변수와 기능을 묶어서 사용하겠다는것이 class이다.
		*/
	}
}



class Product{
	String name;
	int price;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info(){
		for(int i = 0; i < 15; i++){
		System.out.print("-");
		}
		
		System.out.println("\n상품명 : " + name);
		System.out.println("\n금   액 : " + price + "원");
		
		for(int i = 0; i < 15; i++){
		System.out.print("-");
		}
	}
}

class Desktop extends Product{
	Desktop(){
		super("삼성 컴퓨터", 500000); // 부모 클래스(Product)의 생성자 호출
	}	
}

class Tv extends Product{
	Tv(){
		super("LG TV", 1000000);
	}
}

class Customer{
	int money = 200000000;
	Product[] item = new Product[10]; // 장바구니 new 부터 Product[10] 까지는 10개의 객체를 저장하기 위한 공간 이고 item 에 저장을한다
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("돈이 부족하다");
			return;
		}
		
		money -= p.price;
		
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println();
		System.out.println(p.name + "을 구매 했다.");
	}
	
	void showItem(){
		System.out.println("------- 장바구니 -------");
		for(int i = 0; i < item.length; i++){
			if(item[i] != null){
				System.out.println();
				System.out.println(i + 1 + ". " + item[i].name);
			}
		}
		System.out.println();
		for(int i = 0; i < 21; i++){
			System.out.print("-");
		}
	}
	
}


















