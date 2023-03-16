package day04scanner;

public class StringManipulations02 {

    public static void main(String[] args) {

    //Example 1: Get the first 4 characters from a String and convert them to lower cases.

    // Albania ==> Alba ==> alba

    String s = "Albania";

    String t = s.substring(0, 4).toLowerCase() ;
        System.out.println(t);//alba

    //Example 2: Check if two Strings are same or not.

        String r = "Java";
        String u = "java";

       boolean same =  r.equals(u);// equals()  only checks te values are same or not.

        System.out.println(same);//false because values  are different

        boolean sameIgnoreCase= r.equalsIgnoreCase(u); // with this method ignore the cases upper or lower

        System.out.println(sameIgnoreCase);//true

        //2.Scenario= "==" and equals gives you the same output.Java checks values and addresses.

        boolean sameEqualSign = r == u;
        System.out.println(sameEqualSign); //false because values and addresses are different

        // = means equals in Math
        // =  means assignment operator ın Java
        // == means equals in Java

        //why do not we use "==" to compare String values?
        String s1 = "TechPro";
        String s2 = "TechPro";

      boolean r1 = s1.equals(s2);
        System.out.println(r1);//true

      boolean r2 =  s1==s2;
        System.out.println(r2);// true ->if the values are same the output will be same after checking codes.


       String t1 = "Python";
       String t2 = new String("Python");

      boolean d1 = t1==t2;
        System.out.println(d1);//false-> because references are different.(I insist on java to create a"new" container.)

      boolean d2 =t1.equals(t2);
        System.out.println(d2);//true-> because equals() only checks the values are same or not.




    }
}
