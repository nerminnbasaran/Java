package day03_nonprimitive_scannerclass;

import java.util.Scanner;

public class Scanner01 {

    // To get data from user in Java, we use "Scanner Class"

    public static void main(String[] args) {

        // Steps to get data from user
        // 1) Create a Scanner Class Object

        //Class Name    object name     Assignment Operator     new     Constructor
        Scanner         input               =                   new      Scanner (System.in);

        // 2) Give a message to user
        System.out.println("enter your age...");

        //3) Get the data from user by using "input" object

        byte age = input.nextByte();

        System.out.println("Your age is " + age);



    }



}






















