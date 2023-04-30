// program for insertion sort in arrays
import java.util.*;

public class insertion_03 {
    public static void insertion_sort(Integer arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while ((prev >= 0) && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;

        }
    }

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]) {
        Integer arr[] = { 5, 4, 1, 3, 2, };

        Arrays.sort(arr, 0, 5,Collections.reverseOrder());
        //insertion_sort(arr);
    
        printArr(arr);
    }
}
