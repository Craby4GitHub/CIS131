
public class Beagle extends Dog {
	// This is a no-arg constructor
	public Beagle() {
		System.out.println(" A Beagle!");
	}

	// showSpecies method
	public void showSpecies() {
		System.out.println("I'm a Beagle.");
	}

	// makeSound method
	public void makeSound() {
		if (getIsAlive()) {
			System.out.println("Bark! Woof!");
		}
	}

}
