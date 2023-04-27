import java.util.Scanner;

public class practise {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Line ");
        int n = sc.nextInt();
        char ch = 'A';

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
