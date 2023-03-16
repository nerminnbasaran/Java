package day06stringmanipulationsifstatement;

public class StringManipulations03 {

    public static void main(String[] args) {

      //Example 1 : Type code to check if given String contains a specific character or characters
      //            "New York"==> w--> true     - York--> true      -   Xxx--> false

      String s = "New York";

     boolean r1 = s.contains("w");
        System.out.println("Is it containing the given character? "+ r1);

     // Example 2 : Type code to change the first occurrence of "java" to "pyton"
     //             java is java, I like java ==>pyton is java I like java

     String t = " java is java, I like java";

     String updatedT = t.replaceFirst("java", "pyton");
     System.out.println(updatedT);//pyton is java, I like java


    //Example 3 : Type code to repeat a given String
    // "Java" 4 time==> JavaJavaJavaJava

    String u = "Java";

    //1.Way:
    String u1 = u+u+u+u;
        System.out.println(u1);

    //2.Way:
    String u2 =u.concat(u).concat(u).concat(u);
        System.out.println(u2);

    //3.Way:
    String u3 = u.repeat(4);
        System.out.println(u3);//JavaJavaJavaJava

    }
}
