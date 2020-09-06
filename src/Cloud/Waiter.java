package Cloud;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Waiter {
	 static int[] waiter(int[] number, int q) {
         /*
          * Write your code here.
          */
         
         int answer[] = new int[number.length];
         ArrayList<Integer> temp = new ArrayList<Integer>();
         
         int i,n=0,j=0;
         int k = 0, p = 0;
         int max = 0;
         int count2;
         int snum[] = new int[q];
         
         
         
         for(int a = 0; a<number.length; a++) {
             temp.add(number[a]);
             if(number[a] > max) {
                 max = number[a];
             } // number 배열 최대값
         }
         System.out.println(max);
         
         for(int count1 = 2; count1 <= max && p < snum.length; count1++) {
             for(count2 = 2; count2 < count1; count2++) {
                 if(count1 % count2 == 0)
                     break;
             }
             if(count1 == count2) {
                 snum[p] = count1;
                 System.out.println(snum[p]);
                 p++;
                 
             }
         } // 소수배열
         
         
         
         
         for(i = 0; i<q; i++) {
             if(n == 0) {
                 for(j = 0; j<temp.size();j++) {
                	 if(temp.get(j) % snum[i] == 0) {
                		 answer[k++] = temp.get(j);
                		 temp.remove(j);
                		 j--;
                		 n = 1;
                	 }
                 }
             }
             else if(n == 1){
                 
             for(j = 1; j<=temp.size();j++) {
                 if(temp.get(temp.size()-j) % snum[i] == 0) {
                     answer[k++] = temp.get(temp.size()-j);
                     temp.remove(temp.size()-j);
                     j--;
                     n = 0;
                 }
             }
             }
     }
     if ( q % 2 == 0) {
     for(int l=temp.size()-1; l>=0; l--) 
         answer[k++] = temp.get(l);
     } 
     else {
     for(int l=0; l<temp.size(); l++) 
        answer[k++] = temp.get(l);
     }
             return answer;
     }
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] nq = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nq[0].trim());

	        int q = Integer.parseInt(nq[1].trim());

	        int[] number = new int[n];

	        String[] numberItems = scanner.nextLine().split(" ");

	        for (int numberItr = 0; numberItr < n; numberItr++) {
	            int numberItem = Integer.parseInt(numberItems[numberItr].trim());
	            number[numberItr] = numberItem;
	        }

	        int[] result = waiter(number, q);

	        for (int resultItr = 0; resultItr < result.length; resultItr++) {
	            bufferedWriter.write(String.valueOf(result[resultItr]));

	            if (resultItr != result.length - 1) {
	                bufferedWriter.write("\n");
	            }
	        }

	        bufferedWriter.newLine();

	        bufferedWriter.close();
	    }
	}
