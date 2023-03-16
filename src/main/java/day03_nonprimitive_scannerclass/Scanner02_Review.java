package day03_nonprimitive_scannerclass;

import java.util.Scanner;

public class Scanner02_Review {
    public static void main(String[] args) {
        //Example 1 : Get shirtPrice and shoePrice from user and print the total price on the console

        Scanner input = new Scanner(System.in);
        System.out.println("Enter shirtPrice ");
        double shirtPrice = input.nextDouble();
        System.out.println("Enter shoePrice");
        double shoePrice = input.nextDouble();
        System.out.println(shirtPrice+shoePrice);

    }
}
