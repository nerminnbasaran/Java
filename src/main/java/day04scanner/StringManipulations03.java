package day04scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

    //Example 1: Check the password if it has given rules.
    // i) it should start with"J"
    // ii) it should have at least 8 characters.
    //iii) last 3 characters should be "AVA"

    String pwd = "J12!?AVA";
    boolean first = pwd.startsWith("J");
        System.out.println(first);//true

    //Note: There are comparison operators in Java ==> "==" , "<", ">" , ">=" , "!="(not equal)
    //While using comparison operators, you will get boolean data type object all the time.

    boolean second =pwd.length()>7; //we use boolean instead of int because we check the conditions.
        System.out.println(second);//true

    //Note: if you want to get characters from an index to the last index character use "substring() method" just with the starting index.
     boolean third = pwd.substring(5,8).equals("AVA");

        System.out.println(third);//true


    /*
    What we learned so far?

    1) charAt() ==> find the character at given index ==> return type -> char
    2) toUpperCase() ==> String
    3) toLowerCase() ==> String
    4) trim() ==> used for deleting the extra spaces from the beginning and ending of a String => return type String
    5) split() ==> to break a String value from the given character -> String
    6) length() ==> is used to find the total number of the characters of a String -> String
    7) substring(beginning index, ending index) ==> used to get the required part of a String -> String
    8) substring(beginning index) ==> will start getting the characters from the given value to the last index
    9) equals() ==> boolean
    10)equalsIgnoreCase() ==> boolean
    11) startsWith() ==> boolean

    Note: When you learn method in Java, you should learn
        i)  What does method do?
        ii) What are the different usages?
        iii)What does the method give you?

     */


    }
}
