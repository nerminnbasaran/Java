package b132practices.practice02.inheritance;

public class Mathematics {

    public double multiply(double... x) {
        double result = 1;
        for (double w : x) {
            result = result * w;
        }
        return result;
    }

    public double findSquare(double x) {
        return x * x;
    }
}
