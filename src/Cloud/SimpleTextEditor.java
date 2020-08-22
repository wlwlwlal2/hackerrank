package Cloud;

import java.util.Scanner;

public class SimpleTextEditor {
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String s;
        String sum = "";
        
        String[] arr = new String[a+1];
        arr[0] = "";
        
        int b = 0;
        int c = 0;
        for(int i = 0; i<a; i++) {
            int d = scan.nextInt();
            if(d == 1) {
                b = b + 1;
                s = scan.nextLine();
                s = s.trim();
                sum = sum + s;
                arr[b] = sum;
            // System.out.println(arr[b]);
            //    System.out.println("1¹ø");
                
            }
            else if(d == 2) {
                b = b + 1;
                c = scan.nextInt();
                sum = sum.substring(0,sum.length() -c);
            //    System.out.println(sum);
                arr[b] = sum;
                
           
            }
            else if(d == 3) {
                c = scan.nextInt();
            //    System.out.println(sum);
                System.out.println(sum.charAt(c-1));
            //    System.out.println("3¹ø");
            }
            else if(d == 4) {
                b = b - 1;
                sum = arr[b];
            //    System.out.println(sum);
            //    System.out.println("4¹ø");
            }
        }
	}  
}
        
        
        
