package questionbank;

public class TernaryStatement {

    public static void main(String[] args){

        //Use ternary to print "Valid Password" if the password has at least 8 characters different
        //from space characters. "Invalid Password" if the password has less than 8 characters
        //different from space character

        String password = "a1b 2c3";

       String validPwd = password.replaceAll("[ ]","").length()>7 ? "Valid Password" : "Invalid Password";
        System.out.println(validPwd);

        //Use ternary to print
        //a) "Isosceles Triangle" if two sides of a triangle are equal in length.
        //b) "Equilateral Triangle" if all sides of a triangle are equal in length.
        //c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied

        int a = 5, b = 4, c = 3;
        String typeOfTriangle = a==b && b==c ? "Equilateral Triangle" : (a==b && b!=c || a==c && b!=c || b==c && a!=c ? "Isosceles Triangle" : "Neither isosceles, nor equilateral");
        System.out.println(typeOfTriangle);

        //Use ternary to print
        //a) "Round up by last digit" and print the rounded value if the last digit of an integer is greater
        //than or equal to 5
        //b) "Round down by last digit" and print the rounded value if the last digit of an integer is less
        //than 5
        //For example; 127 will be rounded up and the value will be 130
        //125 will be rounded up and the value will be 130
        //123 will be rounded down and the value will be 120

        int i = 125;

       String roundedValue = i%10>=5 ? ("Round up by last digit " + (i/10+1)*10) : ("Round down by last digit " + (i/10)*10);

        System.out.println(roundedValue);

        //Type Apex code by using nested ternary.
        //Write a program to check if a year is a leap year or not.
        //If the year is divisible by 100 then it must be divisible by 400.
        //If a year is not divisible by 100 then it must be divisible by 4.

        int year = 1996;

        String leapYear = year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap Year" : "Not Leap");

        //Type code to check the password
        //If it has more than 8 characters, initial should be 'i'
        //If it does not have more than 8 characters initial should be 'K'
        //Solve the task by using nested-ternary

        String p = "XXXXXXXXX";

        String pwdResult = p.length()>8 ? p.startsWith("i") ? "Valid" : "Invalid" : p.startsWith("K") ? "Valid" : "Invalid";
        System.out.println(pwdResult);

        //Type code to calculate the absolute value of a number
        //For positive numbers and zero absolute value is the same with the number
        //For negative numbers to find absolute value multiply the number by -1

        int w = -5;

        int absValue = w>=0 ? w : w*-1;
        System.out.println(absValue);

        //Write a program to print the minimum of 2 integers on the console by using ternary

        int i1 = 13, k = 12;
        int result = i1<k ? i1 : k;
        System.out.println(result);


        //If the number has 3 digits, the output will be “This number has 3 digits.” Otherwise, the
        //output will be “This number has no 3 digits.”

        int num = 123;

        String numResult = (num<1000 && num>99) || (num>-1000 && num<-99) ? "This number has 3 digits." : "This number has no 3 digits.";
        System.out.println(numResult);


        //Print 'Even' for even integers, print ‘Odd’ for odd integers by using ternary

        int even = 14;

        String evenResult = even%2==0 ? "Odd" : "Even";
        System.out.println(evenResult);

        //If the number is positive print ‘Positive’, otherwise print ‘Not positive’ on the console by
        //using ternary.

        int pos = 35;

        String posResult = pos>0 ? "Positive" : "Negative";
        System.out.println(posResult);
















    }

}
