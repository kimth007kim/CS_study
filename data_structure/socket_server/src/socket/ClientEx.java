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

public class ClientEx {

	public static void main(String[] args) {
		Socket socket = null; // client �� ����ϱ����� ����
		ServerSocket server_socket = null; // ���������� ���� ���� ����
		BufferedReader in = null; // client�� ���� �����͸� �о� ���̱� ���� �Է� ��Ʈ��
		PrintWriter out = null; // client�� ������ ��������
		Scanner sc= new Scanner(System.in);

		
		/*** ���� ���� ���� **/
		try {
			socket =new Socket("localhost",9999); // �������� Ư�� ��Ʈ�� �����ִ� ���ε� ���⼭ ��Ʈ��ȣ�� ����� ��Ʈ�ܿ� �־��ֽø�˴ϴ�.

			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));		//�Է½�Ʈ�� ����
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));  		// ��� ��Ʈ�� ����
			
			while(true) {
				System.out.print("������>>");
				String outMsg=sc.nextLine();
				
				if(outMsg.equalsIgnoreCase("bye")) {
					out.write(outMsg+"\n");;
					System.out.println("��������!");
					out.flush();
					break;
				}

				out.write(outMsg+"\n");;
				out.flush();
				
				String inMsg= in.readLine();
				System.out.println("����>>  "+ inMsg);
				
			}
			
		}catch(IOException e){
			 e.printStackTrace();
			
			
		}finally {
			
			try {
				sc.close();
				out.close();
				in.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
