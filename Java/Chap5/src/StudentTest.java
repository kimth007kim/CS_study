
public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student(1,"�浿");
//		kim.studentName="�浿";
//		kim.studentID=1;
		kim.address="����� ��������";
	
		Student lee = new Student(2,"�屺");
//		lee.studentName="�屺";
//		lee.studentID=2;
		lee.address="��⵵ �Ȼ�";
		
		kim.showStudentInfo();
		lee.showStudentInfo();

	}

}
