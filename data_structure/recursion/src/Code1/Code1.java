package Code1;

public class Code1 {
//	재귀는 항상 무한 루프에 빠지지않는다.
//	무한루프에 빠지지않으려면 BaseCase(재귀에빠지지않는 경로) 가 존재해야한다.
	

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
