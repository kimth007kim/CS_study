package template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	
	public abstract void wiper();
	public void washCar() { }   // 구현을 했는데 구현 코드가 없다.
	
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff(){
		System.out.println("시동을 끕니다.");
	}

	public final void run() {	//이런 시나리오는 바뀌면 안된다.
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
