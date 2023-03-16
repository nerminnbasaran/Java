package day09_loops;

public class ForLoops02 {
    public static void main(String[] args) {

    //Example 1: Put * between 2 consecutive characters and to the end in a String
    // For example; "Java"==> J*a*v*a

    String s="Java";

    for(int i=0;i<s.length();i++){
        System.out.print(s.charAt(i) + "*");
    }

        System.out.println();

    //Type code to print unique characters in a String
    //Hello==> Heo
    String str="Hello";

    for(int i=0; i<str.length(); i++){

        char ch=str.charAt(i);

        if(str.indexOf(ch)== str.lastIndexOf(ch)){
        System.out.print(ch);
        }
    }
        System.out.println();

    //Example 3: Type code to print a String in reverse
    // For example: Ali Can==> naC ilA

    String u="Ali Can";

    for(int i=u.length()-1;i>=0;i--){

       char ch1=  u.charAt(i);

       System.out.print(ch1);
    }
       System.out.println();

    //Example 4: Type code to find the sum of the integers from 3 to 7

    int sum=0;

    for(int i=3; i<8;i++){

    sum = sum+i;

    }
       System.out.println(sum);//we wrote this outside the curly braces because we need to print last value of the loop










    }
}
