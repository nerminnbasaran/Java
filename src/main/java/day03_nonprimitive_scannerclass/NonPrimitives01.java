package day03_nonprimitive_scannerclass;

import java.util.Scanner;

public class NonPrimitives01 {

    public static void main(String[] args) {

        /*
        What are the differences between "Primitive" and "Non-Primitive" data types?
        1) "Non-Primitive" data is stored in Heap memory, "Primitive" data is stored in Stack Memory.
        2) "Non-Primitive" data types are infinitely many, "primitive" data types are just 8.
        3) "Non-Primitive" data types can be created by Java and Java Developers, but "Primitive" data types can be
        created just by java.
        4) "Non-Primitive" data type names start with Upper-cases, "Primitive" data type names use just lower-cases.
        *5) "Non-Primitive" data types have i)Value and ii) Methods in them
        "Primitive" data types have i)Value

         */

        /*
        When you create a String, Java will check "String Pool" first, if the value you assigned to the String exists
        in the "String Pool", Java will not create a new container, Java will use existing container.

        But if the "String Pool" does not have the value you assigned, java will create a new container.

        Sometimes we may need a different container even the values are same. How can we do it?

         */
        String stdName = "Tom Hanks" ; //non-primitive data

        int age = 12;// primitive data

        String parentName = new String("Tom Hanks");



    }

}
