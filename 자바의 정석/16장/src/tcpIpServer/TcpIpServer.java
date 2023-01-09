package tcpIpServer;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket= null;


        serverSocket= new ServerSocket(7777);
        System.out.println(getTime()+"서버가 준비되었습니다.");

    while (true){
        System.out.println(getTime()+"연결 요청을 기다립니다.");
        Socket socket=serverSocket.accept();
        System.out.println(getTime()+socket.getInetAddress()+"로 부터 연결 요청이 들어왔습니다.");

        OutputStream out =socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);

        dos.writeUTF("[Notice] Test Message1 from Server.");
        System.out.println(getTime()+"데이터를 전송 했습니다.");

        dos.close();
        socket.close();


    }

    }
    static String getTime(){
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }
}
