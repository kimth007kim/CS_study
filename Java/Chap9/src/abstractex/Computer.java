package abstractex;

public abstract class Computer {		
	public abstract void display();		//������ ���ϰڴٶ���̾߱� ���� �ϰڴ�.
	public abstract void typing();		// �����ڵ尡 ������ �߻�޼��尡 �ȴ�.
 
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}	
