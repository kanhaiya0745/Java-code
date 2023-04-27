// program for calculating the binomial coffient;

public class Binomial_05 {
    public static int factoril(int n){
        int factorial= 1;

        for(int i=1 ; i<=n; i++){
            factorial = factorial*i;
        }
        return(factorial);
    }

    public static int binn_cofficient(int n, int r){
        
        int fact_n = factoril(n);
        int fact_r = factoril(r);
        int fact_nmr = factoril(n-r);

        int binn_cofficient =fact_n/(fact_r*fact_nmr);

        return(binn_cofficient);

    }
    public static void main(String[] args){
        System.out.println(binn_cofficient(12,5));
        System.out.println(binn_cofficient(3,2));

    }

}
