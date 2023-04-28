// REVERSE OF A NUMBER IN JAVA;

public class Reverse_07 {
    public static void Reverse(int number[]){

        int first =0, last =number.length-1;

        while(first<last){
            // swap

            int temp = number[last];
            number[last]= number[first];
            number[first] = temp; 

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14,16, 18,20, 22, 24};
        Reverse(number);

        // printing the reverse number;

        for(int i =0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }

        System.out.println();

        System.out.println("Program is sucessfully Run");
    
    }
}
