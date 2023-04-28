// program for printing linear search for string type of data 

public class homework_04 {
    public static int linear_program(String menu[], String key){
        for(int i = 0; i<menu.length; i++){
            if(menu[i]== key){
                return i;
            }
        }
        return -1;                
    }
    public static void main(String[] args){

        String menu[] = {"chilli","chole bhature", "Burger", " Finger", "Samosa"};
        String key = "Samosa";

        int index = linear_program(menu, key);

        if(index ==-1){
            System.out.println("This food is not avilable ");
        }
        else{
            System.out.println("it's avilable at the index of = "+index );
        }

    }
}
