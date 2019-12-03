package d_array;

import java.util.Arrays;

public class Score {

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
	
//		String[] student = new String[21];
//		String[] ranks = new String[4];
//		
//		int[][] subject = new int[21][6];
//		int[] su = new int[21];
//		int[] rank = new int[21];
//		
//		double[] avg = new double[21];
//		
//		String[] name = {"김지선", "이누리", "박종민", "정대석", "정재영", "강현철", "주향한", "윤창훈", "연은주", "김령환", "구한나", "백종빈", "이병훈", "강현지", "김경운", "이지형", "이예림", "이승재", "민태홍", "정보람", "박진영"};
//		String[] sc = {"Java", "Oracle", "HTML", "CSS", "JQuery", "JSP"};
//		
//		System.out.println("순위" + "\t이름" + "\t" + sc[0] + sc[1] + sc[2] + sc[3] + sc[4] + sc[5] + "\t총점" + "\t평균" + "\t등급");		
//		for(int i = 0; i < subject.length; i++){
//			for(int j = 0; j < subject[i].length; j++){
//				subject[i][j] = (int)(Math.random() * 51) + 50;
//				su[i] += subject[i][j];
//				avg[i] = (double)su[i] / subject[i].length;
//				
//			}
//			System.out.print(rank[i] + "등" + "\t" + name[i] + "\t" + Arrays.toString(subject[i]) + "\t" + su[i] + "\t" + Math.round(avg[i]) + "\t");
//			System.out.println();
//		}
//		
//		for(int i = 0; i < subject.length; i++){
//			for(int j = 0; j < subject[i].length; j++){
//				subject[i][j] = (int)(Math.random() * 51) + 50;
//			}
//		}
//		System.out.print("과목 점수 총 평점    :  " );
//		System.out.println();
		
		String[] students = {"김지선", "이누리", "박종민", "정대석", "정재영", "강현철", "주향한", "윤창훈", "연은주", "김령환", "구한나", "백종빈", "이병훈", "강현지", "김경운", "이지형", "이예림", "이승재", "민태홍", "정보람", "박진영"};
		String[] subjects = {"Java", "Oracle", "HTML", "CSS", "JQuery", "JSP"};
		double[][] scores = new double[students.length][subjects.length + 3];
		
		//점수를 입력한다.
		for(int i = 0; i < scores.length; i++){
			scores[i][0] = 1; // 석차
			for(int j = 0; j < subjects.length; j++){
				scores[i][j + 1] = (int)(Math.random() * 51) + 50;
			}
		}
		
		//총점과 평균을 구한다.
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < subjects.length; j++){
				scores[i][scores[i].length - 2]
								+= scores[i][j + 1]; //총점
			}
			scores[i][scores[i].length - 1]
					= (int)(scores[i][scores[i].length - 2]
							/ subjects.length * 100 + 0.5)
							/ 100.0; //평균
		}
		
		//석차를 구한다.
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores.length; j++){
				if(scores[i][scores[i].length - 1] < scores[j][scores[j].length - 1]){
					scores[i][0]++;
				}
			}
		}
		
		//정렬한다.
		for(int i = 0; i < scores.length - 1; i++){
			for(int j = i + 1; j < scores.length; j++){
				if(scores[i][0] > scores[j][0]){
					double[] temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
					
					String tempName = students[i];
					students[i] = students[j];
					students[j] = tempName;
				}
			}
		}
		
		//출력한다.
		System.out.print("석차\t이름");
		for(int i = 0; i < subjects.length; i++){
			System.out.print("\t" + subjects[i]);
		}
		System.out.println("\t총점\t평균");
		
		for(int i = 0; i < scores.length; i++){
			System.out.print((int)scores[i][0] + "\t" + students[i]);
			for(int j = 1; j < scores[i].length; j++){
				System.out.print("\t" + scores[i][j]);
			}
			System.out.println();
		}
		System.out.print("과목별 평균 : ");
		for(int i = 1; i <= subjects.length; i++){
			double sum = 0;
			for(int j = 0; j < scores.length; j++){
				sum += scores[j][i];
			}
			double avg = (int)(sum / scores.length * 100 + 0.5) / 100.0;
			System.out.print("\t" + avg);
		}
	}

}
