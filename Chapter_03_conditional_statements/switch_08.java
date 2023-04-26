import java.util.*;
public class switch_08 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number b/w(1-5)");

        int number = sc.nextInt();

        switch(number){
            case 1 : System.out.println("Samosa");
            break;
            
            case 2 : System.out.println("Momos");
            break; 

            case 3 : System.out.println("Burger");
            break; 

            case 4 : System.out.println("pizza");
            break; 

            case 5 : System.out.println("jalebi");
            break; 
            default: System.out.println("We realize we are dreaming\n wake sir good mrng");
        }
        sc.close();
    }
    
}
