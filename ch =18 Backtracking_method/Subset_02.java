/* printing the subset of a string */

public class Subset_02 {
    public static void findSubset(String str, String ans, int i){

        // base case 
        if(i == str.length()){

            if(ans.length()==0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);

            }
            return ;
        }
        // RECURSION;
        
        // Choice yes;
        findSubset(str, ans+str.charAt(i), i+1);

        // choice no;
        findSubset(str, ans, i+1);
    }
    public static void main (String args[]){
        findSubset("abc", "", 0);

    }
}
