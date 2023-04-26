// programing of a reverse number;

import java.util.*;

public class reverse_07 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        while(n>0){
            int last_digit = n%10;
            System.out.print(last_digit);
            n=n/10; //n/=10;

        }
        
        System.out.println();
    }
}
