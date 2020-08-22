package Cloud;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries)
    {
    // Write your code here
    	int lastanswer = 0;
    	List<List<Integer>> Nlist = new ArrayList<List<Integer>>();
    	List<Integer> result = new ArrayList<Integer>();
    	
    	
    	for(int k=0; k<n; k++ ) {
    		Nlist.add(new ArrayList<Integer>());
    	}
    	
    	for(int i = 0; i<queries.size(); i++) {
    		
    		List<Integer> list = queries.get(i);
    		
    		int type = list.get(0);
    		int x = list.get(1);
    		int y = list.get(2);
    		
    		
    		
    		if(type == 1) {
    			int n2 = (x ^ lastanswer)%n;
    			Nlist.get(n2).add(y);
    			
    		}
    		if(type == 2) {
    			int n2 = (x ^ lastanswer)%n;
    			int size = Nlist.get(n2).size();
    			
    			int idx = y % size;
    			lastanswer = Nlist.get(n2).get(idx);
    			result.add(lastanswer);
    		}
    	}
		return result;
    	
    	
    }

}

public class Hackerrank {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.dynamicArray(n, queries);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
