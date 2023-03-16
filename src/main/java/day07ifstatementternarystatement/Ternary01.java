package day07ifstatementternarystatement;

public class Ternary01 {

    public static void main(String[] args) {

     //Example 1 : Type code to check if a number is even or not by using ternary.

     int num = 8;

     //1.Way : Use if else

      if(num%2==0){System.out.println("Even");} else {System.out.println("Odd");}

     //2.Way : Ternary
     //                 Condition   ?   The code will be executed   : The code will be executed
     //                                     for true condition              for false condition
        String result = num%2==0    ?      "Even"                  :         "Odd";

      System.out.println(result);


     //Example 2 : Type code to check if a number has 3 digits or not, use ternary

     int num2 = 143;

     num2 =Math.abs(num2);

     String res = num2>99 && num2<1000 ? "Three Digits" : "Not three digits";

     System.out.println(res);
    }
}
