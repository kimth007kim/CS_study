package scheduler;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("���� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("���� ��ų�� ���� ���� ������ ��⿭�� �տ� �켱 ����մϴ�.");
		
	}

}
