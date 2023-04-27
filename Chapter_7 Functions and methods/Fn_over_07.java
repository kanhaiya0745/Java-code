// program for function overloading using data types.

public class Fn_over_07 {
    public static int sum(int a , int b){
        return a+b;

    }
    public static float sum(float a , float b){
        return a+b;
    }

        
    public static void main (String args[]){
        System.out.println("Addation"+(sum(6,5)));

        System.out.println();
        System.out.println("Addation"+ (sum(6,5)));

    }
}
