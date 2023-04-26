import java.util.*;

public class orginal_reverse_08 {
    
    public static void main(String args[]){
        int n=10899, rev=0,i;

        while(n>0){
            int lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n/=10;
        }
        System.out.println(rev);
    }
}
