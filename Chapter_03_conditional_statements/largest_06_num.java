import java.util.*;
public class largest_06_num {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the value of a,b,c");

        int a = sc.nextInt();
        int b=  sc.nextInt();
        int c = sc.nextInt();

        if((a>=b) && (a>=c)){
            System.out.println("a is larger"+a);
        }
        else if(b>=c){
            System.out.println("b is larger"+b);
        }
        else{
            System.out.println("c is larger"+c);

        }
        sc.close();
    }

    
}
