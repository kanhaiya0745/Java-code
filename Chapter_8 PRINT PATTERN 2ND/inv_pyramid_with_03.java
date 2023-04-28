// program for printing inverted pyramid with number;

public class inv_pyramid_with_03 {
    public static void inverted_pyramid_with_number(int n){

        // outer loop
        for(int i=1; i<=5; i++){
            // inner loops- Number

            for(int j =1; j<=n-i+1; j++){
                System.out.print(j+ " ");
            }
           // System.out.println();

        }
    }

    public static void main (String[] args){

        inverted_pyramid_with_number(5);
    }
}
