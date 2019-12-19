package i_collection;

import java.util.ArrayList;

public class ArrayListScore {
	
	public static void main(String[] args) {
		// 참고자료
		/*
		 * 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를
		 * 50 ~ 100 까지 랜덤으로 생성시켜주시고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균, 등급을 출력해주세요.
		 * 
		 * 순위 이름 Java Oracle HTML CSS JQuery JSP 총점 평균 등급
		 * 1   박종민  90    100   80   50   30    90 400 70 A
		 * 2   박종민  90    100   80   50   30    90 400 70 B
		 * 3   박종민  90    100   80   50   30    90 400 70 C
		 * 4   박종민  90    100   80   50   30    90 400 70 D
		 * 5   박종민  90    100   80   50   30    90 400 70 E
		 * 
		 */
		
//		----------------------------------------------------------------------------------------------------
		ArrayList<String> student = new ArrayList<String>();
//		----------------------------------------------------------------------------------------------------
		student.add("|김지선|");student.add("|이누리|");student.add("|박종민|");student.add("|정대석|");
		student.add("|정재영|");student.add("|강현철|");student.add("|주향한|");student.add("|강현지|");student.add("|윤창훈|");
		student.add("|연은주|");student.add("|이병훈|");student.add("|구한나|");student.add("|박진영|");student.add("|백종빈|");
		student.add("|이승재|");student.add("|민태홍|");student.add("|이지형|");student.add("|정보람|");student.add("|이예림|");
							student.add("|김령환|");										student.add("|김경운|");
//		----------------------------------------------------------------------------------------------------		
		ArrayList<String> line = new ArrayList<String>();
//		----------------------------------------------------------------------------------------------------
		line.add("\t순위\t");line.add("이름\t");line.add("Java\t");line.add("Oracle\t");line.add("HTML\t");line.add("CSS\t");
		line.add("JQuery\t");line.add("JSP\t");line.add("총점\t");line.add("평점\t");line.add("등급\t");
//		----------------------------------------------------------------------------------------------------
		//점수구하기 ArrayList
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		ArrayList<Integer> result2 = new ArrayList<>();
//		----------------------------------------------------------------------------------------------------
		
		//점수 구하기
		for(int i = 0; i < student.size(); i++){
			result2 = new ArrayList<>();
			result.add(result2);
			for(int j = 0; j < line.size() - 5; j++){
				int random = (int)(Math.random()* 51) + 50;
				result.get(i).add(j, random); 
			}	
		}
		
//		----------------------------------------------------------------------------------------------------

		//합계, 평균 구하기
		for(int i = 0; i < result.size(); i++){
			int sum = 0;
			for(int j = 0; j < result.get(i).size(); j++){
				sum += result.get(i).get(j);
			}
			double avg = (int)(sum / result.get(i).size() * 100 + 0.5) / 100;
			System.out.println(sum + "," + avg);
		}
		
		
//		----------------------------------------------------------------------------------------------------
		

		
		
//		----------------------------------------------------------------------------------------------------		
		//구분선
		for(int i = 0; i < 100; i++){
			System.out.print("-");
		}
		System.out.println();
		//헤더표시
		for(int i = 0; i < line.size(); i++){
			System.out.print(line.get(i));	
		}
			System.out.println();
		//구분선
		for(int i = 0; i < 100; i++){
			System.out.print("-");
		}
		
		
		//전체 정렬
		System.out.println();
		int count = 0;
		for(int i = 0; i < student.size(); i++){
			count++;
			System.out.print("\t" + count);
			System.out.print("     " + student.get(i));
			System.out.print("\t\t" + result.get(i));
			System.out.println();
			
		}

		//구분선
		for(int i = 0; i < 100; i++){
			System.out.print("-");
		}
		System.out.println();
		
		//과목별 평균
		System.out.print("\t        과목 별 평균 :");
		System.out.println();
		
		//구분선
		for(int i = 0; i < 100; i++){
			System.out.print("-");
		}
		System.out.println();
		
				
				
				
				
				
	}
}
