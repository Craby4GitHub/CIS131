/*
 ** File Engine.java
 **
 ** Demonstrates implementing an Engine class.
 **
 ** F. D'Angelo and modified by David A. Freitag
 **/

public class Engine{
   private int cubicDisplacement ;
   private int numberOfCylinders ;
   
   public Engine(){ 
      System.out.println( "In Engine() default constructor"); // just to show that we're here.
      
      setCubicDisplacement(0);
      setNumberOfCylinders(0);
   }
   
   public Engine(int cubicDisplacement, int numberOfCylinders){ 
      System.out.println( "In Engine all parms constructor"); // just to show that we're here.
      
      setCubicDisplacement(cubicDisplacement);
      setNumberOfCylinders(numberOfCylinders);
   }
   
   // Define "setter" a.k.a. mutator methods.
   public void setCubicDisplacement( int cubicDisplacement ){
      this.cubicDisplacement = cubicDisplacement ;
   }
   
   public void setNumberOfCylinders( int numberOfCylinders ){
      this.numberOfCylinders = numberOfCylinders ;
   }
   
   // Define "getter" a.k.a. accessor methods.
   public int getCubicDisplacement(){
      return cubicDisplacement ;
   }
   
   public int getNumberOfCylinders(){
      return numberOfCylinders ;
   }
   
   public String toString(){
      StringBuffer strBuf = new StringBuffer("Engine Data: \n");
      
      strBuf.append("     Cubic displacement   : " );
      strBuf.append( cubicDisplacement);
      strBuf.append( "\n");
      strBuf.append("     Number of Cylinders  : ");
      strBuf.append(numberOfCylinders) ;
      strBuf.append( "\n") ;
      
      return strBuf.toString() ;
   }
}