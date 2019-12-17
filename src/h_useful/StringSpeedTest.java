package h_useful;

public class StringSpeedTest {
	
	public static void main(String[] args) {
		String str = "a";
		
		
//		long start = System.currentTimeMillis(); //현재시간 단위를 밀리세컨드 단위로 체크
//		for(int i = 0; i < 200000; i++){
//			str += "a";
//		}
//		long end = System.currentTimeMillis(); // 종료시간
//		System.out.println(end - start + "ms");
		
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 200000; i++){
			sb.append("a"); // StringBuffer 에는 append라는 메소드가 있고 이메서드는 += "a" 와 동일하게 보아도 된다.
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
	}

}
