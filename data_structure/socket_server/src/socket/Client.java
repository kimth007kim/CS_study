package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


public class Client {

	private static final String SERVER_IP = "127.0.0.1";		// ���� ip �ּ� 127.0.0.1 �� ����
    private static final int SERVER_PORT = 8081;				// ���� ��Ʈ��ȣ 8888�� ����

	
	public static void main(String[] args) {
		Socket socket= null;
		BufferedReader in = null;					//Server �κ��� �����͸� �о���̱� ���� �Է½�Ʈ��
		BufferedReader in2 = null;					//Ű����� �о���̱� ���� �Է½�Ʈ��
		PrintWriter out =null; 						//������ �������� ���� ��½�Ʈ��
		
		try {
			System.out.println("hello");
			socket = new Socket(SERVER_IP,SERVER_PORT);
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			in2 = new BufferedReader(new InputStreamReader(System.in));
			out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
			
			
		}catch(IOException e) {
			e.getMessage();
		}
		
		
		try {
			System.out.print("������ �����޽���:");
			String data =in2.readLine();
			out.println(data);
			out.flush();
			
			String str2=in.readLine();
			System.out.println("������ ���� ���ƿ� �޼���: "+ str2);
			socket.close();
		}catch(IOException e) {
			
		}
		
	}

}
