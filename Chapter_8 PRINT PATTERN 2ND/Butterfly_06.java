// program for printing butterfly pattern

public class Butterfly_06 {
    public static void Butterfly(int n){
        //  1st half of the loop
        // Here outer loop;
        
        for(int i =1; i<=n; i++){
            //  inner loop -- logic what is to be printed in each line;
            
            // Stars
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }

            // spaces
            for(int k =1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            // Stars;
            for(int j =1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }

        //2nd half of this loop

        for(int i=n; i>=1; i--){
              // Stars
              for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }

            // spaces
            for(int k =1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            // Stars;
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args){
        Butterfly(60);
    }
    
}
