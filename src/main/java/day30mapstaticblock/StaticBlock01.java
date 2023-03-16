package day30mapstaticblock;

import java.time.LocalDate;

public class StaticBlock01 {

    /*
        1)Other name of the "static variable" is "class variable"
          Because "Java Class Loader" loads the static variables together with the class.
          So static variables are created when the class was created
        2)Non-static variables I mean Instance or Object variables are created when you create an Object
        3)To initialize "static variables" we have two options
               i)Initialize directly like "public static int price=100;"
               ii)Initialize by using "Static Block"
               Why do we need "static block" to initialize a static variable?
               1)Sometimes to initialize a static variable, we need to type codes.
               To do that; use "static block"
               2)Static blocks are executed before everything in the class even main method
        4)There is "instance block" as well
          Instance Block is used if you want to execute same code in all constructors in a class
     */

    //public static int price;//static variables' other names is class variables because static variables are created together with the class
                            //If the variable is static they are loaded memory together with the class

   // public int year;//it is not static, java does not put it into the memory together with class.
                    //Java put it into the memory when create an object because this is object variable.


    public static int price;
        static{
            LocalDate d = LocalDate.now();

            if(d.getMonthValue()==2){
                price = 1000;
            }else{
                price = 2000;
            }
    }

    //public static void main(String[] args) { // we should have complete the class, and then we can run the main method. We do not need main method in this class.
    //    System.out.println("I am main");

    public int year;
        {
            System.out.println("I am instance block");
        }
        public StaticBlock01(){
            System.out.println("I am first constructor");
        }

        public StaticBlock01(int year){
            this.year = year;
            System.out.println("I am second constructor");
        }


}
