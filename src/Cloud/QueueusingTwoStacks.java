package Cloud;

import java.util.ArrayList;
import java.util.Scanner;

public class QueueusingTwoStacks {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		 int a = scan.nextInt();
		for(int i = 0; i<a; i++) {
			int b = scan.nextInt();
			
			if(b == 1) {
				ans.add(scan.nextInt());
			}
			else if(b == 2) {
				ans.remove(0);
			}
			else if(b == 3) {
				System.out.println(ans.get(0));
		}
		
		
		
    }
	}
}
