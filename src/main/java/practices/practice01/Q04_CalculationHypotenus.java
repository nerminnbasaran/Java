package practices.practice01;

public class Q04_CalculationHypotenus {

    public static void main(String[] args) {

        //Type a code that calculates the hypotenuse.
        //Formula of hypotenuse: a²+b²=c²

        double a = 5;
        double b = 12;

        double c = Math.sqrt(a*a+b*b); // this method is non-primitive. java gives return type automatically.

        System.out.println(c);//13.0
        System.out.println("Hypotenuse is: " + c);//Hypotenuse is: 13.0








    }





}
