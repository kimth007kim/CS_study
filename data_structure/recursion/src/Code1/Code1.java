package Code1;

public class Code1 {
//	��ʹ� �׻� ���� ������ �������ʴ´�.
//	���ѷ����� �������������� BaseCase(��Ϳ��������ʴ� ���) �� �����ؾ��Ѵ�.
	

	public static void main(String[] args) {
		func(4);

	}
	public static void func(int n) {
		if(n<=0)
			return;
		else {
			System.out.println("Hello...");
			func(n-1);
		}
	}

}
