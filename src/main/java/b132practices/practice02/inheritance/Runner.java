package b132practices.practice02.inheritance;

public class Runner {
    //Create a method that calculates the area of the circle (use inheritance for math operations)

    public static void main(String[] args) {
        areaOfCircle(7);
    }

    public static void areaOfCircle (int radius){
        Circle circle = new Circle();//to reach the number of pi we created an object
        System.out.println(circle.multiply(circle.numberOfPi,circle.findSquare(radius)));
    }
}
