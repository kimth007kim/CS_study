package template;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("=========== ������ =============== ");
		Car myCar = new ManualCar();
		myCar.run();
		
		System.out.println("=======================");
		
		System.out.println("=========== AI�� =============== ");		
		Car yourCar = new AICar();
		yourCar.run();
	}

}
