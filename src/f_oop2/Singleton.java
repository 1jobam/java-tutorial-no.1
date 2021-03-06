package f_oop2;


//싱글톤 패턴 : 객체의 생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴 // 전체 (자바) 통틀어서 한번만 호출 
//객체들간에 객체를 공유하기 위해 사용한다.
public final class Singleton { //final을 붙이게 되면 다른곳에서 상속을 받을수 없습니다.
	
	private static Singleton instance;
	
	//생성자의 접근제어자를 private으로 만들어 다른 클래스에서 객체 생성하는 것을 막는다.
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){ // 처음 받은 객체를 다른곳에서 사용하기 위해 받아준다
			instance = new Singleton();
		}
		return instance;
	}
	
	
}
