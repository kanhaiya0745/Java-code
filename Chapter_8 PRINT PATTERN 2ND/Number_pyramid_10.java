// program for printing the Number pyramid pattern;

public class Number_pyramid_10 {
    public static void Number_pyramid(int n){

        // outer loop 

        for(int i=1; i<=n; i++){

            // inner loop;
            // spaces

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // for stars;

            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

            
        
    }
    public static void main(String[] args){
        Number_pyramid(5);
    }

}
