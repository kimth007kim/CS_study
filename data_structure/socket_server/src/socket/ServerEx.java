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
		Socket socket = null; // client 와 통신하기위한 소켓
		ServerSocket server_socket = null; // 서버생성을 위한 서버 소켓
		BufferedReader in = null; // client로 부터 데이터를 읽어 들이기 위한 입력 스트림
		PrintWriter out = null; // client로 데이터 내보내기
		Scanner sc= new Scanner(System.in);

		
		/*** 서버 소켓 생성 **/
		try {
			server_socket = new ServerSocket(9999); // 서버에서 특정 포트를 열어주는 것인데 여기서 포트번호는 웰노운 포트외에 넣어주시면됩니다.
			System.out.println("연결 대기중....");
			
			socket = server_socket.accept();				// accept 는 client의 요청을 대기하는 메소드
															// server_socket의 메소드인 accept는 리턴형이 socket이어서 Socket socket에 저장한다.
			
			System.out.println("연결되었습니다.");
			
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));		//입력스트림 생성
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));  		// 출력 스트림 생성
			
			while(true) {
				String inMsg= in.readLine();
				if(inMsg.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트가 나갔습니다..");
					break;
				}
				System.out.println("client로 부터 온 메세지: "+ inMsg);

				System.out.print("보내기>>");
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
