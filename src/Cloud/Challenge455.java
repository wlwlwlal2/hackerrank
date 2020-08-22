package Cloud;

import java.util.Arrays;

public class Challenge455 {
  public static void main (String[] args) {
    int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
    printPairs(numbers, 7);
  }
  
  public static void printPairs(int[] arr, int sum) {
    System.out.printf("A: %s\n", Arrays.toString(arr));
    System.out.printf("N: %d\n", sum);
    System.out.println("========================");
    /* 해당 메소드를 완성하시오. */
    int a = 0;
    int b = 0;
    while(arr[a] <= sum) {
      if(arr[a] + arr[b] == sum ) {
        System.out.print(arr[a]);
          a++;
          b++; 
      } else 
          b++;
      
    }
  }
}
