// program for printing Floyd triangle;


public class Floyd_04 {
    public static void main (String [] args){
        int n=5, counter =1;

        // outer loop
        for(int i=1; i<=n; i++){

            // inner loops
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    } 
}
