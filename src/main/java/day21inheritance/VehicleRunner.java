package day21inheritance;

public class VehicleRunner {


   public static void main(String[] args) {

      Civic myCivic = new Civic(false);

      myCivic.move();//All vehicles move...
      myCivic.engine();//Honda uses perfect engine...
      myCivic.ecoSystem();// Using Civic is not expensive...
      int hashCode =myCivic.hashCode();
      System.out.println(hashCode);//509886383 <-- hashCode() coming from Object Class

      Vehicle myVehicle = new Vehicle();
      System.out.println(myVehicle);//Vehicle Constructor...

   }






}
