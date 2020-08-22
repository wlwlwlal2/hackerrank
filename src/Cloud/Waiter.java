package Cloud;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Waiter {
	static int[] waiter(int[] number, int q) {
        /*
         * Write your code here.11
         */
		
		int answer[] = new int[number.length];
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		int i,j=0;
		int k = 0;
		
		for(int a = 0; a<number.length; a++) {
			temp.add(number[a]);
		}
		
		
		for(i = 2; i<q+2; i++) {
			if(q%2 == 1) {
			for(j = 0; j<temp.size();j++) {
				if(temp.get(j) % i == 0) {
					answer[k++] = temp.get(j);
					temp.remove(j);
					j--;
				}
				}
			}
			else {
			for(j = 1; j<=temp.size();j++) {
				if(temp.get(temp.size()-j) % i == 0) {
					answer[k++] = temp.get(temp.size()-j);
					temp.remove(temp.size()-j);
					j--;
				
			}
			
				
		}
			}
		
	}
		for(int l=0; l<temp.size(); l++)
			answer[k++] = temp.get(l); 
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


}
