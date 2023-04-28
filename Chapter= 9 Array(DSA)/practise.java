// // calculating max sub array sum;

// public class practise {
//     public static void subfunction(int numbers[]){

//         int largest_sum = Integer.MIN_VALUE;
//         int toatal_sub_array= 0;

//         for(int i =0; i<numbers.length; i++){
            
//             for(int j =i; j<numbers.length; j++){

//                 int cs =0;
//                 for(int k =i; k<=j; k++){
//                     cs  = cs + numbers[k];
//                 }

//                 toatal_sub_array++;

//                 System.out.println(cs);

//                 if(largest_sum<cs){
//                     largest_sum = cs;
//                 }
//             }

           
//         }
//         System.out.println("largest sum of array is "+largest_sum);

//         System.out.println("sub array is "+ toatal_sub_array);

//     }
//     public static void main (String args[]){
//         int numbers[]= {2,4,6,8,10,12};
//         subfunction(numbers);
//     }

// }

// prefix array---> deterimines the ith sum of the of the current value and
// the time complexity of algorith is 0(n)

public class practise{
    public static void prefix_array(int arr[]){
        int ts= 0;
        int max_sum =0;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        // calculating prefix of array in java;
        for(int i =1; i<arr.length; i++){
            prefix[i] = prefix[i-1]+ arr[i];
        }
        for(int i =0; i<arr.length; i++){

            for(int j= i; j<arr.length; j++){

                int current_sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                ts++;

                System.out.println(current_sum);
                if(max_sum<current_sum){
                    max_sum = current_sum;
                }
            }
        }
        System.out.println("Total sub array is "+ts);
        System.out.println("The maximum sum is  "+max_sum);

    }
    public static void main(String args[]){
        int arr[]= {2,4,6,8,10}; 
        prefix_array(arr);
    }
}