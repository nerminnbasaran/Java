package b132practices.practice02;

import java.util.Scanner;

public class Q01_ForLoop_CharBetween {

    //Ask user to enter 2 chars and print on console the chars between them.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first char");
        char char1 = scanner.next().charAt(0);//we can put it into the int because int is greater than char-AutoWidening(TypeCasting)

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter second char");
        char char2 = scanner.next().charAt(0);

        int ch1 = Math.min(char1,char2);
        int ch2 = Math.max(char1,char2);//with these methods we fix the for-loop for typing z-a instead of a-z. this containers will take the min and max value, then we will work with them on the loop

        for(int i=ch1; i<ch2; i++){
            System.out.print((char)i+" ");//we will convert the ascii values to char -it is explicitly narrowing
        }




    }

}
