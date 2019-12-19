package i_collection;

import java.util.ArrayList;

public class LinstScore {

	public static void main(String[] args) {
		
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
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("Java");
		subjects.add("Oracle");
		subjects.add("HTML");
		subjects.add("CSS");
		subjects.add("JQuery");
		subjects.add("JSP");
		
		ArrayList<String> students = new ArrayList<>();
		students.add("김지선");students.add("이누리");students.add("박종민");students.add("정대석");
		students.add("정재영");students.add("강현철");students.add("주향한");students.add("강현지");students.add("윤창훈");
		students.add("연은주");students.add("이병훈");students.add("구한나");students.add("박진영");students.add("백종빈");
		students.add("이승재");students.add("민태홍");students.add("이지형");students.add("정보람");students.add("이예림");
							students.add("김령환");										students.add("김경운");
							
		ArrayList<ArrayList<Double>> list = new ArrayList<>();
		
		//점수를 입력한다.
		for(int i = 0; i < students.size(); i++){
			ArrayList<Double> score = new ArrayList<>();
			
			score.add(1.0); //석차
			
			for(int j = 0; j < subjects.size(); j++){
				score.add((double)getRandom(50, 100));
			}
			
			list.add(score);
		}
		
		//총점과 평균을 구한다.
		for(int i = 0; i < list.size(); i++){
			ArrayList<Double> score = list.get(i);
			int sum = 0;
			for(int j = 1; j < score.size(); j++){
				sum += score.get(j);
			}
			score.add((double)sum); //총점
			score.add((double)sum / subjects.size()); //평균
		}
		
		//순위를 구한다
		for(int i = 0; i < list.size(); i++){
			for(int j = 0; j < list.size(); j++){
				if(list.get(i).get(subjects.size() + 1) < list.get(j).get(subjects.size() + 1)){
					list.get(i).set(0, list.get(i).get(0) + 1);
				}
			}
		}
		
		//순위대로 정렬한다.
		for(int i = 0; i < list.size() - 1; i++){
			boolean changed = false;
			
			for(int j = 0; j < list.size() - 1 - i; j++){
				if(list.get(j).get(0) > list.get(j + 1).get(0)){
					ArrayList<Double> temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
					
					String tempName = students.get(j);
					students.set(j, students.get(j + 1));
					students.set(j + 1, tempName);
					
					changed = true;
				}
			}
			
			if(!changed) break;
		}
		
		//출력한다.
		for(int i = 0; i < 100; i++){
			System.out.print("-");
		}
		System.out.println();
		
		System.out.print("석차\t이름");
		for(int i = 0; i < subjects.size(); i++){
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t총점\t평균");
		for(int i = 0; i < list.size(); i++){
			ArrayList<Double> score = list.get(i);
			for(int j = 0; j < score.size(); j++){
				System.out.print((int)((double)score.get(j)) + "\t");
				if(j == 0){
					System.out.print(students.get(i) + "\t");
				}
			}
			System.out.println();
		}
		
		System.out.print("과목별 평균 : ");
		for(int i = 1; i <= subjects.size(); i++){
			double sum = 0;
			for(int j = 0; j < list.size(); j++){
				sum += list.get(j).get(i);
			}
			double avg = (int)(sum / list.size() * 100 + 0.5) / 100.0;
			System.out.print("\t" + avg);
		}
		
	}
	
	static int getRandom(int from, int to){
		return (int)(Math.random() * (Math.abs(to - from) + 1))
				+ Math.min(from, to);
	
	}

}
