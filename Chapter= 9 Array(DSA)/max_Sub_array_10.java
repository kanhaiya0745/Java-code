// calculating max sub array in java

public class max_Sub_array_10 {
    public static void maxSubArray(int numbers[]){
        int max_sum = Integer.MIN_VALUE;
        int ts = 0;

        // outer loop

        for(int i=0; i<numbers.length; i++){
            int start = i;

            // inner loop

            for(int j = i ; j<numbers.length; j++){
                int end = j;
                int current_sum = 0;

                for(int k = start; k<=end; k++){
                     current_sum += numbers[k];
                }
                ts++;
                
                System.out.println(current_sum);

                if(max_sum<current_sum){
                    max_sum = current_sum;
                }
            }
        }
        System.out.println("Total sub array is"+ ts);
        System.out.println("Max  sum"+ max_sum);

    }
    public static void main(String args[]){
        //int number[] = {2,4,6,8,10};
        int number[] = {1, -2, 6, -1, 3};
        maxSubArray(number);

    }
}

// Time compexity of this code is big of n cube;
