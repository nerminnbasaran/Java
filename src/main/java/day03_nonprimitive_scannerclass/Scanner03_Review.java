package day03_nonprimitive_scannerclass;

import java.util.Scanner;

public class Scanner03_Review {
    public static void main(String[] args) {

        //Example : Ask user to enter width and the length of a rectangle, then calculate
        //perimeter and the area of the rectangle.

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter width of a rectangle");
        double w = input1.nextDouble();
        System.out.println("Enter length of a rectangle");
        double l = input1.nextDouble();

        System.out.println("Perimeter: "+ (2*w + 2*l));
        System.out.println("Area: " + (w*l));
    }
}
