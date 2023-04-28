
// program for printing binary search;
/* in Binary search every element will be in sorted list  */

public class Binary_06 {
    public static int Binary_search(int number[], int key) {

        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // Comparsions

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) { // RIGHT
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int number[] = { 10, 12, 14 };
        int key = 14;

       // Binary_search(number, key);

        System.out.println("Index for key id : "+ Binary_search(number, key));
    }
}
