package practices.practice02review;

public class Q03 {

    public static void main(String[] args) {

    /*
    String shirtPrice ="$ 12.99";
    String bookPrice = "$ 35.99";
    Type code to find the sum of the shirt and book prices.
    */

        String shirtPrice ="$12.99";
        String bookPrice = "$35.99";

        String shirt = shirtPrice.replace("$","");
        String book = bookPrice.replace("$","");

        double sd = Double.valueOf(shirt);//this will convert the data type of String "shirt" into double data type
        double bd = Double.valueOf(book);

        System.out.println(sd+bd);//48.980000000000004

        //Note: To be able to use valueOf() method, String must be in numeric format



    }

}
