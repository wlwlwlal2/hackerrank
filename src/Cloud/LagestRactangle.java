package Cloud;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LagestRactangle {
	static long largestRectangle(int[] h) {
		int i,j,k,ans;
		int max = 0;
			for( i = 0; i<h.length; i++) {
				k = 0;
				for(j = i; j>=0; j--) {
					if(h[i] == 1) {	
						k = h.length;
						break;
					}
					
					if(h[i] > h[j]) {
						break;
					}
					k++;
				}
				
				
				for(j = i+1; j<h.length; j++) {
				if(h[i] == 1) {	
					k = h.length;
					break;
				}
				
				if(h[i] > h[j]) {
					break;
				}
				k++;
				ans = h[i] * k;
				if(ans > max) {
					max = ans;
				}
				
				}
				
			}
				return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] h = new int[n];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        long result = largestRectangle(h);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


}
