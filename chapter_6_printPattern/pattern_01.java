// // program printing * pattern in java

// import java.util.Scanner;

// public class pattern_01{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         // System.out.println("Enter Which you want to print");

//         for(int line=1; line<=4; line++){

//             //  one line code;
//             for(int star =1; star<=line; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

//     Or another method.



import java.util.Scanner;
public class pattern_01{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number how many number which you want to print");


        int n= sc.nextInt();

        for(int line =1; line<=n; line++){
            for(int star =1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}