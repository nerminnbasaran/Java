package day09_loops;

public class Loops01 {
    public static void main(String[] args) {

    /*
    When we need to do "repeated actions" in Java we use loops
     */

     //Example 1:Type "Hi" for 5 times on the console
     //1.Way:
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

    //2.Way:Loops==>There are 4 types of loops in Java=> i)for-loop ii)while-loop iii)do-while loop iv) for each
    //      Starting value   Condition/Stop point value    Increment/Decrement
        for( int i=1        ;   i<6                     ;   i=i+1                  ){
            System.out.println("Hi");
        }

    //Example 2: Type all integers from 11 to 44 "in the same line" with a space between consecutive integers
    //            11 12 13 14 15....44

    for(int i=11; i<45; i=i+1){
        System.out.print( i + " ");
    }

    System.out.println();
    //Example 3: Type even integers from 11 to 44 in the same line with a space between consecutive integers
    // number%2==0

    for(int i=11; i<45; i=i+1 ){//i=i+1 yerine i++ olarak yazabiliriz.
        if(i%2==0){
            System.out.print(i+" ");
        }
    }

    /*

                        **************Increment************
          --Increasing by addition operation

          int i=12;
          1.way
          int i=i+3;
          int i=15;

          2.way
          i+=3; //They are in same functionality
          i=15;

          3.way:this way is applicable if you want to increase the number's value by 1 only
          i++; ==> i=i+1;

          --Increasing by multiplication operation

          int j=4;
          int j=j*3; ==> j*=3;
          j=12;            j=12;

                        *************Decrement*************
        --Decreasing by subtraction

         int k=10;
        1.way
         k=k-2;
         k=8;

        2.way
         k-=2;//these two syntaxes have some functionality
         k=8;

        3.way:this way is applicable if you want to decrease the number's value by 1 only
        k--;

       --Decreasing by division

        int m=24;
        int m= m/6; ==>  m/=6;
        m=4;             m=4;

     */
        System.out.println();
      //Example 4:Type "odd integers" from 68 to 13 in the same line with a space between consecutive integers

      for(int i=68; i>12; i--){
          if(i%2!=0){
              System.out.print(i+" ");
          }
      }
        System.out.println();
    //Example 5: Type code to print the letters from 'c' to 'u'
    // c d e f ...u

    for(char i='c'; i<'v'; i++){
        System.out.print(i+" ");
    }

    //Example: Type code to print integers from 0 to 100 without using any number in your code

    for(int i='a'-'a' ; i<'e' ; i++){
        System.out.println(i+" ");
    }

    /*
    We can use "int" as data type for char value
    If you use "char" as data type for "char"s Java gives you the character in return
    If you use "int" as data type for "char"s Java gives you the ASCII  value of the character
    */

    char ch='m';
        System.out.println(ch);

    int dh='m';
        System.out.println(dh);





















    }
}
