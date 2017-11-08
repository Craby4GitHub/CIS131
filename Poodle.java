public class Poodle extends Dog{
	  //This is a no-arg constructor
	  public Poodle () {
	      
	  }
	   // showSpecies method
	   public void showSpecies()
	   {
	      System.out.println("I'm a Poodle.");
	   }
	  
	  
	   // makeSound method
	   public void makeSound()
	   {
		   if(getIsAlive()){
	     System.out.println("Woof! Bark!");
		   }
	   }
	
}
