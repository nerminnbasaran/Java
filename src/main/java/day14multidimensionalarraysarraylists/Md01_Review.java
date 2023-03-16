package day14multidimensionalarraysarraylists;

import java.util.Arrays;

public class Md01_Review {
    public static void main(String[] args) {

        //Example 1: Convert 2 dimensional array to 1 dimensional array
        //          [ [5,3], [9,8,7] ] ==> [5,3,9,8,7]

        int [][] a = {{5,3}, {9,8,7}};

        int sum=0;//whenever we need addition we created a "sum container"
        for(int[] w : a){

            sum=sum+w.length;
        }
        System.out.println(sum);//5

        int b [] = new int[sum];

        int idx=0;
        for(int[] w : a){

            for(int k: w){

                b[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));//[5, 3, 9, 8, 7]

    }
}
