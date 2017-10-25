/*
** Program	 : Person.java
**
** Purpose       : Defines the methods of the Person class
**
** Programmer    : F. D'Angelo
**
** Date created  : 8/17/2008
**
** Date modified : 7/3/2014
*/

public class Person {
	// Data members, aka instance variables, aka attributes, aka properties:
	private String lastName;
	private String firstName;
	private String midName;
	private String socSecNum;
	private int dateOfBirth;
	private String city;
	private String state;
	private int zipcode;

	// Constructors:
	Person() {
		setLastName(""); // Typically a no-parameter defaul contructor sets String values to "', an empty String,
		setFirstName(""); // floats and doubles to 0.0 and ints to 0.
		setMidName("");
		setSocSecNum("000-00-0000"); // However, I decided to set scial security number to "000-00-0000",
		setDateOfBirth(0);
		setCity("");
		setState("");
		setZipCode(00000);
	}

	Person(String lastName, String firstName, String midName, String socSecNum, int dateOfBirth, String city, String state, int zipcode) {
		setLastName(lastName);
		setFirstName(firstName);
		setMidName(midName);
		setSocSecNum(socSecNum);
		setDateOfBirth(dateOfBirth);
		setCity(city);
		setState(state);
		setZipCode(zipcode);
		
	}

	// Setter and gettr methods:
	void setLastName(String lastName) {
		this.lastName = lastName; // this. distinguishes the object property lastName from the local parameter variable named lastName.
	}

	/*
	 * void setLastName( String parmLastName ) { lastName = parmLastName ; //
	 * People who fear "this." write code like this. Oversome this fear. Why
	 * doesn't this code need "this."? }
	 */

	String getLastName() {
		return lastName; // Since there is no local variable named lastName in
							// this method, we don't need to use this..
	}

	void setFirstName(String firstName) {
		this.firstName = firstName; // this. distinguishes the object property
									// firstName from the local parameter
									// variable named firstName.
	}

	String getFirstName() {
		return firstName; // Since there is no local variable named firstName in
							// this method, we don't need to use this..
	}
	
	void setCity(String userCity) {
		city = userCity; 
	}

	String getCity() {
		return city; 
	}
	
	void setState(String userState) {
		state = userState; 
	}

	String getState() {
		return state; 
	}
	
	void setZipCode(int userZipCode) {
		zipcode = userZipCode; 
	}

	int getZipCode() {
		return zipcode; 
	}
	
	public void setMidName(String midName) {
		this.midName = midName; // this. distinguishes the object property
								// midName from the local parameter variable
								// named midName.
	}

	public String getMidName() {
		return midName; // Since there is no local variable named midtName in
						// this method, we don't need to use this..
	}

	public void setSocSecNum(String socSecNum) {
		this.socSecNum = socSecNum; // this. distinguishes the object property
									// socSecNum from the local parameter
									// variable named socSecNum.
	}

	public String getSocSecNum() {
		return socSecNum; // Since there is no local variable named socSecNum in
							// this method, we don't need to use this..
	}

	public void setDateOfBirth(int yyyy_mm_dd) // a value like 20140823 for 08/23/2014
	{
		dateOfBirth = yyyy_mm_dd;
	}

	public void setDateOfBirth(int yyyy, int mm, int dd) {
		dateOfBirth = (yyyy * 10000) + (mm * 100) + dd; // this puts each value
														// in its proper place
														// in the integer.
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public String getFullName(){
		return firstName + " " + midName + " " + lastName;
	}
	
	public String getDateOfBirthStr() {
		//String dateOfBirthStr;

		String month;

		int dd = dateOfBirth % 100;

		int mm = ((dateOfBirth - dd) % 10000) / 100;

		int yyyy = (dateOfBirth / 10000);

		switch (mm) {
		case 1:
			month = "Jan";
			break;

		case 2:
			month = "Feb";
			break;

		case 3:
			month = "Mar";
			break;

		case 4:
			month = "Apr";
			break;

		case 5:
			month = "May";
			break;

		case 6:
			month = "Jun";
			break;

		case 7:
			month = "Jul";
			break;

		case 8:
			month = "Aug";
			break;

		case 9:
			month = "Sep";
			break;

		case 10:
			month = "Oct";
			break;

		case 11:
			month = "Nov";
			break;

		case 12:
			month = "Dec";
			break;

		default:
			month = "???";
		}

		String dob = Integer.toString(dd) + "-" + month + "-" + Integer.toString(yyyy);

		return dob;

	}

	// Add the set and get methods for address, city, state, zipCode and
	// phoneNumber.

	// Produce a nicely formatted String that shows the values of all of an
	// object's properties.
	// We refer to the group comprising the properties of an object are known as
	// the object's state.

	public String toString() {

		return ("Last name      : " + lastName + "\n" + 
				"First name     : " + firstName + "\n" + 
				"Middle name    : " + midName + "\n" + 
				"Soc sec #      : " + socSecNum + "\n" + 
				"Date of birth  : " + getDateOfBirthStr() + "\n" + 
				"City           : " + city + "\n" + 
				"State          : " + state + "\n" + 
				"Zip            : " + zipcode);
	}
}
