// program for converting decimal number into bineary number;

public class decimal_to_Binary_11 {
    public static void binToDecimal(int dec_number){

        int My_num = dec_number;
        int pow =0;

        int binNum = 0;

        while(dec_number>0){
            
          int  rem = dec_number%2;

           binNum = binNum+ rem*(int)(Math.pow(10,pow));

           pow++;
           dec_number/= 2;
        }
        System.out.println("Binary of "+ My_num+ " ="+ binNum);
    }

    public static void main(String args[]){
        binToDecimal(8);
        binToDecimal(15);

    }
}
