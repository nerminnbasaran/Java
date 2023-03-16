package practices.practice01;

public class Q05_PrintingNumOneByOne {

    public static void main(String[] args) {

        // Write a Java program to break an integer into a sequence of individual digits.
        // Hint: use / (division operator) and % (modulus operator) ==> give the remainder of a division operation
        // x: input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5

        int number = 12345;
        int ones = number%10;
        System.out.println("ones = " + ones);//ones = 5

        int tens = (number/10)%10;
        System.out.println("tens = " + tens);//tens = 4

        int hundreds = (number/100)%10;
        System.out.println("hundreds = " + hundreds);//hundreds = 3

        int thousands = (number/1000)%10;
        System.out.println("thousands = " + thousands);//thousands = 2

        int tenThousands = (number/10000)%10;
        System.out.println("tenThousands = " + tenThousands);//tenThousands = 1


        int num = 12;
        int a = num%2;
        System.out.println("a = " + a);//a = 0

        int x = num%5;
        System.out.println("x = " + x);//x = 2
    }






}
