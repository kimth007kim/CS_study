package staticex;

public class Student {
	private static int serialNum=10000;
	
	int studentID;
	String StudentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i =10; // 지역 변수 = 
		i++;
		System.out.println(i);
		
//		studentName="kim"; // 멤버 변수, 인스턴스 변수
//		
//		//생성되지도 않은 인스턴스에 값을 할당하게 된다.
		
		return serialNum; // static 변수,클래스 변수
	}

//	public static void setSerialNum(int serialNum) {
//		Student.serialNum = serialNum;
//	}

	
	
}
