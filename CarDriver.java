/*
 ** File StudentDriver.java
 **
 ** Demonstrates declaring a car object and executing its methods.
 **
 ** F. D'Angelo and modified by David A. Freitag
 **/

public class CarDriver{
   public static void main(String[] args){
      // Create a car object using the all attributes constructor
      Car carObj1 = new Car( 4, 1600, "automatic", 5, "sedan");
      
      // Create a car object using the default constructor
      Car carObj2 = new Car();
      
      carObj2.setNumberOfCylinders(6);
      carObj2.setCubicDisplacement(2500);
      carObj2.setNumberOfSpeeds(5);
      carObj2.setTransmissionType("manual");
      carObj2.setBodyStyle("coupe");
           
      System.out.println("\n------- Car Objects -------");
      System.out.println("carObj1: \n" + carObj1.toString());
      System.out.println("carObj2: \n" + carObj2.toString());
   }
}