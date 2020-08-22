package Cloud;

import java.util.Random;

public class Teest {
	public static void main(String[] args) {
		
		Random r = new Random();
		int x1 = r.nextInt(1000000001);
		int y1 = r.nextInt(1000000001);
		int x2 = r.nextInt(1000000001);
		int y2 = r.nextInt(1000000001);
		
		
		int a[][] = new int[][] {{x1,y1},{x1,y2},{x2,y1}};
		int[] result = solution(a);
		
		System.out.println(a[0][0] + " " + a[0][1]);
		System.out.println(a[1][0] + " " + a[1][1]);
		System.out.println(a[2][0] + " " + a[2][1]);
		System.out.println(result[0] + " " + result[1]);
		
	}
	
public static int[] solution(int[][] v) {
	

	
    int[] answer = {0,0};
    	int x,y;
    	if(v[0][0] == v[1][0]) {
    		x = v[2][0];
    	} else if(v[0][0] == v[2][0]) {
    			x = v[1][0];
    	} else {
    				x = v[0][0];
    			}
    	
    	if(v[0][1] == v[1][1]) {
    		y = v[2][1];
    		} else if(v[0][1] == v[2][1]) {
    			y = v[1][1];
    			} else {
    				y = v[0][1];
    			}
    		answer[0] = x;
    		answer[1] = y;
    return answer;
}
}