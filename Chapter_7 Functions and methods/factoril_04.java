//  calculating factorial of a number in java

import java.util.Scanner;

public class factoril_04 {
    
    public static int factorial(int n){
        int fact = 1;

        for(int i= 1; i<= n; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String args[]){
        System.out.println("Enter the number which you want to calculate the factoril of that number");

        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();

        System.out.print("factorial of  " + x+ "is\t"+ factorial(x));

        sc.close();
    }
}
