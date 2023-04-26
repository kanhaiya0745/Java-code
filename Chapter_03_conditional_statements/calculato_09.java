// program for calculator;

import java.util.*;
public class calculato_09 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();

        System.out.println("Enter operator");
        char operator = sc.next().charAt(0); // charAt is used for taking character value(nhi to string le leta)

        switch(operator){
            case('+'): System.out.println(a+b);
                        break;
        
            case('-'): System.out.println(a-b);
                        break;

            case('*'): System.out.println(a*b);
                        break;
            
            case('/'): System.out.println(a/b);
                        break;


            case('%'): System.out.println(a%b);
                        break;

            default : System.out.println("My calculator is not to much advanced only few operators can perform");
        }

    }
}
