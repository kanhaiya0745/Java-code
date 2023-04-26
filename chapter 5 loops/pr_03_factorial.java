import java.util.Scanner;

// program to find out factorial of a number;

public class pr_03_factorial {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int num; // Entered by the user;
        int fact=1;
        
        
        System.out.println("Enter any positive number which you want to calculate factorial !");
        num = sc.nextInt();

        for(int i=1; i<=num; i++){
            fact = fact*i;
        }

        System.out.println("Factorial!\t" +fact);
    }
    
}
