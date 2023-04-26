// program of

import java.util.Scanner;
public class pr_04_table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number !");
        int num = sc.nextInt();
        int table;
    
        // now applying loop for printing table;
        
        for(int i =1; i<=10; i++){
            num = num*i;
        }
        System.out.println("table \n"+num);
    }
}
