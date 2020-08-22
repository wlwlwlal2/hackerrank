package Cloud;


import java.util.HashMap;


public class SimplTest2 {
	public static void main(String[] args) {
		
		String a[] = {"leo","kiki","eden"};
		String b[] = {"eden","kiki"};

        System.out.println(solution(a,b));
	}
       
        
		
		
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        boolean result;
        
        HashMap <String, Integer> M = new HashMap<String, Integer>();
        
        for(int i=0; i<participant.length; i++) {
        	M.put(participant[i], i+1);
        }
        for(int j=0; j<completion.length; j++) {
        	int key;
        	key = M.get(participant[j]);
        	// result = M.get(completion[j]);
        	result = M.containsKey(key);
        	if(result = false) {
        		answer = participant[j];
        		break;
        	}
        	

        	
        }
        return answer;
	}
        
	}
