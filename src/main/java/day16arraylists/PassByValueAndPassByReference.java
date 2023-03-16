package day16arraylists;

public class PassByValueAndPassByReference {
    public static void main(String[] args) {

        /*
        1)PassByValue creates a copy of the value and uses the copy in the method.
        That is why methods can change just the copy not the original value.
        Java uses PassByValue to protect original values.

        2)Some programming languages like C# use PassByReference.
        PassByReference creates the copy of the reference (address of the object) and use the copy as if a real assigned
        value in methods.
        Copy reference and original reference point the original value that is why original value is updated
        by the methods.
        If you use PassByReference, you cna not protect original values.

         */
        int shirtPrice = 100;

        studentShirtPrice(shirtPrice,10);

        System.out.println(shirtPrice);

        veteransDiscount(shirtPrice,20);

        String name = "Ajda";

        String result =putExclamationMark(name);
        System.out.println(result);

        int salary = 20000;
        double newSalary =increaseSalary(salary);
        System.out.println("The increased salary is " + newSalary);//24000.0
        System.out.println(salary);//20000

        getAbsoluteValue(-5);
        System.out.println(getAbsoluteValue(-5));//5

       int abs = getAbsoluteValue(-5);
        System.out.println(abs);//-5



    }

    public static void studentShirtPrice(int shirtPrice, int discount){ //void mean type the output

       int discountedPrice = shirtPrice-discount;

        System.out.println(discountedPrice);//90

    }


    public static void veteransDiscount(int shirtPrice, int discount){

        int discountedPrice = shirtPrice-discount;

        System.out.println(discountedPrice);//80
    }

    //Java uses PassByValue ==> it does not change the actual assigned value of an object. Value of object is stabil
    // C uses PassByReference

    public static String putExclamationMark(String name){

        return name + "!";


    }

    // Create a method that increases the salary by %20

    public static double increaseSalary(double salary){

        return salary*1.2;

    }

    //Create a method that calculate the absolute value of an integer

    public static int getAbsoluteValue(int n){

        if(n<0){
            return n*-1;
        }else{
            return n;
        }

    }












}
