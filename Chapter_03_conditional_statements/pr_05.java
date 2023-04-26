// // program of leap year in java;

// import java.util.*;

// public class pr_05 {
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter year");

//         int year = sc.nextInt();

//         if((year %100 !=0)&& (year%4==0)){
//             System.out.println("This is leap year" +year);
//         }
//         else if ((year%100==0)&&(year %400 ==0)){
//             System.out.println("This is loop year"+year);
//         }
//         else{
//             System.out.println("This is not a loop year");
//         }
        
//     }
// }
                                // Or another method
import java.util.*;
public class pr_05 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");

        int year = sc.nextInt();

        boolean x = (year%4)==0;
        boolean y = (year%100)!=0;
        boolean z = ((year%100)==0)&& ((year%400)==0);

        if(x &&(y||z)){
            System.out.println("is a leap year program");
        }
        else{
            System.out.println("Not a leap year program");
        }

    }
}