// program for printing solid Rhombus pattern type ;

public class Rhombus_07 {
    public static void rhombus(int n){

        // outer loop;
        for(int i =1; i<=n; i++){

            // inner loop applying here;

            // Spaces;
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            // Star; 
            for(int k =1; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        //rhombus(5);
        rhombus(10);

    }
}
