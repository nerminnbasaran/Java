package day07ifstatementternarystatement;

public class IfStatement01 {

    public static void main(String[] args) {

        //Example 1: Type code to check if a given character is uppercase or lower case or others.

        char ch = 'S';

        if (ch >= 'A' && ch <= 'Z') {

            System.out.println("Upper case...");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case...");
        } else {
            System.out.println("Others...");
        }

        //Note 1 : To get true from "&&" operation everything should be true.
        //Note 2 : Just a single false is enough to make the result false.


        //Example 2: If a number is less than 300 or grater than 300
        // print "Perfect Number" on the console, otherwise
        // print "Regular Number" on the console.

        int num = 3200;

        if (num < 300 || num > 3000) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Regular Number");
        }

        //Note 3 : To get false from || operation everything should be false
        //Note 4 : To make the result of || operation, having just a single true is enough.

        //Example 3 : Type code to check if a number is "Even" or "Odd"
        int n = 8;
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

       //Example 4 : Type code to print the number of month for the given month name
       // February--> 2   May --> 5  December-->12   Tom--> Invalid month name

       String monthName = "March";

       if(monthName.equalsIgnoreCase("January")) {
           System.out.println(1);
       }else if(monthName.equalsIgnoreCase("February")){
           System.out.println(2);
       }else if(monthName.equalsIgnoreCase("March")){
           System.out.println(3);
       }else if(monthName.equalsIgnoreCase("April")){
           System.out.println(4);
       }else if(monthName.equalsIgnoreCase("May")){
           System.out.println(5);
       }else if(monthName.equalsIgnoreCase("June")){
           System.out.println(6);
       }else if(monthName.equalsIgnoreCase("July")){
           System.out.println(7);
       }else if(monthName.equalsIgnoreCase("August")){
           System.out.println(8);
       }else if(monthName.equalsIgnoreCase("September")){
           System.out.println(9);
       }else if(monthName.equalsIgnoreCase("October")){
           System.out.println(10);
       }else if(monthName.equalsIgnoreCase("November")){
           System.out.println(11);
       }else if(monthName.equalsIgnoreCase("December")){
           System.out.println(12);
       }else{
           System.out.println("Invalid month name");
       }






    }
}

