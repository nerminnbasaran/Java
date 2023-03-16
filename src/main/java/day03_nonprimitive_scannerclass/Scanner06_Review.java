package day03_nonprimitive_scannerclass;

import java.util.Scanner;

public class Scanner06_Review {
    public static void main(String[] args) {
         /*
        Ask user to enter his first and last name and address then print them on the console.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your address");
        String address = input.nextLine();


        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println(firstName + " " + lastName+" "+address);





    }
}
