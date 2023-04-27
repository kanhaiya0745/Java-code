
// program for cheking whethe the the number is prime or not by the optimization method.


public class prime_checking_09 {
    public static boolean isprime(int n){

        if(n==2){
            return true;
        }
        else{
            for(int i =2; i<Math.sqrt(n); i++){
                if(n%2==0){
                    return false;
                }

            }

        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(isprime(6));
        //System.out.println(isprime(13));

    }
}
