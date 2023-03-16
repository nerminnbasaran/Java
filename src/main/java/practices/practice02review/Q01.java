package practices.practice02review;

public class Q01 {

    public static void main(String[] args) {

    //Example 1 :Type code to check if a String does not have any space character at the beginning and at the end
    //           ' Ali ' should print false on the console
    //           'Ali' should print true on the console

    String str = "Tom";

    String trimmedString = str.trim();

    boolean r1 = str.equals(trimmedString);

    System.out.println("Is there any space at the beginning and at the end? "+ !r1);//! means opposite the result



    }
}
