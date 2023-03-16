package practices.practice02;

public class Q04 {

    public static void main(String[] args) {

     /*
        Create a String variable and find the sum of ASCII values of the first and the last characters of the String.
        String s= "Miami";
     */

        String s= "Miami";

        int indexOfLastChar = s.length()-1;//it gives us automatically last character

        int AsciiFirst = s.charAt(0);

        int AsciiLast = s.charAt(indexOfLastChar);

        System.out.println("Total value of first and last characters: " + (AsciiFirst + AsciiLast));











    }


}
