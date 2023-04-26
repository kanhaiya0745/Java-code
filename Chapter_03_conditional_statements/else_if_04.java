import java.util.*;

public class else_if_04{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");

        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Adults :");
        }

        else if( age >13 && age<18){
            System.out.println("Teeneger");
        }
        else{
            System.out.println("Child");
        }
        sc.close();
    }

}

