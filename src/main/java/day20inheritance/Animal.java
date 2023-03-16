package day20inheritance;

public class Animal {

    /*
    i)Inheritance prevents following issues;

    1)Repetitions
    2)Difficulty in updating codes
    3)Difficulty in fixing the codes
    4)Prevents atomic structure

    ii)Child classes can use methods or variables from parent classes but parent classes cannot use
    methods or variables from child classes

    iii)For "public" and "protected" access modifiers there is no issue in "inheritance"
        For "default" access modifier, if the child and parent class are in the same package inheritance is possible
        but if the child and parent class are in different packages inheritance is impossible

        For "private" access modifier, inheritance is impossible

    iv)"HAS-A" means "from parent to child", "IS-A" mean from "child to parent".
    v) Java does not accept multiple parents for a subclass, Java does not support multiple inheritance,
    Java supports single inheritance.


     */
    public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }


}
