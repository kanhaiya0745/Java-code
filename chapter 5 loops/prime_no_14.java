import java.util.*;

public class prime_no_14 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");

        int n = sc.nextInt();

        if(n==2){
            System.out.println("The number is prime");
        }
        else{
            boolean isprime= true;
            
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    isprime= false;
                }
            }
            if(isprime==true){
                System.out.println("The number is prime");
            }
            else{
                System.out.println("The number is not prime");
            }
        }

    }
    
}
