package Cloud;

public class BalancedBrackets {

    // Complete the isBalanced function bBelow.
    static String isBalanced(String s) {
    
    	int strlen = s.length();
    	
    	int i = 0;
    	int j = -1;
    	
    	char[] str = new char[strlen];
    	
    	for(i = 0; i<strlen; i++) {
            j++;
            str[j] = s.charAt(i);
        
            if(str[j] == '}' || str[j] == ')' || str[j] == ']') {
                if(j < 1)
                    break;
                if(str[j] == '}' && str[j-1] == '{')
                    j = j - 2;
                else if(str[j] == ']' && str[j-1] == '[')
                    j = j - 2;
                else if(str[j] == ')' && str[j-1] == '(')
                    j = j - 2;
        }
        }     
        System.out.println(j);
            if(j == -1)
                return "YES";
            else
                return "NO";
        
    
        }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

}
