import java.util.*;

public class prime_no14 {
    public static void main(String args[]){
        Scanner sc = new Scanner( System.in);


        System.out.println("Enter the value of n for checking prime or not ");
        int n = sc.nextInt();

        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                System.out.println("Number is prime"+n);
            }
            else{
                System.out.println("Number is Not prime"+n);

            }


        }
    }
    
}
