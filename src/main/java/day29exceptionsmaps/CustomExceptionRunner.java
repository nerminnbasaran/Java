package day29exceptionsmaps;

public class CustomExceptionRunner {

    public static void main(String[] args) throws IllegalGradeException {

        printAge(23);

      //printAge(-23);//IllegalAgeException - Negative ages are invalid

        printStudentGrade(23);
        printStudentGrade(-23);//IllegalGradeException
    }

    //Example 1: Create a method to print ages, the method will throw exception if the age is negative

    public static void printAge(int age){

        if(age<0){
            throw new IllegalAgeException("Negative ages are invalid...");
        }else{
            System.out.println("Your age is " + age);
        }

    }

    //Example 2: Create a method to print student grades, the method will throw exception if the student is negative or grater than 100

    public static void printStudentGrade(int grade) throws IllegalGradeException {

        if(grade<0 || grade>100){
            throw new IllegalGradeException("Negative and grater than 100 grades are invalid grades...");
        }else{
            System.out.println("Your grade is: " + grade);
        }
    }

}
