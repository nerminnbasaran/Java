package day03_typecasting_scanner;

public class WrapperClass01 {

    public static void main(String[] args) {

    /*
    Wrapper Class
    They are non-primitive data types. Non-Primitives have "values" and "methods".
    We can do many actions by using "methods", this is very useful.
    But primitives do not have any actions/methods with them.
    Java created a structure called "Wrapper Class" for primitive values and methods to become non-primitives.

    Primitive Data              Wrapper Class
    byte                        Byte
    short                       Short
    int                         Integer
    long                        Long
    float                       Float
    double                      Double
    char                        Character
    boolean                     Boolean

     */

     int i = 12 ; //primitive data type. There is no method.
     Integer number = 456 ; // non-primitive data type. There are many methods.

     char c = 'A' ;
     Character wc = 'A' ;

     // 1)Autoboxing : To convert "primitive data" to "wrapper class"

      byte b = 23;
      Byte wb = b; //java makes it automatically.We converted primitive data type value into non-primitive data type value.

     // 2)Unboxing : to use less memory we can use this method. To convert "wrapper class" to "primitive data"

     Short ws = 34 ;
     short s = ws ;


     //How to get the minimum and maximum values of numeric data types in Java

      System.out.println(Integer.MAX_VALUE);//2147483647
      System.out.println(Integer.MIN_VALUE);//-2147483648
      System.out.println(Short.MAX_VALUE);//32767

      System.out.println(Character.MAX_VALUE);//￿
      System.out.println(Character.MIN_VALUE);// 







    }


}
