import java.util.*;


public class Internet {
    public static void findLargestElement(int[][] array) {
        int maxElement = array[0][0]; // Initialize maximum element as the first element in the array
    
        for (int i = 2; i < array.length; i++) { // Loop through the rows
            for (int j = 0; j < array[0].length; j++) { // Loop through the columns in each row
               // if (array[i][j] > maxElement) { // Compare each element to the current maximum
                    //maxElement = array[i][j]; // If a larger element is found, it becomes the new maximum

                    System.out.println(array[i][j]);
                //}
            }
        }
    
        //return maxElement; // Return the maximum element found
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
        //search(matrix, 10);
      //   System.out.println(findLargestElement(matrix));
      findLargestElement(matrix);
    }
    

}
