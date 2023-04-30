// program for calculating bubble sort algorithm of an elements
public class Bubble_Sort_01 {
    public static void Bubble_sort(int arr[]){
        int swap = 0; 

        for(int turn = 0; turn<arr.length-1; turn++){
            // inner loop


            for(int j =0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap++;
                }
            }
        }
        System.out.println("Swap is "+ swap);
    }

    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {4,5,1,2,3};
        Bubble_sort(arr);
       printArr(arr);
    }
}
