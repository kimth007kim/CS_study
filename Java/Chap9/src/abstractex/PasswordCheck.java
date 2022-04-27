package abstractex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pwd = sc.next();
		Pattern passPattern1 = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$");
		Matcher passMatcher1 = passPattern1.matcher(pwd);

		Pattern passPatern2=Pattern.compile("[\\x{10000}-\\x{10ffff}\ud800-\udfff]");
		Matcher passMatcher2 = passPattern1.matcher(pwd);
//		if (!passMatcher1.find()) {
//			System.out.println("��й�ȣ�� ������ Ư������ ���ڸ� �����ϸ� 8�� �̻��̾�� �մϴ�.");
//		}
//		else {
//			System.out.println("�´� ��й�ȣ�Դϴ�.");
//		}
		if (!passMatcher2.find()) {
			System.out.println("�̸�Ƽ���� ���ԵǾ��ֽ��ϴ�.");
		}
		else {
			System.out.println("�´� ��й�ȣ�Դϴ�.");
		}

	}
}
