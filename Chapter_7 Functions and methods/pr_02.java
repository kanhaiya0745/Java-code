// program for number is even or odd by taking an argument;

import java.util.Scanner;

public class pr_02{
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the positive number");

        int num = sc.nextInt();

        if(isEven(num)){
            System.out.println(num+ " is Even number");
        }
        else{
            System.out.print(num+ "is  odd Number ");
        }
        sc.close();
    }
}
