import java.rmi.server.RemoteRef;

public class search_2D_matrix_04 {
    public static boolean search_matrix(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.print("found at key "+"("+ row+","+ col+")");
                return true;
            }

            else if (key <matrix[row][col]){
                col--;
            }

            else if (key >matrix[row][col]){
                row++;
            }
        }
        System.out.println("Key not found in that matrix");
    return false;
        
    }
    public static void main(String args[]){
        int matrix[][] =  { { 1, 2, 3,4  },
                            { 5, 6, 7,8 },
                            { 9, 10, 11, 12 },
                            { 13, 14, 15,16 } };

        int key = 12;

        search_matrix(matrix, key);
    }
    
}
