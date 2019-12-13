package test;

public class Retutorial3 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10 - i; j++){
				System.out.print(" ");
			}
			for(int j = 0; j < i * 2 + 1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
			for(int j = 20; j > i * 2 + 1 ; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
