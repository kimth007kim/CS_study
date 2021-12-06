import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

class EchoThread extends Thread {
	Socket socket;
	Vector<Socket> vec;

	public EchoThread(Socket socket, Vector<Socket> vec) {
		this.socket = socket;
		this.vec = vec;

	}

	@Override
	public void run() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String str = null;
			while (true) {
				str = br.readLine();
				if (str == null) {
					vec.remove(socket);
					break;
				}
				sendMsg(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (socket != null)
					socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void sendMsg(String str) {

		try {
			for (Socket socket : vec) {
				if (socket != this.socket) {
					PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
					pw.println(str);
					pw.flush();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class ChattingServer {

	public static void main(String[] args) throws ClassNotFoundException {
		serverGui sg= new serverGui();
		ServerSocket server = null;
		Socket socket = null;
		
		Connection conn =null;
		ResultSet rs = null;
		PreparedStatement psmt = null;
		
		
		String url = "jdbc:mysql://127.0.0.1:3306/chatting";
		String id = "root";
		String pw = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 검색 성공");
			conn=DriverManager.getConnection(url,id,pw);
			System.out.println("접속 성공"+ conn);
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		
		
		

		Vector<Socket> vec = new Vector<Socket>();

		try {
			server = new ServerSocket(8888);
			while (true) {
				System.out.println("접속 대기중");
				socket = server.accept();
				vec.add(socket);
				
				for( Socket s: vec) {
					System.out.println(s);
				}

				new EchoThread(socket,vec).start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
