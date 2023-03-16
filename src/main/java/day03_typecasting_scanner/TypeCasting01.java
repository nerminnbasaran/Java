package day03_typecasting_scanner;

public class TypeCasting01 {

    public static void main(String[] args) {

        /*
        There are 2 types of data type in java
        1)Primitive Data Types==> byte<short<int<long<float<double ==> numeric primitive data types

                                    boolean ==> true or false
                                    char ==> for a single character data

        2) Non-Primitive Data Types ==> String==> use for multiple different characters storage

        String str = "Tom";

        In non-primitive data types we can use actions with them.
        exp: String str ="tOm";
        str.toUpperCase();//TOM

        What are the differences between "Primitive Data Types" and "Non-Primitive Data Types"?

        1)Primitive Data Types have just value but Non-Primitive Data Types have values and methods

        2)Primitive Data Types are created by java, we can not create a  primitive data types
        But we can create Non-Primitive Data Types whenever we need.

        3) Primitive Data Types uses lower cases in naming convention and Non-Primitive ones uses Upper case in naming convention.

        4) Usage of memory for Primitive Data Types changes from data type to data type.
        But all Non-Primitive Data Types use same amount of memory in heap memory.

        There are 2 types of memory in Java.

        1) Stack memory => 1)Primitive data 2) References(addresses) of Non-Primitive data type are stored.

        2) Heap  memory=> stores Non-Primitive Data Types/values

        *Non-primitive data types stored in heap memory but their references stored in stack memory. Because heap memory is like a jungle

         */

        int a = 23 , i=12 ;

        String str = "Tom" ;
        System.out.println(a + i + str);//35Tom
        System.out.println(str + a + i);//Tom2312
        System.out.println(str + (a+i));//Tom35


    /*
    Type Casting

    1) AutoWidening
    Java can put small data types into large data types automatically.
    When you put small data type object into large data type object you are widening the small data type.

     */
    int n = 14;
    double d = n;

    /*
    2) Explicitly Narrowing
    Java does not put large data types into small data types automatically. Java thinks this is risky.
    But if we insist on it we do this with below syntax. We have to convert manually.
     */

     long numberLong = 345678906;
     short numberShort = (short) numberLong;

     int s= 20;
     byte b = (byte) s;





    }


}
