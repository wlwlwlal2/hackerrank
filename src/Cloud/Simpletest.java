package Cloud;

import java.util.Random;

public class Simpletest {
	public static void main(String[] args) {
	//	int[] prices = {3,2,4,8,7};
		
		Random rand = new Random();
		int size = rand.nextInt(100000);
		int[] prices = new int[size];
		for(int i=0;i<size;i++) {
			prices[i] = rand.nextInt(100000);
		}
		
		int result = solution(prices);
		System.out.println(result);
	}

	public static int solution(int[] prices) {
		// 풀이코드
		int i = 0;
		int j = 0;
		int max = 0;
		int min = 0;
		
		for(i=0;i<prices.length;i++) {
			if(prices[i] > min) {
				
			
			for(j=i;j<prices.length;j++) {
				if (prices[j] - prices[i] > max) {
					max = prices[j] - prices[i];
					
				}
			}
				
			}
		
		}
		return max;

	}
}
