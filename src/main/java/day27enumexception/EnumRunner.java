package day27enumexception;

import java.util.Arrays;

import static day27enumexception.UsStates.TEXAS;

public class EnumRunner {
    public static void main(String[] args) {

        String capital1 = UsStates.TEXAS.getCapital();
        System.out.println("capital1 = " + capital1);
        String abb1 = UsStates.ALABAMA.getAbbreviation();
        System.out.println("abb1 = " + abb1);
        System.out.println("UsStates.valueOf(\"TEXAS\").getStateName() = " + UsStates.valueOf("TEXAS").getStateName());

        System.out.println("UsStates.values() = " + Arrays.toString(UsStates.values()));


    }






}
