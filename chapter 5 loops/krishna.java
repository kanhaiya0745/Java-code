// printing the table enterd by the user

import java.util.Scanner;

public class krishna{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entered the number ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num+ "*" + i + "= " + num*i);
        }
        
    }
}