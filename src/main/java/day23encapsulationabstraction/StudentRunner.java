package day23encapsulationabstraction;

public class StudentRunner {

    public static void main(String[] args) {

        Student myStd = new Student();

        String pyscho = myStd.getPsychologicalIssues();
        System.out.println(pyscho);//Depression

       myStd.setPsychologicalIssues("Bipolar");

        String pyscho2 = myStd.getPsychologicalIssues();
        System.out.println(pyscho2);//Bipolar

        boolean success1 = myStd.isSuccess();
        System.out.println(success1);//true

        myStd.setSuccess(false);

        boolean success2 = myStd.isSuccess();
        System.out.println(success2);//false

        Student yourStd =new Student();
        String psycho3 =yourStd.getPsychologicalIssues();
        System.out.println(psycho3);//Depression

    }
}
