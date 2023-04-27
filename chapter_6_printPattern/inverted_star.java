// printing inverted star in java

public class inverted_star {
    public static void main (String [] args){

        int n= 4;
        for(int line =1; line<=4; line++){
            for(int s=1; s<=n-line+1; s++){
                System.out.print("*");

            }
            System.out.println();

        }
    }
    
}
