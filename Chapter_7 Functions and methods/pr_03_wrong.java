public class pr_03_wrong {
    
   // program for checking the number is palidrone or not;

//palidrne----> A number after reversing the number both are equal then the number is palidrne for 
//  121 after reversing this is also 121 then it is palodrone;
// 321 after reversig this number we get 123 then  it is not palidrone;

    public static void reversing_num(int num){
        int my_num= num;

    int rev =0;
    while(num>0){
        int last_digit = num%10;
        rev = rev*10+ last_digit;
        num/=10;
        
    }

    if(num==rev){
        System.out.println(my_num+"=="+rev+"Number is pladrine");
    }
    else{
        System.out.println(my_num+"=="+rev+"Number is not pladrine");
    }

  //  System.out.print(rev);
    }

    public static void main(String[] args){
        reversing_num(121);
    }

}
