// printing Dimond pattern in java

public class Dimond_09 {
    public static void Dimond(int n){

        // outer loop;

        for(int i=1; i<=n; i++){
            // now applying inner loop; ----> 1st HALF

            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            // Star;

            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
            // 2nd half of this code to reversing; 

        for(int i=n; i>=1; i--){
            // now applying inner loop; ----> 1st HALF

            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            // Star;

            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Dimond(5);
    }
    
}
