package b132practices.practice02.encapsulation;

public class Runner {

    /*
        Type code to calculate BMI(Do NOT ignore security) --//it means making encapsulation

        The BMI is defined as the body mass divided by the square of the body height.
        Major adult BMI classifications are underweight(under 18.5 kg/m2), normal weight(18.5 to 25), overweight (25 to 30) and obese(30 and more)
     */

    public static void main(String[] args) {

        BMI bmi = new BMI(60,1.6);//we create an object to reach the methods
        bmi.calculateBMI();

    }


}
