package day03_nonprimitive_scannerclass;

import java.util.Scanner;

public class Scanner04_Review {
    public static void main(String[] args) {

         /* Type a program which calculates the volume of a rectagular prism
       whose length, width and height are entered by user.
       Hint 1 : Volume of a rectangular prism is width*length*height

          */

        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter length, width and height of a rectangular prism");

        double l2 = input2.nextDouble();
        double w2 = input2.nextDouble();
        double h2 = input2.nextDouble();

        System.out.println("Volume of a rectangular prism: "+ w2*l2*h2);

    }
}
