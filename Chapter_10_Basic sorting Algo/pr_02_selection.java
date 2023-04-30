// program for selection sort in reverse order;

public class pr_02_selection {
    public static void selection_sort_reverse(int arr[]){

        for(int i =0 ; i<arr.length-1; i++){
            int minpos =i;

            for(int j =i+1; j<arr.length; j++){
                if(arr[minpos]<arr[j]){
                    minpos = j;

                }
            }

            // swap

            int temp = arr[minpos];
            minpos = arr[i];
            arr[i] = temp;
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
        selection_sort_reverse(arr);
        printArr(arr);

    }
}
