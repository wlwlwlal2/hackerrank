package Cloud;

import java.util.Scanner;
import java.util.Stack;

public class GameofTwoTop {
	
	 static int twoStacks(int x, int[] a, int[] b) {
	        /*
	         * Write your code here.
	         */
		 int max1, max2;
		 int i,j;
	   int sum1 = 0;
	   int max = 0;
	   
	   for(i = 0; sum1 < x;) {
		   sum1 = sum1 + a[i]; 
		   i = i + 1;
		   
		   if(sum1 > x)
			   break;
		   
		   int sum2 = x - sum1;
		   
		   int sum3 = 0;
		   for(j = 0; sum3 < sum2;) {
			   sum3 = sum3 + b[j];
			   j = j + 1;
			   if(sum3 > sum2) {
		   		   sum3 = sum3 - b[j];
				   break;
		   }
	  
	   }
		   if(i + j > max)
			   max = i+j-1;
		   
	   }return max;
	 
	 }
	 
	  static final Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int g = Integer.parseInt(scanner.nextLine().trim());

	        for (int gItr = 0; gItr < g; gItr++) {
	            String[] nmx = scanner.nextLine().split(" ");

	            int n = Integer.parseInt(nmx[0].trim());

	            int m = Integer.parseInt(nmx[1].trim());

	            int x = Integer.parseInt(nmx[2].trim());

	            int[] a = new int[n];

	            String[] aItems = scanner.nextLine().split(" ");

	            for (int aItr = 0; aItr < n; aItr++) {
	                int aItem = Integer.parseInt(aItems[aItr].trim());
	                a[aItr] = aItem;
	            }

	            int[] b = new int[m];

	            String[] bItems = scanner.nextLine().split(" ");

	            for (int bItr = 0; bItr < m; bItr++) {
	                int bItem = Integer.parseInt(bItems[bItr].trim());
	                b[bItr] = bItem;
	            }

	            int result = twoStacks(x, a, b);

	            bufferedWriter.write(String.valueOf(result));
	            bufferedWriter.newLine();
	        }

	        bufferedWriter.close();
	    }
}
