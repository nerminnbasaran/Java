package questionbank;

public class IfStatement {
    public static void main(String[] args) {

        //Type code to print
        //a) "Winter" for December, January, February
        //b) "Spring" for March, April, May
        //c) "Summer" for June, July, August
        //d) "Fall" for September, October, November
        //e) "Invalid month name" for all the others

        String monthName="December";



        if(monthName.equalsIgnoreCase("December")||monthName.equalsIgnoreCase("January")||monthName.equalsIgnoreCase("February")){
            System.out.println("Winter");

        }else if(monthName.equalsIgnoreCase("March")||monthName.equalsIgnoreCase("April")||monthName.equalsIgnoreCase("May")){
            System.out.println("Spring");

        }else if(monthName.equalsIgnoreCase("June")||monthName.equalsIgnoreCase("July")||monthName.equalsIgnoreCase("August")){
            System.out.println("Summer");

        }else if(monthName.equalsIgnoreCase("September")||monthName.equalsIgnoreCase("October")||monthName.equalsIgnoreCase("November")){
            System.out.println("Fall");
        }else{
            System.out.println("Invalid month name");
        }

        //Type code to print
        //a) "Valid Password" if the password has at least 8 characters different from space
        //character
        //b) "Do not use space character in password" if the password has any space
        //character in any position
        //c) "Invalid Password" if a and b conditions are not satisfied
        //Note: Be careful about the orders of conditions in the solution


        String pwd="a1b2c3d4";


        if(pwd.replaceAll("[^\\s]","").length()>0){
            System.out.println("Do not use space character in password");

        }else if(pwd.replaceAll(" ","").length()>=8){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }

       //Type code to print
        //a) "Round up by last digit:" and print the rounded value if the last digit is greater than
        //or equal to 5
        //b) "Round down by last digit" and print the rounded value if the last digit is less than 5

        int i = 124;

        if(i%10>=5){
            System.out.println("Round up by last digit:" + (i/10+1)*10);
        }else{
            System.out.println("Round down by last digit"+ (i/10)*10);

        }

        //Type code to print the name of the month when you entered the number of the month.
        //        Example; For 1 output is "January", for 2 output is "February" etc.

        int numOfMonth = 5;
        if(numOfMonth==1){
            System.out.println("January");
        }else if(numOfMonth==2){
            System.out.println("February");

        }else if(numOfMonth==3){
            System.out.println("March");
        }else if(numOfMonth==4){
            System.out.println("April");
        }else if(numOfMonth==5){
            System.out.println("May");
        }else if(numOfMonth==6){
            System.out.println("June");
        }else if(numOfMonth==7){
            System.out.println("July");
        }else if(numOfMonth==8){
            System.out.println("August");
        }else if(numOfMonth==9){
            System.out.println("September");
        }else if(numOfMonth==10){
            System.out.println("October");
        }else if(numOfMonth==11){
            System.out.println("November");
        }else if(numOfMonth==12){
            System.out.println("December");
        }else{
            System.out.println("Invalid month number");
        }

    //Type code to print
        //a) "Isosceles Triangle" if two sides of a triangle are equal in length.
        //b) "Equilateral Triangle" if all sides of a triangle are equal in length.
        //c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied

        int s1=5;
        int s2=5;
        int s3=10;

        if(s1==s2 && s2==s3){
            System.out.println("Equilateral Triangle");
        }if(s1==s2 && s2!=s3 || s1==s3 && s2!=s3 || s2==s3 && s1!=s2 ){
            System.out.println("Isosceles Triangle");
        }else{
            System.out.println("Neither isosceles, nor equilateral");
        }


        //Type code to create a converter which converts mile to km, second to hour, fahrenheit to celcius
        //Find the formulas for conversions from Google.
        //a) When user entered 10 and mileToKm String, your code should print "16 km"(The
        //number will be dynamic) on the console
        //b) When user entered 7200 and secondsToHours String, your code should print "2
        //Hours"(The number will be dynamic) on the console
        //c) When user entered 83 and fahrenheitToCelsius String, your code should print
        //"28.3333 celsius"(The number will be dynamic) on the console

        double mile = 10;
        double seconds = 7200;
        double fahrenheit = 83;

        String operator = "fahrenheitToCelcius";

        if(operator.equals("mileToKm")){
            System.out.println(mile*160934);
        }else if(operator.equals("secondsToHours")){
            System.out.println();

        }else if(operator.equals("fahrenheitToCelcius")){
        System.out.println((fahrenheit-32)*5/9);

            }
        //Type code to check the grammatical rules for full name
        //a) Your code should print "Error in initials" for "ali Can", "Ali can", "ali can"
        //b) Your code should print "First name or last name missed" for single words like
        //"Ali" or "Can" or "ali"
        //c) Your code should print "Format error" for all the format like "ALI CAN"
        //d) Your code should print "Name was not entered" for one or more space
        //characters like " " or " "
        //e) Your code should print "Invalid Name" if the name has any character different
        //from letters and space.
        //Note: If the abbreviation has more than 1 error all related error messages should be
        //printed. For example; for "ali3" your code should print "Error in initials", "First name
        //or last name missed", and "Invalid Name"

        String fullName = "Ali Can?";

       String firstNameInitial= fullName.substring(0,1);
       String lastNameInitial = fullName.split(" ")[1].substring(0,1);

       boolean isFirstNameInitialUpperCase = firstNameInitial.charAt(0)>='A'&& firstNameInitial.charAt(0)<='Z';
       boolean isLastNameInitialUpperCase = lastNameInitial.charAt(0)>='A' && lastNameInitial.charAt(0)<='Z';

       Integer indexOfSpace = fullName.trim().indexOf(' ');

       if(indexOfSpace==-1){
           System.out.println("First name or last name missed");
       }else if(!isFirstNameInitialUpperCase || !isLastNameInitialUpperCase){
           System.out.println("Error in initials");
       }else if(fullName.replaceAll(" ","").length()==0){
           System.out.println("Name was not entered");
       }else if(fullName.replaceAll(" ","").replaceAll("[A-Za-z]","").length()>0){
           System.out.println("Invalid Name");
       }

       //Type code to check the format of state abbreviations in the USA
        //a) Your code should print "State abbreviations cannot have more than 2 characters" if the
        //abbreviation has more than 2 characters
        //b) Your code should print "State abbreviations cannot have lowercase characters" if the
        //abbreviation has lowercase characters
        //c) Your code should print "State abbreviations cannot have characters different from
        //letters" if the abbreviation has characters different from letters.
        //Note: If the abbreviation has more than 1 error all related error messages should be printed.
        //For example; for "fl3" your code should print, "State abbreviations cannot have more than
        //2 characters", "State abbreviations cannot have lowercase characters", and "State abbreviations
        //cannot have characters different from letters"
        //String stateAbbreviation

        String stateAbbreviation = "Fl3";

       if(stateAbbreviation.length()>2){
           System.out.println("State abbreviations cannot have more than 2 characters");
       }else if(stateAbbreviation.replaceAll("[^a-z]","").length()!=0){
           System.out.println("State abbreviations cannot have lowercase characters");
       }else if(stateAbbreviation.replaceAll("[^A-Za-z]","").length()!=0){
           System.out.println("State abbreviations cannot have characters different from letters");
       }

       //Type code to create a simple calculator which does addition, subtraction, multiplication,
        //and division with any 2 number
        //a) When user entered 10.2 and 5 and + sign your code should print "The result is
        //15.2" on the console
        //b) When user entered 10 and 5 and - sign your code should print "The result is 5.0"
        //on the console
        //c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0"
        //on the console
        //d) When user entered 10 and -5 and / sign your code should print "The result is -2.0"
        //on the console

        double a = 10.2, b=5;
        String opt = "+";

        if(opt.equals("+")){
            System.out.println("The result is" +(a+b));
        }else if(opt.equals("-")){
            System.out.println("The result is" +(a-b));
        }else if(opt.equals("*")){
            System.out.println("The result is" +(a*b));
        }else if(opt.equals("/")){
            System.out.println("The result is" +(a/b));
        }

        //Type code to print the messages about the Body Mass Index(BMI) for the given BMI values
        //Invalid BMI value < 0
        //Underweight = <18.5
        //Normal weight = 18.5–24.9
        //Overweight = 25–29.9
        //Obesity = BMI of 30 or greater

        double bmi = 27.7;

        if(bmi<0){
            System.out.println("Invalid BMI Value");
        }else if(bmi<=18.5){
            System.out.println("Underweight");
        }else if(bmi<24.9 && bmi>18.5){
            System.out.println("Normal weight");
        }else if(bmi<29.9 && bmi>25){
            System.out.println("Overweight");
        }else if(bmi>=30){
            System.out.println("Obesity");
        }






















}
}
