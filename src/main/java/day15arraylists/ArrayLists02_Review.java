package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02_Review {
    public static void main(String[] args) {

        //Example 1: Create an integer list, add 5 elements into it, change the elements less than 10 to 77
        List<Integer> myList = new ArrayList<>();
        myList.add(13);
        myList.add(8);
        myList.add(25);
        myList.add(2);
        myList.add(10);
        System.out.println(myList);//[13, 8, 25, 2, 10]

        for(int w : myList){
            if(w<10){
                myList.set(myList.indexOf(w),77);
            }
        }
        System.out.println(myList);//[Christian, Adriana]

        //Example 2: Create an integer list and remove the duplicated elements
        //[2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> yourList = new ArrayList<>();
        yourList.add(2);
        yourList.add(3);
        yourList.add(2);
        yourList.add(2);
        yourList.add(5);
        System.out.println(yourList);//[2, 3, 2, 2, 5]









    }

}
