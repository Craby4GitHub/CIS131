
public class Lab6 {
	private int crn;
	private String department;
	private int courseNumber;
	private String instructionalMode;
	private String campus;
	private String meetingDays;
	private String meetingTimes;
	private int capacity;
	private int enrollment;
	private int instructorID;
	
	public Lab6() {
		setCRN(0);
		setDepartment("");
		setCourseNumber(0);
		setInstructionalMode("");
		setCampus("");
		setMeetingDays("");
		setMeetingTimes("");
		setCapacity(0);
		setEnrollment(0);
		setInstructorID(0);
	}

	public int getCRN() {
		return crn;
	}

	public void setCRN(int input) {
		crn = input;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String input) {
		department = input;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int input) {
		courseNumber = input;
	}

	public String getInstructionalMode() {
		return instructionalMode;
	}

	public void setInstructionalMode(String input) {
		instructionalMode = input;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String input) {
		campus = input;
	}

	public String getMeetingDays() {
		return meetingDays;
	}

	public void setMeetingDays(String input) {
		meetingDays = input;
	}

	public String getMeetingTimes() {
		return meetingTimes;
	}
	
	public void setMeetingTimes(String input) {
		meetingTimes = input;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int input) {
		capacity = input;
	}

	public int getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(int input) {
		enrollment = input;
	}

	public int getInstructorID() {
		return instructorID;
	}

	public void setInstructorID(int input) {
		instructorID = input;
	}

}
