import java.util.*;
public class Ternary_07_operator {
    public static void main(String args[]){
        
        System.out.print("Enter the number ");

        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();

        String type = ((number%2)==0) ? "even" :"odd";
     
        System.out.println(type);
    
        sc.close();
    }
}
