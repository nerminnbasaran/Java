package day24interface;

public class CarRunner {

    public static void main(String[] args) {

        Honda myHonda = new Honda();

        myHonda.cool();
        myHonda.heat();
        myHonda.run();
        myHonda.bacteriaKiller();

        AC.climate();

       // AC myAC = new AC(); ==> AC' is interface; cannot be instantiated

        System.out.println(AC.price);//2000

        //AC.price++; =>Cannot assign a value to final variable 'price'

        System.out.println(Engine.price);//5000.0
    }




}
