// program for printing the pairs in java
public class pairs_08{
    public static void PrintPairs(int numbers[]){
        int tp = 0;

        // applying outer loop

        for(int i =0; i<numbers.length; i++){

            int curr= numbers[i];

            // inner loop

            for(int j = i+1; j<numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+")");

                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String args[]){

        int numbers[] = {2,4,6,8,10};
        PrintPairs(numbers);
        
    }
}