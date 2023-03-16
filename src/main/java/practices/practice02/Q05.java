package practices.practice02;

public class Q05 {

    public static void main(String[] args) {

        //1.Task: Count the alphabetical characters in a given value.

        String str= "Wow!...Ali is 13 years old and he is a university student!!!";

        int totalNumOfChars=  str.length();

        String strWithoutPunct= str.replaceAll("\\p{Punct}", "");

        System.out.println("strWithoutPunct = " + strWithoutPunct);//we use this method for punctuations

        int strWPLength= strWithoutPunct.length();

        int countOfAlphabeticalChars= str.replaceAll("[^A-Za-z]", "").length();//with this method we do not see punctuations and also spaces

        System.out.println("strWPLength = " + strWPLength);

        System.out.println("countOfAlphabeticalChars = " + countOfAlphabeticalChars);



}
}