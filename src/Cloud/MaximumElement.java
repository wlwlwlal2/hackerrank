package Cloud;

import java.util.Scanner;
import java.util.Stack;
import java.math.*;

public class MaximumElement {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int a,b;
	int num1, num2;
	int max2 = 0;

	
	a = scan.nextInt();
	
	
	
	int[] ma = new int[a];
	int cnt = 0;
	for(b=0; b<a; b++) {
		num1 = scan.nextInt();
		
		
		if(num1 == 1) {
			num2 = scan.nextInt();
			
			ma[cnt] = num2;
			cnt = cnt + 1;
			
		//	System.out.println(num2);
		}
		
		if(num1 == 2) {
			ma[cnt-1] = 0;
			
		//	System.out.println("»èÁ¦");
		}
		
		max2 = 0;
		if(num1 == 3) {
			for(int c=0; c<cnt; c++) {
				if(max2 < ma[c]) {
					max2 = ma[c];
				}
				
				}
			System.out.println(max2);
			}

		}
	}

}
