// printing all the prime number in a range

public class practtise {
    public static  void isprime(int num){

        if(num==2){
            System.out.print("Number is prime"+  num);
        }

        else {
            boolean check = true;
            for(int i = 2; i<num-1; i++){
                if(num%i==0){
                    check=false;
                   // System.out.println("Number is  prime number"+ num);
                    //break;
                }
            }

            if(check==true){
                System.out.println(num+ "Number is   prime number"+ num);

            }

            else{
                System.out.println(num+ "Number is not a prime number");
            }
        }
    }

    public static void main (String[] args){
        isprime(9);
    }
    
}
