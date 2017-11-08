// Dog Class
public class Dog extends Animal{
	private boolean isHouseTrained;
  //This is a no-arg constructor
  public Dog () {
	  System.out.println("I'm a brand new dog.");
	  isHouseTrained = false;
  }
  
   // showSpecies method
   public void showSpecies()
   {
      System.out.println("I'm a dog.");
   }
   
   // makeSound method
   public void makeSound()
   {
     System.out.println("Woof! Woof!");
   }
   public void setIsHouseTrained(boolean set){
	   isHouseTrained = set;
   }
   public boolean getIsHouseTrained(){
	   return isHouseTrained;
   }
   
   public void showIfHouseTrained(){
		if (isHouseTrained){
			System.out.println("I am house trained!");
		}else{
			System.out.println("Im not house trained!");
		}
   }
   
   
}