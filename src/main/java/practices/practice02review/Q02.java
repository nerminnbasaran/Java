package practices.practice02review;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

    //Ask user to enter an integer then print "Even" on the console if the number is even.

    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer");

    int number = input.nextInt();

    boolean checkedNum = number%2==0;

    System.out.println("Is the number even? " + checkedNum);

    //Check a number if it is odd or not

    Scanner input1 = new Scanner(System.in);

    System.out.println("Enter a digit to check if it is an odd number");

    int checkedOdd =input1.nextInt();

    System.out.println("Is the number odd? " + (checkedOdd%2!=0 ));








    }

}
