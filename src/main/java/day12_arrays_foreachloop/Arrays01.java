package day12_arrays_foreachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*
        1)primitive variables and Strings can store just a single data in them.
        Sometimes we need to store multiple data in a single container. To be able to
        store multiple data in a single container, Java created a new structure called Arrays

        2)Arrays cannot store "non-primitives",if you see "non-primitives" were stored actually they are the
        references of non-primitives. Arrays can store  i)primitive data types ii)references of non-primitives

         */

        //How to create an Array

        String sixthGraders[]=new String[5];

        //How to print an Array on the console

        System.out.println(sixthGraders);//[Ljava.lang.String;@5594a1b5==>reference of Array.This syntax gives the address of the Array.
                                        // we need the array elements mostly to store multiple data in the same container.
                                        //to be able to see the elements of an Array we use the following syntax.

        System.out.println(Arrays.toString(sixthGraders));

        //How to add elements into an Array

        sixthGraders[1]="Ali";
        sixthGraders[4]="Angie";
        sixthGraders[0]="Tom";
        sixthGraders[3]="Mark";
        sixthGraders[2]="Jim";

        System.out.println(Arrays.toString(sixthGraders));


        //How to print a specific element or elements from an Array

        System.out.println(sixthGraders[1]);

        System.out.println(sixthGraders[0]+"-"+sixthGraders[4]);

        //How to find the number of elements in an Array

        int numOfElements=sixthGraders.length;

        System.out.println(numOfElements);//5

        //Example 1: Create a String Array, add 5 elements in it, type code to print
        // the sum of the characters in the first and the last element on the console.
        // Make your code dynamic

        String[] cities=new String[5];

        cities[0]="Miami";
        cities[1]="New York";
        cities[2]="Istanbul";
        cities[3]="Berlin";
        cities[4]="Tokio";

        int numOfCharsInFirstIndex=cities[0].length();// arrayName[]==> will always return the first element in an array

        int numOfCharsInLastIndex= cities[cities.length-1].length();//by typing our coding syntax that works for every single array's last index element
                                                                    //we need to type our code in dynamic way.When we type "cities[cities.length-1]"
                                                                    //we can always get the last index of an Array

        System.out.println(numOfCharsInFirstIndex+numOfCharsInLastIndex);

        //Example 2: Create a String Array, add 5 elements in it, type code to print
        //          the sum of all characters in all element on the console

        String[] names=new String[5];

        names[0]="Brad Pitt";
        names[1]= "Cuneyt Arkin";
        names[2]= "Ajda Pekkan";
        names[3]="Angeline Jolie";
        names[4]="Slyvester Stallone";

        int sum =0;

        //1.Way:using for loop

        for(int i=0;i< names.length;i++){

           sum=sum+ names[i].length();
        }
        System.out.println(sum);

        //2.Way:using for each loop

        int total=0;

        for(String w:names){ //has the same functionality with these sections--> (int i=0;i<names.length;i++).it always starts from index0
         total=  total+w.length();
        }
        System.out.println(total);

    /*
    Note 1: "for-each loop" can be used with "Arrays" and "Collections", if there is no Arrays and Collections
    you can not use for-each loop, you have to use for-loop or while-loop or do while loop

    Note 2: Sometimes for-each loop cannot be used with Arrays and Collections as well. When using indexes is a must,
    using for-each loop is impossible
     */





    }
}












