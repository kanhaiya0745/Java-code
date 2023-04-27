// product of 2 number by using function in java
import java.util.Scanner;

public class product_03 {
    
    public static int printProduct(int a, int b){

        int product = a*b;

        return product;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("product is = "+ printProduct(x, y));

        sc.close();
    }

}
