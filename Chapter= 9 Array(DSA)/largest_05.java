// program for printing largest number from an array;
//import java.util.*;
public class largest_05 {
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // APPLYING LOOPS FOR COMPARING THE VALUES;

        for(int i =0; i<number.length; i++){
            if(largest<number[i]){
                largest = number[i];
            }

            // appling loops for finding the smallest number;
            if(smallest >number[i]){
                smallest = number[i];
            }
        }
        System.out.println("The smallest number is = "+ smallest);
        return largest;
    }
    public static void main(String[] args){

        int number[] = {2,4,6,8,29, 99,10};

        System.out.println("Largest number = "+ getLargest(number) );
    }
}
