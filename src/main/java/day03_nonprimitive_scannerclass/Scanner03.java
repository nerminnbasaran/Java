package day03_nonprimitive_scannerclass;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

    //Example : Ask user to enter width and the length of a rectangle, then calculate
    //perimeter and the area of the rectangle.

    Scanner input = new Scanner(System.in);

    System.out.println("Enter width and length of the rectangle");

    double width = input.nextDouble();//23
    double length = input.nextDouble();//100

    System.out.println("Perimeter: "+ (2*width + 2*length));//246
    System.out.println("Area: " + (width*length));//2300








    }
}
