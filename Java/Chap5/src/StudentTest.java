
public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student(1,"경동");
//		kim.studentName="경동";
//		kim.studentID=1;
		kim.address="서울시 영동포구";
	
		Student lee = new Student(2,"장군");
//		lee.studentName="장군";
//		lee.studentID=2;
		lee.address="경기도 안산";
		
		kim.showStudentInfo();
		lee.showStudentInfo();

	}

}
