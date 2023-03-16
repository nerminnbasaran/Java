package day22overriding_encapsulation;

public class Mammal extends Animal{

    public void feed(){
        System.out.println("Mammal's feed their babies with milk...");
    }

    public Animal occur(){
        return new Mammal();

    }


}
