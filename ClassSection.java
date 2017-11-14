import java.util.ArrayList;

public class ClassSection {
	Student testStudent;

	private String crn;
	private String department;
	private String courseNumber;
	private String instructionalMode;
	private String campus;
	private String meetingDays;
	private String meetingTimes;
	private int capacity;
	private int enrollment;
	private String instructorID;
	private ArrayList<Student> studentList = new ArrayList<Student>();

	public ClassSection() {
		setCRN("0");
		setDepartment("");
		setCourseNumber("0");
		setInstructionalMode("");
		setCampus("");
		setMeetingDays("");
		setMeetingTimes("");
		setCapacity(0);
		getEnrollment();
		// setEnrollment(0);
		setInstructorID("0");
	}

	public ClassSection(String crn, String department, String courseNumber, String instructionalMode, String campus, String meetingDays, String meetingTimes, int capacity, String instructorID) {
		setCRN(crn);
		setDepartment(department);
		setCourseNumber(courseNumber);
		setInstructionalMode(instructionalMode);
		setCampus(campus);
		setMeetingDays(meetingDays);
		setMeetingTimes(meetingTimes);
		setCapacity(capacity);
		getEnrollment();
		// setEnrollment(enrollment);
		setInstructorID(instructorID);
	}

	// -----------------------------------------------------------------------------------------------------------------
	public int findStudent(int studentNum) {
		for (int i = 0; i <= studentList.size(); i++) {
			if (studentNum == (studentList.get(i)).getID()) {
				return i;
			}
		}
		return -1;
	}

	public void addStudent(int input) {
		Student tempStudent = new Student();
		tempStudent.setID(input);
		tempStudent.setGrade(0);
		studentList.add(tempStudent);
	}

	public void withdrawStudent(int input) {
		if(input != -1){
			studentList.remove(findStudent(input));
		}else{
			System.out.println("Error");
		}
		
	}

	public void setStudentGrade(int input, int grade) {
		(studentList.get(findStudent(input))).setGrade(grade);
	}

	public void displayStudentlist() {
		for (Student i : studentList) {
			System.out.println(i.toString());
		}
	}

	public String getCRN() {
		return crn;
	}

	public void setCRN(String input) {
		if (input.matches("^[\\d]{5}$")) {
			crn = input;
		} else {
			crn = "N/A";
		}
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String input) {
		if (input.matches("^[a-zA-Z]{3}$")) {
			department = input;
		} else {
			department = "N/A";
		}
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String input) {
		if (input.matches("^[\\d]{3}$")) {
			courseNumber = input;
		} else {
			courseNumber = "N/A";
		}
	}

	public String getInstructionalMode() {
		return instructionalMode;
	}

	public void setInstructionalMode(String input) {
		if (input == "Online" || input == "Classroom" || input == "Hybrid") {
			instructionalMode = input;
		} else {
			instructionalMode = "N/A";
		}
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String input) {
		String[] campusList = { "CC", "DV", "DC", "EC", "NW", "WC", "DMAFB", "AE" };
		for (Object i : campusList) {
			if (i == input) {
				campus = input;
				break;
			} else {
				campus = "N/A";
			}
		}
	}

	public String getMeetingDays() {
		return meetingDays;
	}

	public void setMeetingDays(String input) {
		String[] meetingDaysList = { "M", "T", "W", "Th", "F", "S", "Su", "MW", "TTh", "SSu" };
		if (instructionalMode == "Classroom" || instructionalMode == "Hybrid") {
			for (Object i : meetingDaysList) {
				if (i == input) {
					meetingDays = input;
					break;
				} else {
					meetingDays = "N/A";
				}
			}

		} else {
			meetingDays = "N/A";
		}
	}

	public String getMeetingTimes() {
		return meetingTimes;
	}

	public void setMeetingTimes(String input) {
		if (instructionalMode == "Classroom" || instructionalMode == "Hybrid") {
			meetingTimes = input;
		} else {
			meetingTimes = "N/A";
		}
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int input) {
		if (input > 0) {
			capacity = input;
		} else {
			capacity = 0;
		}
	}

	public int getEnrollment() {
		return studentList.size();
	}

	public void setEnrollment(int input) {
		if (enrollment > capacity) {
			enrollment = capacity;
		} else {
			enrollment = input;
		}
	}

	public String getInstructorID() {
		return instructorID;
	}

	public void setInstructorID(String input) {
		if (input.matches("^[\\d]{1,12}$")) {
			instructorID = input;
		} else {
			instructorID = "N/A";
		}
	}

	public String toString() {
		StringBuffer strBuf = new StringBuffer("************************************ \n");

		strBuf.append("CRN: ");
		strBuf.append(crn + "\n");

		strBuf.append("Department: ");
		strBuf.append(department + "\n");

		strBuf.append("Course Number: ");
		strBuf.append(courseNumber + "\n");

		strBuf.append("Instructional Mode: ");
		strBuf.append(instructionalMode + "\n");

		strBuf.append("Campus: ");
		strBuf.append(campus + "\n");

		strBuf.append("Meeting Days: ");
		strBuf.append(meetingDays + "\n");

		strBuf.append("Meeting Times: ");
		strBuf.append(meetingTimes + "\n");

		strBuf.append("Capacity: ");
		strBuf.append(capacity + "\n");

		strBuf.append("Enrollment: ");
		strBuf.append(getEnrollment() + "\n");

		strBuf.append("Instructor’s ID: ");
		strBuf.append(instructorID + "\n");

		strBuf.append("************************************ \n");

		return strBuf.toString();
	}
}