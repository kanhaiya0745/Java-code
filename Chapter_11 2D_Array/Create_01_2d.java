// program for creating 2d array, and searching the element whether it is found it or not;

import java.util.Scanner;
public class Create_01_2d{

    public static  boolean search(int matrix[][],int key){
        for(int i = 0 ; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Elemetns is found at cell"+"("+i+","+j+")");

                    return true;
                }
            }
        }
        System.out.println("Key is not exisit in matrix ");
        return false;


    }
    public static void main(String args[]){

        int matrix [][] = new int [3][3];

        int m = matrix.length, n = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i<m; i++){
            System.out.println("Enter the marks of student : " + i);
            for(int j =0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Now printing 2D matrix;
        
        for(int i = 0 ; i<m; i++){
            for(int j =0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
           System.out.println();
        }
        search(matrix, 10);
    }

}