public class Diagonal_sum_03 {
    public static int Diagonal_matrix(int matrix[][]){
        int sum =0; 

        // for(int i =0; i<=matix.length-1; i++){
        //     for(int j =0; j<=matix[0].length-1; j++){
        //         if(i==j){
        //             sum += matix[i][j];
        //         }
        //         else if(i+j == matix.length-1){
        //             sum+= matix[i][j];
        //         }
        //     }
            
        // }

        // now calculating Diagonal sum with liner time time complexity;


        for(int i =0; i<matrix.length; i++){

            // pd---primary diagonal;
            sum += matrix[i][i];
             // sd--- secondary diagonal; 

            if (i!= matrix.length-i-1){
                sum+= matrix[i][matrix.length-1-i];
            }
        }
       
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] =  { { 1, 2, 3,4  },
                            { 5, 6, 7,8 },
                            { 9, 10, 11, 12 },
                            { 13, 14, 15,16 } };

        System.out.print("The diagonal sum is ");
            System.out.print(Diagonal_matrix(matrix));
        
    }
    
}
