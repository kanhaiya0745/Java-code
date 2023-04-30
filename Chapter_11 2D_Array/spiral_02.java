/*program for printing sprix matrix --> spiral matix is basically it will print the outer boundry of cell 
Then it will print inner boundry of cell.*/

public class spiral_02 {
    public static void spiral_matrix(int matix[][]) {

        int start_row = 0;
        int start_col = 0;
        
        int end_row = matix.length - 1;
        int end_col = matix[0].length - 1;

        while (start_row <= end_row && start_col <= end_col) {

            // calculating top boundries;

            for (int j = start_col; j <= end_col; j++) { // j-->col
                System.out.print(matix[start_row][j] + " ");
            }

            // calculating Right boundries // i--->row ;
            for (int i = start_row + 1; i <= end_row; i++) {
                System.out.print(matix[i][end_col] + " ");
            }

            // calculating bottom boundries;
            for (int j = end_col - 1; j >= start_col; j--) {
                if (start_row==end_row) {
                    break;
                }
                System.out.print(matix[end_row][j] + " ");
            }

            // calculating left boundries ;

            for (int i = end_row - 1; i >= start_row + 1; i--) {
                if (start_col == end_col) {
                    break;
                }
                System.out.print(matix[i][start_col] + " ");
            }
            start_row++;
            start_col++;
            end_row--;
            end_col--;

        }

    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3,4  },
                            { 5, 6, 7,8 },
                            { 9, 10, 11, 12 },
                            { 13, 14, 15,16 } };

        spiral_matrix(matrix);
    }
}
