import java.util.Scanner;

// WAP to print whether the number is odd or even 

public class even03 {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number which you want to check");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Number is an even number"+num);
        }

        else{
            System.out.println("Number is an odd number"+num);
        }
        sc.close();
    }
}
