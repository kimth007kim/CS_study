package singleton;

public class Company {

	private static Company instance = new Company(); //단 한개만 생성되있고, 내부에서 생성된것이다.
	private Company(){}	//외부에서 생성자를 호출하지못한다.
	
	public static Company getInstance() {
		if (instance==null) {
			instance = new Company();
		}
		return instance;
	}
	
}
