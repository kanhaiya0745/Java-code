// program of swaping 2 number by using function;

import java.util.Scanner;

public class call_by_value_02{

    public static void calculateSwap(int x, int y){
        
        int temp = x;

        x = y;
        y= temp;

        System.out.println("After swaping the value is ");
        System.out.println(x);
        System.out.println(y);

    }

    // Here are writen sum function ;

    public static int  sum(int a , int b){

        int c = a+b;
        return (c);
        
        //System.out.println(c);

    }

    // Now here are calculating factoril of a number; function no 3 ;

    public static int calculating_factorial(int n){
    int factorial = 1;
    
    for(int i = 1; i<=n; i++){

        factorial = factorial *i;
    }

    return factorial ;
     }

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a and b");
        int a= sc.nextInt();
        int b = sc.nextInt();
         calculateSwap(a,b);
         
         sc.close();

       //  System.out.print("Here are calculating the sum ");

        System.out.println("The sum is "+sum(a,b ));
         System.out.println("The factorial of number is "+ calculating_factorial(3));


    }
    
}