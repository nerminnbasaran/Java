package questionbank;

public class StringManipulations {
    public static void main(String[] args) {

        //Create a String variable for city names which have just a single word.
        //Print the city name with the initial is in uppercase and all the other characters
        //are in lower cases on the console.
        //Example: mIAMI should be printed as Miami
        //miami should be printed as Miami
        //MIAMI should be printed as Miami
        //mIaMi should be printed as Miami etc.

        String s=" miAmI ";
        String updatedS=s.trim().toLowerCase();
        updatedS=updatedS.substring(0,1).toUpperCase()+updatedS.substring(1);

        System.out.println(updatedS);

        //Create 3 String variables for people's names. Print the sum of the number of characters in
        //all the 3 names except space characters.
        //Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.

        String s1="Ali Can";
        String s2="Merve Star";
        String s3="Mark Tom";

       Integer c1=s1.replaceAll(" ","").length();
       Integer c2=s2.replaceAll(" ","").length();
       Integer c3=s3.replaceAll(" ","").length();

        System.out.println(c1+c2+c3);

      //Create a String variable, print the total number of alphabetical and numeric characters in
      //the String on the console.
      //Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.

      String v=" Miami 33018!!! ";
      //Kitapta:
        Integer v1=v.replaceAll(" ","").replaceAll("[^A-Za-z0-9]","").length();

        System.out.println(v1);

      //benim yöntemim:
        Integer v2=v.replaceAll(" ","").replaceAll("\\p{Punct}","").length();

        System.out.println(v2);

       //Create a String variable, print the number of non-digit characters in the String on the console.
        //Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.

      String r2= "1a3Bcf4!...";

      Integer wr2=r2.replaceAll("[0-9]","").length();

        System.out.println(wr2);

      //YOU SHOULD REPEAT THIS TASK:Create a String variable and print just the last non-space character on the console for any String.
       //Example: For ‘Ali Can’ you should print n
        // For ‘Miami ’ you should print i etc.

    String m="Miami ";

    int indexOfLastNonSpace=s.trim().length()-1;

    String lastChar=m.substring(indexOfLastNonSpace,indexOfLastNonSpace+1);
        System.out.println(lastChar);

    //Create a String variable and find the sum of the ASCII values of the first and the last characters of the String.

    String str="Miami";

    int lastChar1=str.length()-1;
    int asciiOfFirst=s.charAt(0);
    int asciiOfLast=s.charAt(lastChar1);

    System.out.println(asciiOfFirst+asciiOfLast);

    //Create a String variable and print all characters except the first character on the console.
    //Example:If the String is ‘Java’ you should print ‘ava’ on the console.

    String a="Java";

   String aNew=a.replace("J","");

        System.out.println(aNew);

   //Create a String variable and print all characters except the last character on the console in Uppercases.
   //Example:If the String is ‘Java’ you should print ‘JAV’ on the console.

  int lastC=a.length()-1;

  String newA=a.substring(0,lastC).toUpperCase();

        System.out.println(newA);

  //Create a String variable and print all characters except the first character and the last character on the console in uppercases.
   //Example:If the String is ‘Java’ you should print ‘AV’ on the console.

    String aa=a.substring(1,lastC).toUpperCase();

        System.out.println(aa);
    //Type code to check if a String has just a single space character any position in the middle
        //Example: For ‘Ali Can’ your code should print false on the console
        //For ‘ Ali Can ’ your code should print false on the console
        //For ‘ Ali     Can ’ your code should print false on th

    String z=" Ali Can ";

    String trimmedZ=z.trim();

    String replacedSpace=trimmedZ.replaceAll(" ","");

    boolean ısThereAnySpaceInTheMiddle=trimmedZ.length()-replacedSpace.length()==1;

        System.out.println(ısThereAnySpaceInTheMiddle);

    //Type code to check if a String does not have any space character at the beginning and at
        //the end?
        //Example: For ‘ Ali ’ your code should print false on the console
        //For ‘Ali’ your code should print true on the console

    String b=" Ali  ";

    String trimmedB=b.trim();

    boolean anySpace =b.equals(trimmedB) ;

        System.out.println(anySpace);

    //12.Type code to check if a String has an uppercase initial and dot at the end.???
        //Example: For ‘Ali’ your code should print false on the console
        //For ‘ali.’ your code should print false on the console
        //For ‘ Ali. ’ your code should print false on the console
        //For ‘Ali.’ your code should print true on the console
        //For ‘ALI.’ your code should print true on the console

        String str1=" Ali. ";
        char firstChar=s.charAt(0);
        char lastCharr=s.charAt(s.length()-1);
        String trimmedStr1=str1.trim();


    //Type code to check if a password is valid or not for the following conditions;
        //Password must have at least 8 characters different from space character
        //Password must have at least 1 symbol
        //Example: For ‘A2b!’ your code should print false on the console
        //For ‘A2b3cdef’ your code should print false on the console
        //For ‘!1a23b4’ your code should print false on the console
        //For ‘!1a23b4?es’ your code should print true on the console
        //For ‘! a b 3 k’ your code should print false on the console

        String pwd="!1a23b4?es";

        //Password must have at least 8 characters different from space character

        Boolean firstRule=pwd.replaceAll(" ","").length()>=8;

        //Password must have at least 1 symbol

        Boolean secondRule = pwd.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length()>0;

        System.out.println(firstRule&&secondRule);

        //Type code to check if a String has a specific single character or not in three different ways.

        String s5="Java";

        boolean result=s5.replaceAll("[^v]","").length()>0;

        System.out.println(result);


        //Type code to get initials of the first name and the last name of a given name. Middle name
        //is out of scope.
        //Example: Tom Hanks ==> TH, Mary Star ==> MS

        String s6="Tom Hanks";

      String firstInıtial = s6.substring(0,1);
      String lastInıtial = s6.split(" ")[1].substring(0,1);
        System.out.println(firstInıtial+lastInıtial);

       //Type a code to find the number of punctuation marks used in a String.

        String s7 = "Wow! Ali is 13 years old, but he is a university student.";

        int totalNum=s7.length();
        System.out.println(totalNum);//57

        int updatedS7=s7.replaceAll("[\\p{Punct}]","").length();
        System.out.println(updatedS7);//54

        int punctNum = totalNum-updatedS7;
        System.out.println(punctNum);//3











    }
}
