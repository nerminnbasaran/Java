package day04scanner;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

    //Example 1: Get the initial of a name which contains first name and last name

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your name and last name,please");

    String fullName = input.nextLine();

    char first = fullName.charAt(0);

    char last = fullName.split(" ")[1].charAt(0); //split the name from space and go to last name (after splitting it is 1 char index value.) take the first character.

    System.out.println(first + " " + last); // T H














    }
}
