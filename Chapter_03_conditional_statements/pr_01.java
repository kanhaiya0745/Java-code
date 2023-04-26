import java.util.*;
public class pr_01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Eneter a positive number");
        int number = sc.nextInt();

        if (number > 0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
    
        }
        sc.close();
    }

    
}
