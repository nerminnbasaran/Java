package day13arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02_Review {
    public static void main(String[] args) {

        //Example 1: Type code to check if a specific element exists in the array or not
        char ch[] = new char[5];
        ch[0] = 'A';
        ch[1] = 'Y';
        ch[2] = 'C';
        ch[3] = 'I';
        ch[4] = 'D';

        System.out.println(Arrays.toString(ch));//[A, Y, C, I, D]

        //1.Way:
        int counter =0;

        for(char w : ch){
            if(w=='Y'){
               counter++;
               break;
            }
        }
        if(counter>0){
            System.out.println("The element exist");
        }else{
            System.out.println("The element does not exist in the array");
        }

        //2.Way:with binarySearch()

        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));//[A, C, D, I, Y]

        int idx1 = Arrays.binarySearch(ch,'Y');
        System.out.println(idx1);//4




    }
}
