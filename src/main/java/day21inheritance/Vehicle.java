package day21inheritance;

public class Vehicle {

    /*

    1)Every Class except Object Class has parent class in Java
    2)Object Class is the parent class of all Classes in Java
    3)Just Object Class does not have any Parent Class in Java

    4)Java executes "Constructors" from top to bottom in inheritance
    5)To be able to execute "Constructors" from top to bottom, Java goes to "Object Class" as default execution,
    firstly by the help of "super()" code.
    6)super() is for calling from the first level "parent class" (closest parent).
    7)super() is located by Java into every constructor but it is invisible
    8)If you want to make visible you can type it explicitly.
    9)When you type "super()" explicitly, you have to type it into the first line inside the constructor body.

    10)"this()" is for calling constructor from the class itself
    11)When you type "this()" you have to type it in the first line of constructor body.
    12)"this()" and "super()" cannot be used in the same constructor body together, because if you put anyone of them
    the other line can accept the second one.

    13)If a variable exists in a Class Java uses the variable from the class itself
    14)If a class does not have the requested variable in it, Java looks for the variable in the parent class
    15)If you use "this" inside the constructor, it means you are calling a variable from the class itself
    16)If you use "super" inside the constructor, it means you are calling a variable from the first level parent class.

        What is the difference between "this()" and "super()" ?
        Answer: "this()" is for calling constructor from the class itself.
                "super()" is for calling constructor from the first level parent class.

        What is the difference between "this()" and this?
        Answer: "this()" is for calling constructor from the class itself.
                "this" is for calling object from the class itself.

        What is the difference between "super()" and "super"?
        Answer:  "super()" is for calling constructor from the first level parent class.
                 "super" is for calling object from the first level parent class.

         OOP(Object-Oriented Programming) Concept has 4 principles;
         1)Inheritance +
         2)PolyMorphism --> MethodOverloading(+) + MethodOverriding(-)
         3)Encapsulation -
         4Abstraction --> Abstract Classes and Interfaces

     */

    public void move(){ //These are methods. Actions for object

        System.out.println("All vehicles move...");
    }

    public void price(){

        System.out.println("To bu a vehicle, you should pat the price...");
    }

    public Vehicle() { //This is constructor for our object creation.

        System.out.println("Vehicle Constructor...");

    }

    public Vehicle(String name){
        System.out.println("Vehicle Constructor with String parameter worked...");
    }

}
