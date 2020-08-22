package CloudStudying;


public class Challange440 {
	public static void main(String[] args) {
	        int numbers[] = {6,10,2,999,888,222,444,555 , 8};
	    
	      
	        	
	        	int a = 0 ,b,c;
	        	int i;
	        	for(i = 0; i<numbers.length; i++) {
	        		if(numbers[i] >= 100 ) {
	        			a = numbers[i] / 100;
	        		} 
	        		else if (numbers[i] >= 10) {
	        			a = numbers[i] / 10;
	        		}
	        		else
	        			a = numbers[i];	
	        		
	        	
	        	for(int j = 0; j<numbers.length; j++) {
	        		if(numbers[j] >= 100 ) {
	        			b = numbers[j] / 100;
	        		} 
	        		else if (numbers[j] >= 10) {
	        			b = numbers[j] / 10;
	        		}
	        		else {
	        			b = numbers[j];	
	        		}
	        		 if(a < b) {
	     	        	c = numbers[j];
	     	        	numbers[j] = numbers[i];
	     	        	numbers[i] = c;
	        		 }
	     	        
	     	        		
	     	        	}
	     	        }
	        	        		
	        	
	        	
	        	for(int o = 0; o<numbers.length; o++) {
        			System.out.print(numbers[o] + " ");
        		}
	       
	          //  String answer = "";
	        //    return answer;
	        }
	    }