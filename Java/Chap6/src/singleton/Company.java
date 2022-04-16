package singleton;

public class Company {

	private static Company instance = new Company(); //�� �Ѱ��� �������ְ�, ���ο��� �����Ȱ��̴�.
	private Company(){}	//�ܺο��� �����ڸ� ȣ���������Ѵ�.
	
	public static Company getInstance() {
		if (instance==null) {
			instance = new Company();
		}
		return instance;
	}
	
}
