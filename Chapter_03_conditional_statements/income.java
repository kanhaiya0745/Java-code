
// PROGRAM OF CALCULATING TAX BY GIVEN A EMPOLYEE/ PUBLIC. 
import java.util.*;
public class income {
    public static void  main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your income annually");
        float income = sc.nextFloat();
        int tax=0;
 
        if(income<500000){
            tax = 0;
        }
        else if((income<1000000) && (income>=500000)){
            tax = (int)(income*0.20);
        }

        else{
            tax = (int)(income*0.30);
        }
        System.out.println("Your tax is"+tax);
         sc.close();
        
    }
}
