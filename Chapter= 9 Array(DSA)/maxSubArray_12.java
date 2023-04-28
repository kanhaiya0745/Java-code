// progaram for finding maximum sub array by kadens alogorithm;

public class maxSubArray_12 {
    public static void maxSubArray3(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0; 

        // applying loop 
        for(int i = 0; i<number.length; i++){
            cs = cs+ number[i];

            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("out max sub arrays sum is "+ ms);
    }
    public static void main(String[] args){
        int number[] = {-2, -3, 4,-1,-2,1,5};
        maxSubArray3(number);
    }   
}


