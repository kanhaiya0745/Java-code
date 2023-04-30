// program for calculating selection sort;

public class selection_sort_02 {
    public static void selection_sort(int arr[]){

        for(int i =0; i<arr.length; i++){
            int minpos =i;

            // Now finding minimum elements from unsorted array;
            
            for(int j= i+1; j<arr.length; j++){
                if(arr[minpos]>arr[j]){
                      minpos = j;
                }
            }

           // now swap ;
           int temp = arr[minpos];
           arr[minpos] = arr[i ];
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
        int arr[] = {5,4,3,2,1};
        selection_sort(arr);
        printArr(arr);
    }
}
