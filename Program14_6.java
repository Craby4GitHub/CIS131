// Program 14-6 plus some more

public class Program14_6
{
   public static void main(String[] args)
   {
      // Declare three class variables.
      Animal myAnimal;
      Dog myDog;
      Cat myCat;
      
      // Create an Animal object, a Dog object,
      // and a Cat object.
      myAnimal = new Animal();
      myDog = new Dog();
      myCat = new Cat();
      
      System.out.println();
      
      // Show info about an animal.
      System.out.println("Here is info about an animal.");
      showAnimalInfo(myAnimal);
      System.out.println();
      
      // Show info about a dog.
      System.out.println("Here is info about a dog.");
      showAnimalInfo(myDog);
      System.out.println();

      // Show info about a cat.
      System.out.println("Here is info about a cat.");
      showAnimalInfo(myCat);
   }

   // The showAnimalInfo method accepts an Animal
   // object as an argument and displays information
   // about it.
   public static void showAnimalInfo(Animal creature)
   {
      creature.showSpecies();
      creature.makeSound();
   }
}