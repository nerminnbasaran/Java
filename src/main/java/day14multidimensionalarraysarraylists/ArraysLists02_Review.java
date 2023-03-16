package day14multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArraysLists02_Review {
    public static void main(String[] args) {


        //Example 1: Type code to print the elements of a list if the elements is greater than the number of elements in the list
        //           [5, 9, 3, 4, 6] ==>   9 - 6

        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(9);
        nums.add(3);
        nums.add(4);
        nums.add(6);

        System.out.println(nums);//[5, 9, 3, 4, 6]

        System.out.println(nums.size());//5

        for(Integer w : nums){
            if(w> nums.size()){
                System.out.print(w + " ");//9 6
            }
        }

    }
}
