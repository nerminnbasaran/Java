package b132practices.practice02.encapsulation;

import java.text.DecimalFormat;

public class BMI {

    private double weight;//we created a parameters
    private double height;

    public BMI(double weight, double height){//we create a constructor to assigned weight and height
        this.weight =weight;
        this.height=height;
    }

    public void calculateBMI(){//these method's access modifier must be public because we will use these methods outside the class

        double bmi = weight/(height*height);
        DecimalFormat decimalFormat = new DecimalFormat(".00");//we create an object for change the decimal part
        System.out.println("BMI: " + decimalFormat.format(bmi));

        if(bmi<18.5){
            System.out.println("Underweight");
        }else if(bmi>= 18.5 && bmi<25){
            System.out.println("Normal weight");
        }else if(bmi>=25 && bmi<30){
            System.out.println("Overweight");
        }else if(bmi>=30){
            System.out.println("Obese");
        }
    }
}
