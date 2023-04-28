// program for taking input in array;

import java.util.Scanner;
public class ArrayDsA_01{
    public static void main(String args[]){

        int marks[]= new int[10];
        Scanner sc= new Scanner(System.in);

          //int phy;
        //phy = sc.nextInt();

        marks [0] = sc.nextInt();
        marks [1] = sc.nextInt();
        marks [2] = sc.nextInt();

        System.out.println("Phy : "+ marks[0]);
        System.out.println("chem : "+ marks[1]);
        System.out.println("math : "+ marks[2]);

      System.out.println("Length of array of marks"+marks.length);

      sc.close();
    }
}