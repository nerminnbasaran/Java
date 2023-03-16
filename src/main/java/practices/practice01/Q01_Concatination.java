package practices.practice01;

public class Q01_Concatination {

    public static void main(String[] args) {

        //Initialize variable
        int age =21;
        int weight = 85;

        //Print variables with label

        System.out.println("age = " + age);//age. şeklinde yazınca bu şekilde açıklaması ile birlikte görünüyor.

        System.out.println(weight); //85
        System.out.println("weight = " + weight);//(with label) weight = 85

        //Copy the variable's value

        int myAge = age;
        System.out.println("myAge = " + myAge);//myAge = 21

        //Declare multiple variables in the same line

        int year = 2022, month = 12, day = 30 ;

        System.out.println("day = " + day);//day = 30
        System.out.println("year = " + year);//year = 2022

        //Update a variable

        year = 2023; //if we declared data types before we do not need to write it again when we update the variable

        System.out.println("year = " + year);//year = 2023


        //Declare a variable : x
        int x ;

        //Initialize another variable : y

        int y = 12;
        System.out.println("y = " + y);//y = 12

        //Initialize variable z;

        int z = 10;

        //Initialize x by using z;

        x = z;

        // Update the variables

        y=20;
        System.out.println("y = " + y);//y = 20


    }



}
