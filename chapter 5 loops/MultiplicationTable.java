// program to print Multiplication table of any number entered by the user;

import java.util.Scanner;

// import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class MultiplicationTable {
    public static void printMultiplicationTable(int number){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :");
        int n = sc.nextInt();

        for(int i =1; i<=10; i++){
            System.out.println(n + " * " + i + "=" + n*i);
        }
    }
    public static void main(String s[]){
        printMultiplicationTable(0);
    }
    
}
