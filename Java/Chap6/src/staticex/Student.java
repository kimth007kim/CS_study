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
		int i =10; // ���� ���� = 
		i++;
		System.out.println(i);
		
//		studentName="kim"; // ��� ����, �ν��Ͻ� ����
//		
//		//���������� ���� �ν��Ͻ��� ���� �Ҵ��ϰ� �ȴ�.
		
		return serialNum; // static ����,Ŭ���� ����
	}

//	public static void setSerialNum(int serialNum) {
//		Student.serialNum = serialNum;
//	}

	
	
}
