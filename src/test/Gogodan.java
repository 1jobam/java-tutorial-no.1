package test;

public class Gogodan {

	public static void main(String[] args) {
		
		//구구단 연습하기.
		int i = 2;
		int j = 1;
		
		for(i = 1; i < 10; i++) {
			for(j = 2; j < 10; j++) {
			
				System.out.print(j + " * " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}

	}

}
