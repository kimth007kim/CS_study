package template;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("=========== 수동차 =============== ");
		Car myCar = new ManualCar();
		myCar.run();
		
		System.out.println("=======================");
		
		System.out.println("=========== AI차 =============== ");		
		Car yourCar = new AICar();
		yourCar.run();
	}

}
