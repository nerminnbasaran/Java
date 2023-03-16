package day16arraylists;

public class MethodCreation01 {
    public static void main(String[] args) {

        System.out.println(additionOfThreeInts(12,5,7));//24

        System.out.println(subtractIntegers(34,23));//11

        System.out.println(multiplyIntegers(39,23));//897

        System.out.println(divisionOfIntegers(10.0,3.0));//3.3333333333333335

    }

    public static int additionOfThreeInts(int a, int b, int c){

        return a+b+c;

    }

    public static int subtractIntegers(int a, int b){

        return a*b;
    }


    public static int multiplyIntegers(int a, int b){

        return a*b;
    }

    public static double divisionOfIntegers(double a, double b){

        return a/b;
    }


}
