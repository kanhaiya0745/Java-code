// program for checking the number is palidrone or not;
//palidrne----> A number after reversing the number both are equal then the number is palidrne for 
//  121 after reversing this is also 121 then it is palodrone;
// 321 after reversig this number we get 123 then  it is not palidrone;

import java.util.Scanner;
public class pr_03 {
    public static boolean isPalindrome (int number){
        
        int Palindrome = number;
        int reverse = 0;

        while(Palindrome!=0){
            int reminder = Palindrome%10;
            reverse = reverse*10 + reminder;
            Palindrome = Palindrome/10;
        }

        // if orginal and the reverse of a number is equal means
        //  numbers are palidrome in java

        if(number==reverse){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println("Enter a positive number :");
        Scanner sc = new Scanner(System.in);
        int Palindrome = sc.nextInt();

        if(isPalindrome(Palindrome)){
            System.out.println("Number : " + Palindrome + "is a Palindrome");
        }

        else{
            System.out.println("Number : " + Palindrome+" " + "is  not  a Palindrome");

        }
        sc.close();
    }
    
}
