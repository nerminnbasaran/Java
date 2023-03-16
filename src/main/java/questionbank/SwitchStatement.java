package questionbank;

public class SwitchStatement {
    public static void main(String[] args) {

        //Use switch statement to print
        //a) "Winter" for December, January, February
        //b) "Spring" for March, April, May
        //c) "Summer" for June, July, August
        //d) "Fall" for September, October, November
        //e) "Invalid month name" for all the others

        String monthName = "June";
        monthName =  monthName.toLowerCase();

        switch(monthName){
            case "december":
            case "january":
            case "february":
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Summer");
                break;
            case "september":
            case "november":
            case "october":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month name");
                break;

        }

        //Use a switch statement to print the name of the month when you enter the number of the
        //month. For example; if user enters 1 your code should print "January",
        //if user enters 2 your code should print "February" etc. if user enters invalid month number
        //your code should print "Invalid number”

        int month= 5;

        String monthString;
        switch (month){
            case 1 : monthString="January";
            break;
            case 2 : monthString="February";
            break;
            case 3 : monthString="March";
            break;
            case 4 : monthString="April";
            break;
            case 5 : monthString="May";
            break;
            case 6 : monthString="June";
            break;
            case 7 : monthString="July";
            break;
            case 8 : monthString="August";
            break;
            case 9 : monthString="September";
            break;
            case 10 : monthString="October";
            break;
            case 11 : monthString="November";
            break;
            case 12 : monthString="December";
            break;
            default : monthString= "Invalid month";
            break;
        }
        System.out.println(monthString);

        //Type a code which prints the all month names starting with the given month numbers.
        //Example: If the month number is 9 output will be September October November December

        int monthNum= 8;

        switch (monthNum){

            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");

        }

        //Print "Boy" if the gender is "Male" (Ignore cases)
        //Print "Girl" if the gender is "Female" (Ignore cases)
        //Print "Others" if the gender is different from "Male" and "Female"

        String gender = "Male";
        gender = gender.toLowerCase();

        switch (gender){
            case "male":
                System.out.println("Boy");
                break;

            case "female":
                System.out.println("Girl");
                break;
            default:
                System.out.println("Others");


        }

        //Type a code to display the number of days in a given month of a given year.
        //Example: The number of days in February of 2000 was 29

        int monthh = 2;
        int year = 2000;
        int numDays=0;

        switch (monthh){

            case 1: case 3: case 5: case 7:case 8: case 10 : case 12:
                numDays=31;
                break;
            case 4: case 6: case 9 : case 11:
                numDays=30;
                break;
            case 2:
                if(((year%4==0) && !(year%100==0)) || (year%400==0)){
                    numDays=29;

                }else{
                    numDays=28;
                }
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
        System.out.println("Number of Days=" + numDays);


        //Use switch statement to create a simple calculator which does addition, subtraction,
        //multiplication, and division with any 2 numbers
        //a) When user entered 10.2 and 5 and + sign your code should print "The result is 15.2" on the
        //console
        //b) When user entered 10 and 5 and - sign your code should print "The result is 5.0" on the
        //console
        //c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0" on the
        //console
        //d) When user entered 10 and -5 and / sign your code should print "The result is -2.0" on the
        //console
        //e) When user entered 10 and -5 and operation different from +, -, *, / your code should print
        //"That operation cannot be done"

        double a = 10.2;
        double b = 5;
        String operator = "+";

        switch (operator){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
               break;
            default:
                System.out.println("That operation cannot be done");
        }

        //Use switch statement to create a converter which converts mile to km, second to hour,
        //fahrenheit to celsius. Find the formulas for conversions from Google.
        //a) When user entered 10 and mileToKm String, your code should print "16 km" (The number
        //will be dynamic) on the console
        //b) When user entered 7200 and secondsToHours String, your code should print "2 Hours"(The
        //number will be dynamic) on the console
        //c) When user entered 83 and fahrenheitToCelsius String, your code should print "28.3333
        //celsius"(The number will be dynamic) on the console
        //d) When user entered operation different from mileToKm, secondsToHours, fahrenheitTo-
        //Celsius your code should print "That operation was not defined for that converter"
        double mile = 10;
        double seconds = 7200;
        double fahrenheit = 83;
        String opt = "fahrenheitToCelsius";

        switch (opt){

            case "miletoKm":
                System.out.println(mile*1.60934);
                break;
            case "secondsToHours":
                System.out.println((seconds/60)/60);
                break;
            case "fahrenheitToCelsius":
                System.out.println((fahrenheit-32)*5/9);
                break;
            default:
                System.out.println("That operation was not defined for that converter");
        }














    }
}
