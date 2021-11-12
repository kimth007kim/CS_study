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
		Socket socket = null; // client 와 통신하기위한 소켓
		ServerSocket server_socket = null; // 서버생성을 위한 서버 소켓
		BufferedReader in = null; // client로 부터 데이터를 읽어 들이기 위한 입력 스트림
		PrintWriter out = null; // client로 데이터 내보내기
		Scanner sc= new Scanner(System.in);

		
		/*** 서버 소켓 생성 **/
		try {
			socket =new Socket("localhost",9999); // 서버에서 특정 포트를 열어주는 것인데 여기서 포트번호는 웰노운 포트외에 넣어주시면됩니다.

			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));		//입력스트림 생성
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));  		// 출력 스트림 생성
			
			while(true) {
				System.out.print("보내기>>");
				String outMsg=sc.nextLine();
				
				if(outMsg.equalsIgnoreCase("bye")) {
					out.write(outMsg+"\n");;
					System.out.println("접속종료!");
					out.flush();
					break;
				}

				out.write(outMsg+"\n");;
				out.flush();
				
				String inMsg= in.readLine();
				System.out.println("서버>>  "+ inMsg);
				
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
