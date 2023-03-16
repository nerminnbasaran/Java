package day22overriding_encapsulation;

import day23encapsulationabstraction.Student;

public class StudentRunner {
    public static void main(String[] args) {

        Student myStudent = new Student();

       String psycho= myStudent.getPsychologicalIssues();
        System.out.println(psycho);//Depression
    }


}
