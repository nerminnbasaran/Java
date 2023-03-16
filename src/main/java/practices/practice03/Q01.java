package practices.practice03;

public class Q01 {
    public static void main(String[] args) {

     //Example 1: Type code to select the minimum one of two integers

     int a=35;
     int b=5;

     //1.Way: by using if else

     if(a<b){
         System.out.println("a is minimum");
     }else{
         System.out.println("b is minimum");
     }

     //2.Way: by using ternary

     int r1 =a<b ? a : b ;

        System.out.println("Minimum value is "+ r1);

    //Example 2: Type code to calculate absolute of an integer
    // 5 ==>5           0==>0  -5==> -1*-5==>5

    int c = -5;

   int r2 = c<0  ? -1*c : c;
        System.out.println("Absolute value is: "+ r2);

    // Example 3: If two integers are positive return the multiplication
    // Otherwise give a message like "I do not know how to multiply"

    int d =3;
    int e =4;

    Object r3=d>0 && e>0 ? d*e : "I do not know how to multiply";
        System.out.println("The result is: " +r3);

    //Example 4 : Type code to check if a number is positive or not

        int x =34;

       String r4= x>0 ? "Positive" : "Not Positive";
        System.out.println("The result is: " +r4);


    //Type code to check if an integer has 3 digits or not==>
    // Boundary Value Analysis--> -1000, -999, 100, -99, 0, 99, 999, 1000

     int z= -1000;

     int absZ=Math.abs(z);

   String r5= absZ>99 && absZ<1000 ? "ıt has 3 digits" : "ıt does not have 3 digits";
        System.out.println(r5);














    }
}
