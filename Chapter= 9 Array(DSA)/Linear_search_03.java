// writing a program for linera search;

//import java.util.Scanner;

public class Linear_search_03{
    public static int Linear_search(int number[], int key){

        // Now finding the elements in array;
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;        
    }

    public static void main(String args[]){

        int number[]= {2, 4,6, 8,10, 12,14,16,18,20,22};
        int key = 16;

        int index = Linear_search(number, key);

        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.print("The index is"+index);
        }
    
    }
}