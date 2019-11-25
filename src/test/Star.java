package test;

public class Star {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;

		
	// 기본 별찍기 //
//		for(i = 0; i < 5; i++) {
//			for(j = 0; j < 5; j++){
//				System.out.print("*");
//		}
//			System.out.println();
//	}
		
	// 왼쪽 삼각형 모양 별찍기 //	
//		for(i = 0; i < 5; i++){
//			for(j = 0; j < i; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	// 오른쪽 삼각형 모양 별찍기 //
//		for(i = 5; i < 0; i--) {
//			for(j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(i = 0; i < 5; i++){
			for(j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}


		
	}

}
