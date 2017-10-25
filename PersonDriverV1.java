/*
 ** Program  : PersonDriverV1
 ** Purpose       : Declares and instantiates objects of the Person class and demonstrates using their methods.
 ** Programmer    : Will Crabtree
 ** Date created  : 8/17/2008
 ** Date modified : 10/25/2017
 */

public class PersonDriverV1 {
	public static void main(String[] args) {
		Person personObj1 = new Person("Smith", "Sarah", "Jane", "001221234", 19840731, "Utica", "NY", 85750);
		
		// This statement invokes the default contructor.
		Person personObj2 = new Person();

		System.out.println("\n\nTo prove Java called the default constructor: personObj2 data: \n" + personObj2.toString() + "\n\n");

		// We can use "set" methods to set initial values for an objet's properties or to change their existing values.

		personObj2.setLastName("Jones");
		personObj2.setFirstName("Andrew");
		personObj2.setMidName("Jackson");
		personObj2.setSocSecNum("003445678");
		personObj2.setDateOfBirth(IR4.getRandomNumber(1900, 2017), 6, 30);
		personObj2.setCity("test city");
		personObj2.setState("test State");
		
		// whhoopp
		personObj2.setZipCode(IR4.getRandomNumber(11111, 99999));


		// Display the values of all of an object's properties using toString.

		System.out.println("personObj1 data: \n\n" + personObj1.toString() + "\n\n");
		System.out.println("personObj2 data: \n\n" + personObj2.toString() + "\n\n");

		// Display selected properties with get methods.
		System.out.println("personObj1 Full name: " + personObj1.getFullName());

	}
}
