import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
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

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;

		Vector<Socket> vec = new Vector<Socket>();

		try {
			server = new ServerSocket(8888);
			while (true) {
				System.out.println("접속 대기중");
				socket = server.accept();
				vec.add(socket);

				new EchoThread(socket,vec).start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
