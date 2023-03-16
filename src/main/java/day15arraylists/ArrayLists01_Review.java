package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01_Review {
    public static void main(String[] args) {

        //Example 1: Create a String array, add 5 elements into the list, remove a specific element from the list.

        List<String> names = new ArrayList<>();
        names.add("Christian");
        names.add("Alex");
        names.add("Tommy");
        names.add("Adriana");
        names.add("Tom");

        System.out.println(names);//[Christian, Alex, Tommy, Adriana, Tom]

        boolean isRemoved=names.remove("Alex");
        System.out.println(isRemoved);//true

        System.out.println(names.remove(2));//Adriana

        ////Example 2 : Create an Integer List, add 6 elements into it, remove a specific element
        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(13);
        ages.add(7);
        ages.add(32);
        ages.add(1);
        ages.add(55);

        System.out.println(ages);//[12, 13, 7, 32, 1, 55]

      boolean IsRemove=  ages.remove((Integer)13);
        System.out.println(IsRemove);//true

        //Example 3: Create a String List, add 5 elements into it, remove the elements whose length is less than 6

        List<String> n = new ArrayList<>();
        n.add("Christian");
        n.add("Alex");
        n.add("Tommy");
        n.add("Adriana");
        n.add("Tom");
        System.out.println(n);//[Christian, Alex, Tommy, Adriana, Tom]

        for(int i=0;i<n.size(); i++){

            if(n.get(i).length()<6){
                n.remove(n.get(i));
                i--;
            }
        }
        System.out.println(n);//[Christian, Adriana]



    }
}
