
public class Student {

	private int ID;
	private int grade;
	
	public Student(){
		setID(0);
		setGrade(0);
	}
	
	public Student(int ID, int grade){
		setID(ID);
		setGrade(grade);
	}

	public int getID(){
		return ID;
	}
	
	public void setID(int input){
		ID = input;
	}
	
	public int getGrade(){
		return grade;
	}
	
	public void setGrade(int input){
		grade = input;
	}
	
	public String toString() {
		StringBuffer strBuf = new StringBuffer("************************************ \n");
		
		strBuf.append("Student ID: ");
		strBuf.append(ID + "\n");
		
		strBuf.append("Student Grade: ");
		strBuf.append(grade + "\n");
		
		strBuf.append("************************************ \n");		
		return strBuf.toString();
	}
	
}
