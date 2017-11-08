// Animal Class
public class Animal {
	private boolean isAlive;

	  public Animal () {
		  isAlive = true;
	  }
	
	// showSpecies method
	public void showSpecies() {

		System.out.println("I'm just a regular animal.");
	}

	// makeSound method
	public void makeSound() {
		System.out.println("Grrrrrr");
	}

	public void showIfHouseTrained() {

	}

	public void setIsAlive(boolean lifeChanging) {
		isAlive = lifeChanging;
	}

	public boolean getIsAlive() {
		return isAlive;
	}
	public void showAliveOrDead(){
		if (isAlive){
			System.out.println("Alive! :D");
		}else{
			System.out.println("Dead :[");
		}
		
	}

}