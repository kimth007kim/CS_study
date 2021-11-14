import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


//https://blog.naver.com/highkrs/220844554537

public class Server {

	public static void main(String[] args) {
		ServerSocket socket_server;
		try {
			socket_server = new ServerSocket(8888);
			System.out.println("서버 동작중1");
			Socket socket = socket_server.accept();
			System.out.println("서버 동작중2");
			
			
			ReceiveThread rec_thread= new ReceiveThread();
			rec_thread.setSocket(socket);
			
			SendThread send_thread = new SendThread();
			send_thread.setSocket(socket);
			
			rec_thread.start();
			send_thread.start();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
