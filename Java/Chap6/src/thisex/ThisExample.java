package thisex;

class BirthDay{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year= year;
	}
	
	public void printThis() {
		System.out.println(this);	// ���� ����Ű�� �ִ� �ν��Ͻ��� �ּҰ�
	}
}
public class ThisExample {

	public static void main(String[] args) {
		
		BirthDay b1 = new BirthDay();
		BirthDay b2 = new BirthDay();
		b1.setYear(2000);
		System.out.println(b1);
		b1.printThis();
		System.out.println(b2);
		b2.printThis();
	}

}
