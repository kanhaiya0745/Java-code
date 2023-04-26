// program that reads a set of integer and then prints the sum of even of odd integers.

import java.util.Scanner;

public class pr_02_even_odd {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do {
            System.out.println("Enter the number\n");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }
            System.out.println("Do you want to continue? press 1 for yes  or 0 for no.\n");

            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println(evensum);
        System.out.println(oddsum);

    }

}
