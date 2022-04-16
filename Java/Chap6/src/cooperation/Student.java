package cooperation;

public class Student {
	String studentname;
	int grade;
	int money;
	
	public Student(String studentName,int money) {
		this.studentname =studentName;
		this.money=money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1000);
		money -= 1000;
	}
	public void showInfo() {
		System.out.println(studentname + "¥‘¿« ≥≤¿∫ µ∑¿∫"+ money+"¿‘¥œ¥Ÿ." );
		
	}
}
