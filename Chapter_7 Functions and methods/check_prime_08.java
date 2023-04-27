// program for checking the number is prime or not;

public class check_prime_08 {
    public static boolean isprime(int n){
        
        if(n==2){
            return false;
        }

        else{
            // now applying loops here;
            for(int i= 2; i<n-1; i++){
                if(n%2==0){
                    return false;
                }
            }
            return true;
        }
    }

     // function for printing prime in range 

    public static void PrintInrange(int n){

        for(int i=2; i<n-1; i++){
            if(isprime(i)){   // true

                System.out.print(i+ " ");
            }
        }

        System.out.println();
    }
    public static void main(String[] args){
    System.out.println(isprime(50));

    PrintInrange(50);

    }
    
}
