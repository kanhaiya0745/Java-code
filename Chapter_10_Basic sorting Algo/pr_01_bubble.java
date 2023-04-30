// program for bubble sort in descending order;

public class pr_01_bubble {
    public static void bubble_sort_reverse(int arr[]){

        for(int turn = 0 ; turn <arr.length-1; turn++){
            // inner loop

            for(int j = 0; j<arr.length-1-turn; j++){
                if(arr[j]<arr[j+1]){
                    // then swap the value;

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

        public static void printArr(int arr[]){
            for(int i =0; i<arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
        
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        bubble_sort_reverse(arr);
        printArr(arr);
    }
}
