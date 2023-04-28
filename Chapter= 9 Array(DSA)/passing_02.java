// program for passing arrays as argument;
//import java.util.Scanner;
public class passing_02 {
    public static void update(int marks[], int nonchangable){

         nonchangable =10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }

    public static void main(String[] args){
        int marks[] = {96,97,98};

        int nonchangable =5;
        update(marks, nonchangable);

        System.out.println(nonchangable);
        // print our marks; 
        for(int i=0; i< marks.length; i++){
            System.out.print(marks[i]+" ");
        }

    }
}
