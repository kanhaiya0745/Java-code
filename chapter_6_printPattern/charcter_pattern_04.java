import java.util.Scanner;

public class charcter_pattern_04 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n for printing the characters");
        int n= sc.nextInt();

        char ch = 'A';

        // outer loop
        for(int line = 1; line<=n; line++){
            // now going to define inner loop

            for(int chars = 1; chars<=line ; chars++ ){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
