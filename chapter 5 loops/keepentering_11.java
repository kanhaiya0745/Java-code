import java.util.*;

public class keepentering_11 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter your number ");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
        
    }
    
}
