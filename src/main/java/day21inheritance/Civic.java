package day21inheritance;

public class Civic extends Honda{

    public void ecoSystem(){

        System.out.println("Using Civic is not expensive...");
    }

    public Civic() {
        super(2021);
        System.out.println("Civic Constructor...");
    }

    public Civic (boolean hybrid){
        this();
        System.out.println("Civic Constructor with boolean parameter worked...");

        }

}

