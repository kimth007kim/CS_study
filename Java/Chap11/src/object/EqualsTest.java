package object;

class Student {
	int studentID;
	String studentName;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (studentID == std.studentID) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}

public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("Test");
		String str2 = new String("Test");

//		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2));
//		

		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");

		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
	}

}
