
// program for converting binary number  to decimal number ;


public class bin_to_decimal_10 {
    public static void binToDecima(int binnum){
        int Mynum= binnum;
        int pow = 0;
        int decNum =0;

        while(binnum>0){
            int last_digit = binnum%10;

             decNum = decNum + (last_digit*(int)(Math.pow(2, pow)));

             pow++;
             
             binnum= binnum/10;
        }
        System.out.println("decimal of "+ Mynum +"="+decNum);
    }

    public static void main(String args[]){
        binToDecima(101);

        binToDecima(112121);

        binToDecima(112);

        binToDecima(111);

    }

    
}
