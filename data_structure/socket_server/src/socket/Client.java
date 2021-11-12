package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


public class Client {

	private static final String SERVER_IP = "127.0.0.1";		// 서버 ip 주소 127.0.0.1 로 저장
    private static final int SERVER_PORT = 8081;				// 서버 포트번호 8888로 저장

	
	public static void main(String[] args) {
		Socket socket= null;
		BufferedReader in = null;					//Server 로부터 데이터를 읽어들이기 위한 입력스트림
		BufferedReader in2 = null;					//키보드로 읽어들이기 위한 입력스트림
		PrintWriter out =null; 						//서버로 내보내기 위한 출력스트림
		
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
			System.out.print("서버로 보낼메시지:");
			String data =in2.readLine();
			out.println(data);
			out.flush();
			
			String str2=in.readLine();
			System.out.println("서버로 부터 돌아온 메세지: "+ str2);
			socket.close();
		}catch(IOException e) {
			
		}
		
	}

}
