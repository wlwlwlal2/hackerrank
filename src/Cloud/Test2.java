package Cloud;

public class Test2 {
	public static void main(String[] args) {

	int[][] board = new int[][] 
			{
			{0,0,0,0,0}, 
			{0,0,1,0,3},
			{0,2,5,0,1},
			{4,2,4,4,2},
			{3,5,1,3,1}
			};
	int[] moves = new int[] {1,5,3,5,1,2,1,4};
	int result = solution(board, moves);
	
	System.out.print(result);
	}

public static int solution(int[][] board, int[] moves) {
    int answer = 0;
    int[] bag = new int[moves.length + 1];
    
    
    
    int i,j;
    int k = 0;
    for (i=0; i<moves.length; i++) {
    	for(j=0; j < board.length; j++) {
    		if(board[j][moves[i]-1] != 0) {
    			k = k + 1;

    			bag[k] = board[j][moves[i]-1];
    			board[j][moves[i]-1] = 0;
    			System.out.println("bag[" +k+"]=" + bag[k]);
    			
    				
    			}
    			
    			for(int l=0; l<bag.length; l++) {
    				if(bag[l] == bag[l+1]) {
    					answer = answer + 2;
    					bag[l] = bag[l] 
    				}
    			}
    		
    		}
    		}
    	

    return answer;
	}

}