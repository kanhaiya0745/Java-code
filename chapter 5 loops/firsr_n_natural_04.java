import java.util.*;
public class firsr_n_natural_04 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n of printing the sum of first n natural number");
        int sum=0,i=1, n= sc.nextInt();
        
        while(i<=n){
            System.out.print(sum +" ");
            // sum+=i;
            sum = sum+i;
            i++;
        }
        // System.out.println(sum);

        sc.close();
    }
}
