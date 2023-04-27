// program of function overloading in java using type no of parametrs

public class Fn_overloading_06 {
    
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int multiply(int a, int b, int c){
        return a*b*c;
    }
    public static void main( String args[]){

        System.out.println("Afer multiplicatin the number is "+(multiply(6,5)));

        System.out.println();
        System.out.println(("Multiply is"+ multiply(6,5, 2)));
    }

}
