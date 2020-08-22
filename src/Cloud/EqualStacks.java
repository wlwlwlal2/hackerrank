package Cloud;

import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {
		
//	Scanner scan = new Scanner(System.in);
//	int a,b,c;
//	
//	a = scan.nextInt();
//	b = scan.nextInt();
//	c = scan.nextInt();
//	
//	Stack<Integer> sta1 = new Stack<>();
//	Stack<Integer> sta2 = new Stack<>();
//	Stack<Integer> sta3 = new Stack<>();
//	
//	int[] max = new int[3];
//	max[0] = 0;
//	max[1] = 0;
//	max[2] = 0;
//	
//	int sum;
//	
//	for(int i = 0; i < a; i++) {
//		sum = scan.nextInt();
//		max[0] = max[0] + sum;
//		sta1.push(sum);
//	}
//	
//	for(int j = 0; j < b; j++) {
//		sum = scan.nextInt();
//		max[1] = max[1] + sum;
//		sta2.push(sum);
//	}
//	
//	for(int k = 0; k < c; k++) {
//		sum = scan.nextInt();
//		max[2] = max[2] + sum;
//		sta2.push(sum);
//	}
//	System.out.println(max[0] + " " + max[1] + " " + max[2]);
//	
//	while(max[0] != 0 && max[1] != 0 && max[2] != 0) {
//		
//		if(max[0] == max[1] && max[0] == max[2]) {
//			System.out.println(max[0]);
//			break;
//		}
//		else if(max[0] >= max[1] && max[0] >= max[2]) {
//			sum = sta1.peek();
//			max[0] = max[0] - sum;
//		}
//		else if(max[1] >= max[0] && max[1] >= max[0]) {
//			sum = sta2.peek();
//			max[1] = max[1] - sum;
//		}
//		else if(max[2] >= max[0] && max[2] >= max[1]) {
//			sum = sta1.peek();
//			max[2] = max[2] - sum;
//		}
//		
//	}
//	
//	}
//
//}
		static int equalStacks(int[] h1, int[] h2, int[] h3) {
	        /*
	         * Write your code here.
	         */
	    Stack<Integer> sta1 = new Stack<>();
	    Stack<Integer> sta2 = new Stack<>();
	    Stack<Integer> sta3 = new Stack<>();

	         int[] max = new int[3];
	         int len1, len2, len3;
	         len1 = h1.length()-1;
	         len2 = h2.length()-1;
	         len3 = h3.length()-1;
	        for(int i = 0; i < h1.length; i++) {
	        max[0] = max[0] + h1[i];
	        sta1.push(h1[h1.length - i]);
	    }
	        for(int j = 0; j < h2.length; j++) {
		        max[1] = max[1] + h2[j];
		        sta2.push(h2[j]);
		    }
	        for(int k = 0; k < h3.length; k++) {
		        max[2] = max[2] + h3[k];
		        sta3.push(h3[k]);
		    }
	    int sum;
	        while(max[0] != 0 && max[1] != 0 && max[2] != 0) {
//	    		
	    		if(max[0] == max[1] && max[0] == max[2]) {
	    			System.out.println(max[0]);
	    			break;
	    		}
	    		else if(max[0] >= max[1] && max[0] >= max[2]) {
	    			sum = sta1.peek();
	    			max[0] = max[0] - sum;
	    		}
	    		else if(max[1] >= max[0] && max[1] >= max[0]) {
	    			sum = sta2.peek();
	    			max[1] = max[1] - sum;
	    		}
	    		else if(max[2] >= max[0] && max[2] >= max[1]) {
	    			sum = sta1.peek();
	    			max[2] = max[2] - sum;
	    		}
	    		
	    	}
	    	return max[0];
	    	}
	    
	    
	    

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] n1N2N3 = scanner.nextLine().split(" ");

	        int n1 = Integer.parseInt(n1N2N3[0].trim());

	        int n2 = Integer.parseInt(n1N2N3[1].trim());

	        int n3 = Integer.parseInt(n1N2N3[2].trim());

	        int[] h1 = new int[n1];

	        String[] h1Items = scanner.nextLine().split(" ");

	        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
	            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
	            h1[h1Itr] = h1Item;
	        }

	        int[] h2 = new int[n2];

	        String[] h2Items = scanner.nextLine().split(" ");

	        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
	            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
	            h2[h2Itr] = h2Item;
	        }

	        int[] h3 = new int[n3];

	        String[] h3Items = scanner.nextLine().split(" ");

	        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
	            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
	            h3[h3Itr] = h3Item;
	        }

	        int result = equalStacks(h1, h2, h3);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();
	    }
	}
