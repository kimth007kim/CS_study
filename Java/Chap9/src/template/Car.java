package template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	
	public abstract void wiper();
	public void washCar() { }   // ������ �ߴµ� ���� �ڵ尡 ����.
	
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff(){
		System.out.println("�õ��� ���ϴ�.");
	}

	public final void run() {	//�̷� �ó������� �ٲ�� �ȵȴ�.
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
