package test;
import java.util.ArrayList;
import java.util.List;

public class Retutorial3 {

	public static void main(String[] args) {
//		
//	}
//	
//	public String solution(String[] participant, String[] completion) {
//	        String answer = "";
//	        boolean tre;
//	        for(int i = 0; i < participant.length; i++){
//	            tre = true;
//	            for(int j = 0; j < completion.length; j++){
//	                if(participant[i].equals(completion[j])){
//	                    completion[j] = null;
//	                    tre = false;
//	                    break;
//	                }
//	            }
//	            if(tre){
//	                answer += participant[i];
//	            }
//	        }
//	        return answer;
	     
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10); //0
		intList.add(15); //1
		intList.add(20); //2
		intList.add(25); //3
		intList.add(30); //4
		intList.add(35); //5
		intList.add(40); //6
		
		
		//리스트에 담긴 값을 간격의 평균
		
//		int a = 0;
//		double b = 0;
//		for(Integer sum : intList){
//			a += sum;
//			b = a / intList.size();
//		}
//		System.out.println(a);
//		System.out.println(b);
		
		int sum = 0;
		for(int i = 0; i < intList.size() - 1; i++){
			sum += intList.get(i + 1) - intList.get(i);
		}
		System.out.println(sum / (intList.size()-1));
		
		
		
		
		
		
		
		

		
	}
}
