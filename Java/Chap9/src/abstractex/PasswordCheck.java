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
//			System.out.println("비밀번호는 영문과 특수문자 숫자를 포함하며 8자 이상이어야 합니다.");
//		}
//		else {
//			System.out.println("맞는 비밀번호입니다.");
//		}
		if (!passMatcher2.find()) {
			System.out.println("이모티콘이 포함되어있습니다.");
		}
		else {
			System.out.println("맞는 비밀번호입니다.");
		}

	}
}
