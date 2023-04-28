// program for printing Hollow rectangle Rhombus pattern in java

public class Hollow_Rhombus_08 {
    public static void Hollow_Rhombus(int n){

        // outer loop;
        for(int i =1; i<=n; i++){

            // inner loops 
            // Spaces;
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Stars;

            for(int k=1; k<=n; k++){
                if(i==1 || i==n || k==1 || k==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               // System.out.println();
            }
             System.out.println();

        }
    }
    public static void main(String[] args){
        Hollow_Rhombus(5);
    }
    
}
