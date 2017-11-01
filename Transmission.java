/*
 ** File Transmission.java
 **
 ** Demonstrates implementing the methods of a class that represents a car's transmission.
 **
 ** F. D'Angelo and modified by David A. Freitag
 **/

public class Transmission{
   private String transmissionType  ;
   private int    numberOfSpeeds ;
   
   public Transmission(){
      System.out.println("In Transmission default constructor"); // just to show that we're here.
      
      setTransmissionType("Automatic");  // In real life automatic is probably the default.
      setNumberOfSpeeds(4);    // Just guessing that 4 is probably the usual number.
   }
   
   public Transmission(String transmissionType, int numberOfSpeeds){
      System.out.println("In Transmission all parms constructor"); // just to show that we're here.
      
      setTransmissionType(transmissionType); 
      setNumberOfSpeeds(numberOfSpeeds); 
   }
   
   // Define "setter" a.k.a. mutator methods.
   public void setTransmissionType( String transmissionType ){
      this.transmissionType = transmissionType ;
   }
   
   public void setNumberOfSpeeds( int numberOfSpeeds ){
      this.numberOfSpeeds = numberOfSpeeds ;
   }
   
   // Define "getter" a.k.a. accessor methods.
   public String getTransmissionType(){
      return transmissionType ;
   }
   
   public int getNumberOfSpeeds(){
      return numberOfSpeeds ;
   }
   
   public String toString(){
      StringBuffer strBuf = new StringBuffer("Transmission Data: \n");
      
      strBuf.append("     Transmission type    : " );
      strBuf.append( transmissionType);
      strBuf.append( "\n");
      strBuf.append("     numberOfSpeeds       : ");
      strBuf.append(numberOfSpeeds) ;
      strBuf.append( "\n") ;
      
      return strBuf.toString() ;
   }
}