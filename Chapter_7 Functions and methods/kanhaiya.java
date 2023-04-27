public class kanhaiya {
    public static boolean checkprime(int num){
        if(num ==2){
            return true;
        }
        else{
            for(int i =2; i<num-1; i++){
                if(num%2==0){
                    return false;
                }
            }

            return true;
        }
    }
    public static void printInRange(int number){
        for(int i =2; i<number-1; i++){
            if(checkprime(i)){     // true
            System.out.print(i+" ");
            } 
        }
        System.out.println();
    
    }
    public static void main(String args[]){
        System.out.println(checkprime(12));
        printInRange(50);
    }
    
}
