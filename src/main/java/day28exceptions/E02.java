package day28exceptions;

public class E02 {

    public static void main(String[] args) {

        printAge(23);//Your age is 23
        printAge(-23);//"Age can not be less than zero"

        printGrades(98);//Your grade is 98
        printGrades(980);//Grade can not less than zero or greater than 100

    }

    //Example 1: Create a method to print user's age on the console.
    //           If the age is negative the age should not be printed on the console.

    public static void printAge(int age){

        if(age<0){
            throw new IllegalArgumentException("Age can not be less than zero");
        }
        System.out.println("Your age is "+ age);

    }

    //Example 1: Create a method to print student's grade on the console.
    //           If the grade is less than zero or greater than 100, the method should throw Exception with a message

    public static void printGrades(int grade){
        if(grade<0 ){
            throw new IllegalArgumentException("Grade can not less than zero: " + grade);
        }else if(grade>100){
            throw new IllegalArgumentException("Grade can not greater than 100: " + grade);
        }
        System.out.println("Your grade is " + grade);
    }


}
