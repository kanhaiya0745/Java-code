import java.util.*;
public class pr_02 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature of your body");
        double temp = sc.nextDouble();

        if (temp>103.0){
            System.out.println("you have fever, you need rest ");
        }
        else{
            System.out.println("you didn't have fever");
        }
        sc.close();

    }

    
}
