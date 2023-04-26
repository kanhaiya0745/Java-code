// Program for printing weak name by using switch case;

import java.util.*;

public class pr_03 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no for printing weak of day(1-7)");
        int weak = sc.nextInt();

        switch (weak) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;
            default :
                System.out.println("you have entered wrong number\n please enter the number b/w(1-7) \n");

        }
        sc.close();
    }
}
