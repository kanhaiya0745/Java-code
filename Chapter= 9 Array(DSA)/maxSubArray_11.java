// program for printing max sub array by using prifix array

public class maxSubArray_11 {
    public static void maxSubArray2(int number[]){
        int max_sum = Integer.MIN_VALUE;
        int ts=0;

        int prefix[] = new int[number.length];
        prefix[0]= number[0];

        // calculating prefix array;

        for(int i =1; i<number.length; i++){
            prefix[i]= prefix[i-1]+number[i];
        }
        
        // here calulating sum of sub array;
        // outer loop;

        for(int i=0; i<number.length; i++){
            int start = i;

            // inner loop
            for(int j=i; j<number.length; j++){
                int end = j;

                int current_sum = start==0? prefix[end] : prefix[end]-prefix[start-1];
                System.out.println("The current sum is "+current_sum);
                
                ts++;

                if(max_sum<current_sum){
                    max_sum = current_sum;
                }
            }
        }
         System.out.println( "The maximum sum is "+max_sum);

        System.out.println("the total sub array is "+ ts);

    }
    public static void main(String[] args){
       // int number[] = {2,4,6,8,10};
       int number[] = {1, -2, 6, -1, 3};


        maxSubArray2(number);
    }
}

