package day14multidimensionalarraysarraylists;

public class Md03_Review {
    public static void main(String[] args) {

        // Example 1: Find the sum of the minimum and maximum elements in a multidimensional array
        //            [ [5, 4], [10, 6, 7] ] ==> 4+10 ==>14

        int [][] a = {{5,4}, {10,6,7}};
        int min = a[0][0];
        int max =a[0][0];
        for(int[] w : a){
            for(int k : w){
               min= Math.min(min,k);
               max=Math.max(max,k);
            }
        }
        System.out.println(min);//4
        System.out.println(max);//10
        System.out.println(min+max);//14



    }
}