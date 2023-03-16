package day03_nonprimitive_scannerclass;

import java.util.Scanner;

public class Scanner06 {


    public static void main(String[] args) {

        /*
        Ask user to enter his first and last name and address then print them on the console.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your address...");
        String address = input.nextLine();
        input.nextLine();

        System.out.println("Please enter your first name...");

        String firstName =  input.next();

        System.out.println("Please enter your last name...");

        String lastName = input.next();

        System.out.println(firstName + "" + lastName+address);
        System.out.println(address);


    }
}
