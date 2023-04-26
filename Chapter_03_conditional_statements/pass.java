import java.util.*;

public class pass {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks");

        int marks = sc.nextInt();

        String result = (marks>=33) ? "pass" : "Fail";

        System.out.println("Your are is "+result);
        sc.close();
    }
    
}
