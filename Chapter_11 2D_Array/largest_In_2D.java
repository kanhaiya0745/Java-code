import java.util.*;
public class largest_In_2D {
  public static void largestNUmber(int matrix[][]){

    int largest = matrix[0][0];

    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[i].length; j++){

            if(matrix[i][j]>largest);
            largest = matrix[i][j];
        }
    }
    System.out.println(largest);
   // return largest;
  }

  public static void main(String args[]){
    int matrix[][] = new int[3][3];
    int n= matrix.length, m = matrix[0].length;

    Scanner sc = new Scanner(System.in);
    for(int i=0; i<m; i++){
        System.out.println("Enter the marks of student ");
        for(int j=0; j<n; j++){
          
            matrix[i][j] = sc.nextInt();
        }
    }

    // now printing 2D matrix 

    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }

    largestNUmber(matrix);

  }
}
