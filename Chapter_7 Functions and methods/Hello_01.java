// printing Hello worrld and sum by using function

import java.util.Scanner;

public class Hello_01{

    public static void printing_Helloworld(){

        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

    }

    public static int calculate_sum(int num, int num2){
    
        int sum = num+num2;
        return sum;

    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a and b");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum= calculate_sum(a,b);

        System.out.println("sum is " + sum);

        sc.close();

    }
    
}