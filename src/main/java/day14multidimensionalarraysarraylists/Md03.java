package day14multidimensionalarraysarraylists;

public class Md03 {
    public static void main(String[] args) {

       // Example 1: Find the sum of the minimum and maximum elements in a multidimensional array
       //            [ [5, 4], [10, 6, 7] ] ==> 4+10 ==>14

       int a[][] = { {5, 4},{10, 6, 7} };

       int sum = 0;
       int small= a[0][0];//diğer değerlerle kıyaslayabilmek için inner arraydeki ilk grubun ilk değerini seçtik.
       int big  = a[0][0];
       for(int[] w : a){

           for(int k : w){

               small = Math.min(small, k);
               big=Math.max(big,k);
           }
       }
        System.out.println(small);
        System.out.println(big);
        System.out.println(small+big);

    }
}