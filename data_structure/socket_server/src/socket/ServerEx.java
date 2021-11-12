package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {

	public static void main(String[] args) {
		Socket socket = null; // client �� ����ϱ����� ����
		ServerSocket server_socket = null; // ���������� ���� ���� ����
		BufferedReader in = null; // client�� ���� �����͸� �о� ���̱� ���� �Է� ��Ʈ��
		PrintWriter out = null; // client�� ������ ��������
		Scanner sc= new Scanner(System.in);

		
		/*** ���� ���� ���� **/
		try {
			server_socket = new ServerSocket(9999); // �������� Ư�� ��Ʈ�� �����ִ� ���ε� ���⼭ ��Ʈ��ȣ�� ����� ��Ʈ�ܿ� �־��ֽø�˴ϴ�.
			System.out.println("���� �����....");
			
			socket = server_socket.accept();				// accept �� client�� ��û�� ����ϴ� �޼ҵ�
															// server_socket�� �޼ҵ��� accept�� �������� socket�̾ Socket socket�� �����Ѵ�.
			
			System.out.println("����Ǿ����ϴ�.");
			
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));		//�Է½�Ʈ�� ����
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));  		// ��� ��Ʈ�� ����
			
			while(true) {
				String inMsg= in.readLine();
				if(inMsg.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ�� �������ϴ�..");
					break;
				}
				System.out.println("client�� ���� �� �޼���: "+ inMsg);

				System.out.print("������>>");
				String outMsg=sc.nextLine();
				out.write(outMsg+"\n");;
				out.flush();
			}
			
		}catch(IOException e){
			 e.printStackTrace();
			
			
		}finally {
			
			try {
				sc.close();
				out.close();
				in.close();
				socket.close();
				server_socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
