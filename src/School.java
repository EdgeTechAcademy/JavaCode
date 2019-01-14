import java.util.ArrayList;

public class School {
	private String subject;
	private String instructor;
	private int roomNumber;
	private int period;
	private ArrayList<String> students;

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public void addStudent(String student) {
		students.add(student);		//	add a student to the list
	}

	public School(String subject, String instructor, int roomNumber, int period) {
		this.subject = subject;
		this.instructor = instructor;
		this.roomNumber = roomNumber;
		this.period = period;
		students = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "School{" +
				"subject='" + subject + '\'' +
				", instructor='" + instructor + '\'' +
				", roomNumber=" + roomNumber +
				", period=" + period +
				", students=" + students +
				'}';
	}


	public static void main(String[] args) {
		String subject 		= Utils.getInput("Subject: ");
		String instructor 	= Utils.getInput("Instructor: ");        //	get instructor
		int roomNumber 		= Utils.getNumber("Room #: ");        //	get period
		int period 			= Utils.getNumber("Period: ");        //	get room number

		//	next we will create a School
		School school = new School(subject, instructor, roomNumber, period);
		System.out.println("school = " + school);

		school.addStudent("Your name here");
		System.out.println("school = " + school);

		//	here we will ask the user to enter how many students should be added to the class
		int studentCount = Utils.getNumber("How many students in class: ");        //	get student count

		//	loop to ask for student names and we will add them to the students list for the school
		for (int i = 0; i < studentCount; i++) {
			String name = Utils.getInput("Name of Student # " + i + " " );
			school.addStudent(name);
		}
		System.out.println("school = " + school);

		//	then we will ask for students name to search for in our roster
		String searchFor = Utils.getInput("Is this student enrolled? " );
		boolean found = school.isStudentEnrolled(searchFor);

		System.out.println(searchFor + ((found) ? " was found" : " was not found"));

		if (found)
			System.out.println(searchFor + " was found");
		else
			System.out.println(searchFor + " was not found");

		int number = Utils.getNumber("Give me a number: ");        //	get student count
		for (int zzz = 0; zzz < number; zzz++) {
			System.out.println("zzz = " + zzz);
		}

		for (String s : school.getStudents()) {
			System.out.println("s = " + s);
		}
	}

	private boolean isStudentEnrolled(String searchFor) {
		for (String student : students) {
			if (student.equalsIgnoreCase(searchFor))
				return true;
		}
		return false;
	}
}
