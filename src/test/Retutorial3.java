package test;

public class Retutorial3 {

	public static void main(String[] args) {
		
	}
	
	public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        boolean tre;
	        for(int i = 0; i < participant.length; i++){
	            tre = true;
	            for(int j = 0; j < completion.length; j++){
	                if(participant[i].equals(completion[j])){
	                    completion[j] = null;
	                    tre = false;
	                    break;
	                }
	            }
	            if(tre){
	                answer += participant[i];
	            }
	        }
	        return answer;
	}
}
