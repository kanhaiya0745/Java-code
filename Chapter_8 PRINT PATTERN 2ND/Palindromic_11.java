/*  program for printing palindromic function ;
 palindromic function is basically after reversing the number and name it will be same for example

 madam, racecar, maam,  and numbers are 121, 131,999,11;
*/

public class Palindromic_11 {
    public static void Palindromic(int n){

        // outer loop; 
        for(int i =1; i<=n; i++){
            
            // inner loop;

            // Space;
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // descending  order;

            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            // Asscending order;
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        Palindromic(5);
    }
    
}
