public class reverse {
    public static  void checkingReverse(int Number){
        int rev =0 ;

        while(Number>0){
        int last_digit = Number%10;
        rev = (rev*10)+last_digit;
        Number/= 10;
        }
        System.out.println(rev);
    }

    public static void main(String args[]){

        checkingReverse(89);

        checkingReverse(34567);

    }
    
}
