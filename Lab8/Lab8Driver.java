package Lab8;
import java.util.Vector;

public class Lab8Driver {

	public static void main(String[] args) {
		Vector<Publication> publicationVector = new Vector<Publication>();

		Publication pubOne = new Book("Programming 101", "The Programmers", "5/1/2017", "Programming", "9968922617", "95-156543", "Mr. Crabtree", 1, 2017, 1);

		publicationVector.add(pubOne);

		Publication pubTwo = new Magazine("Programming 101", "The Programmers", "5/1/2017", "Programming", "Two a year", "Mr. Poopy Face");
		
		publicationVector.add(pubTwo);
		
		Publication pubThree = new Newsletter("Programming 201", "The Programmer", "5/2/2017", "Programming", "One a year", "Mr. Poopy Face", "Everyone");
		
		publicationVector.add(pubThree);
		
		for (Publication pub: publicationVector){
			System.out.println(pub.toString() + "\n") ;
		}
	}
}
