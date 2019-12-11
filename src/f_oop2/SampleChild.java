package f_oop2;

public class SampleChild extends SampleParent {
	
	void childMethod(){
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);
		int result = method(7, 13);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		System.out.println(sc.var);
		int result = sc.method(7, 13);
		System.out.println(result);
		
		sc.test(10);
		
		SampleParent sp = new SampleChild(); // (SampleChild) new SampleChild(); 형변환이 숨어있다. 생략이 가능하다. UP-casting
		//부모타입이 가지고 있는 멤버만 사용할 수 있다.
		System.out.println("sp.var : " + sp.var);
		System.out.println("sc.var : " + sc.var);
		System.out.println("sp.method() : " + sp.method(5,10)); // 메소드를 오버라이딩하면 부모,자식 타입에 상관없이 오버라이딩한 타입으로 가져온다.
		System.out.println("sc.method() : " + sc.method(5,10));
//		sp.childMethod(); 부모타입만 가지고 오기때문에 자식타입의 메소드는 사용할수 없다.
//		sp.test();
		
	}
	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것.
	@Override //어노테이션
	int method(int a, int b){ //리턴타입 메서드명 파라미터 모두 같아야 한다.
		super.method(a, b); // 오버라이딩에서 부모 메소드를 호출하는 방법
		return a * b;
	}
	
	int var;
	
	void test(double var){
		System.out.println(var); //지역변수
		System.out.println(this.var); //인스턴스 변수 (전역변수)
		System.out.println(super.var); //부모클래스의 인스턴스 변수
		//super : 부모클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때
		//둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10,20));
		System.out.println(super.method(10,20));
	}
	
	SampleChild(){
		super();
		//super()를 사용해 부모 클래스의 객체도 생성한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
	}
	

}