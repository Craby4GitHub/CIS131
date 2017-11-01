/*
 ** File Car.java
 **
 ** Demonstrates implementing the methods of a Car class.
 **
 ** F. D'Angelo and modified by David A. Freitag
 **/

public class Car{
   private Transmission transmissionObj;
   private Engine      engineObj;
   private String      bodyStyle;
   
   public Car(){ 
      System.out.println("\nIn Car() default constructor"); // Just to show we're here.
      
      transmissionObj = new Transmission();
      engineObj = new Engine();
      
      setBodyStyle("sedan"); // The most popular style, perhaps.
   }
   
   public Car(int numberOfCylinders, int cubicDisplacement, String transmissionType, int numberOfSpeeds, String bodyStyle){ 
      System.out.println("\nIn Car all parms constructor"); // Just to show we're here.
      
      transmissionObj = new Transmission(transmissionType, numberOfSpeeds );
      
      engineObj = new Engine(numberOfCylinders, cubicDisplacement);
      
      setBodyStyle(bodyStyle); 
   }
   
   // Define "setter" a.k.a. mutator methods.
   public void setCubicDisplacement( int cubicDisplacement ){
      this.engineObj.setCubicDisplacement( cubicDisplacement ); // Relay this action to engineObj's method.
   }
   
   public void setNumberOfCylinders( int numberOfCylinders ){
      this.engineObj.setNumberOfCylinders( numberOfCylinders ); // Relay this action to engineObj's method.
   }
   
   public void setTransmissionType( String transmissionType ){
      this.transmissionObj.setTransmissionType( transmissionType ) ; // Relay this action to  transmissionObj's method.
   }
   
   public void setNumberOfSpeeds( int numberOfSpeeds ){
      this.transmissionObj.setNumberOfSpeeds( numberOfSpeeds ) ; // Relay this action to  transmissionObj's  method.
   }
   
   public void setBodyStyle( String bodyStyle ){
      this.bodyStyle = bodyStyle ;
   }
   
   // Define "getter" a.k.a. accessor methods.
   public int getCubicDisplacement(){
      return this.engineObj.getCubicDisplacement() ;  // Relay this action to engineObj's method.
   }
   
   public int getNumberOfCylinders(){
      return this.engineObj.getNumberOfCylinders() ;  // Relay this action to engineObj's method.
   }
   
   String getTransmissionType(){
      return transmissionObj.getTransmissionType() ; // Relay this action to transmissionObj's method.
   }
   
   public int getNumberOfSpeeds(){
      return transmissionObj.getNumberOfSpeeds() ;  // Relay this action to transmissionObj's method.
   }
   
   public String getBodyStyle(){
      return bodyStyle ;
   }
   
   public String toString(){
      StringBuffer strBuf = new StringBuffer("Car Data: \n");
      
      strBuf.append(engineObj.toString() );  // use engineObj.toString() to provide formatted Engine data.
      strBuf.append(transmissionObj.toString()); // use transmissionObj.toString() to provide formatted Transmission data.
      strBuf.append("Body style                : ");
      strBuf.append(bodyStyle) ;
      strBuf.append( "\n") ;    
      
      return strBuf.toString() ;
   }
}