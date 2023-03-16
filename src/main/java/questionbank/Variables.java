package questionbank;

public class Variables {
    public static void main(String[] args) {

        //Create double variables for the prices of any 3 items. Print the sum of the prices on the
       // console with a label.

        double shirtPrice=12.99,shoePrice=8.99,hatPrice=5.65;

        System.out.println(shirtPrice+shoePrice+hatPrice);

    //Create a float variable, a long variable, and an integer variable for any 3 items. Print the
    // multiplication of the values on the console with a label.

        float f=15.99F;
        long l=13L;
        int i=12;

        System.out.println(f*l*i);

    //Type a code to find simple interest.
    //Note: Simple interest formula = principal * rate * numberOfYear / 100

      int principal=2000,rate=8,numberOfYear=4;

      int simpleInterest=principal*rate*numberOfYear/100;

        System.out.println(simpleInterest);

    //Create a String and two Long variables. Print the sum and the multiplication of the long
    //variables with the String on the console.

      String str="Tom";
      Long o=12L;
      Long n=15L;

        System.out.println(str+(o+n));
        System.out.println(str+(o*n));

      //Create two boolean variables whose values are different and print their values in the same
      //line with a space between two consecutive values.

      boolean a=true;
      boolean b=false;

        System.out.println(a+" "+b);

      //Create 3 float variables for the price of a book, notebook, and laptop.
       //Print the total price of 2 books, 4 notebooks and 3 laptops on the console

      float bookPrice=5.99F;
      float notebookPrice=7.99F;
      float laptopPrice=10.99F;

        System.out.println((2*bookPrice)+(4*notebookPrice)+(3*laptopPrice));

      //Type a code to swap two integers.

      int i1=12;
      int i2=5;

      //1.Way
      int temp=0;

      temp=i1;
      i1=i2;
      i2=temp;
        System.out.println(i1+" "+i2);

    //2.Way

      i1=i1+i2;
      i2=i1-i2;
      i1=i1-i2;

        System.out.println(i1+" "+i2);

      //Create a short variable and convert it to an int variable.

       short s=5;
       int newS=s;


    //Create a long variable and convert it to an int variable.

      long q=12L;

      int newQ=(int)q;

    //Create a double variable and convert it to a float variable

        double d=5.99;

        float newD=(float) d;

    //Create a double variable and convert it to a short variable, then print the value of the short
    //variable on the console. Be careful about the output, it will not be a decimal value.

    double d1=20.99;

    short newD1=(short)d1;

        System.out.println(newD1);

    //Create a byte variable and convert it to a double variable, then print the value of the double
    //variable on the console. Be careful about the output, it will be a decimal number.

    byte b1=3;
    double newB1=b1;
        System.out.println(newB1);

    }
}
