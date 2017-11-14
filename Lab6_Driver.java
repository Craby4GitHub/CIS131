public class Lab6_Driver {
	public static void main(String[] args) {

		// Create a Course Object
		ClassSection courseObjectOne = new ClassSection();

		// Display Course Object Data
		System.out.println(courseObjectOne.toString());
		
		// Assign Values
		courseObjectOne.setCRN("24367");
		courseObjectOne.setDepartment("JUS");
		courseObjectOne.setCourseNumber("356");
		courseObjectOne.setInstructionalMode("Classroom");
		courseObjectOne.setCampus("WC");
		courseObjectOne.setMeetingDays("MW");
		courseObjectOne.setMeetingTimes("1pm-5pm");
		courseObjectOne.setCapacity(5);
		courseObjectOne.getEnrollment();
		courseObjectOne.setInstructorID("10");
		
		// Create a Course Object
		// ClassSection courseObjectOne = new ClassSection("20008", "CIS", "132", "Online", "DV", "SSu", "3am-4am", 30, "756");
		
		// Add Student(s) one by one
		for (int i = 0; i < courseObjectOne.getCapacity(); i++) {
			courseObjectOne.addStudent(IR4.getInteger("Enter ID of student to add"));
			if (!IR4.getYorN("Add another student?")) {
				break;
			}
		}

		// Display Course Object Data
		System.out.println(courseObjectOne.toString());
		
		// Display Student(s)
		courseObjectOne.displayStudentlist();
		
		// Change some grades!
		for (int i = 0; i < courseObjectOne.getEnrollment(); i++) {
			courseObjectOne.setStudentGrade(IR4.getInteger("Enter ID of student to change grade"), IR4.getInteger("Enter grade"));
		}
		
		// Display Student(s)
		courseObjectOne.displayStudentlist();
		
		// Withdraw a Student
		courseObjectOne.withdrawStudent(IR4.getInteger("Enter ID of student to withdraw"));
		
		// Display Student(s)
		courseObjectOne.displayStudentlist();
	}
}