package day20inheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat myCat = new Cat();

        myCat.eat();//Animals eat...
        myCat.drink();//Animals drink...
        myCat.meow();//Cats meow...

        Dog myDog = new Dog();// creating an object like a creating hands for reaching the methods.
        myDog.eat();
        myDog.drink();
        myDog.bark();

        Bird myBird = new Bird();
        myBird.eat();
        myBird.drink();
        myBird.tweet();
    }
}
