import java.sql.*;

public class MysqlTest {

	public static void main(String[] args) {
		String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
		String url="jdbc:mysql://localhost:3306/chatting";
		String user ="root";
		String pass= "1234";
		
		Connection conn=null;
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("����̹� �˻� ����");
			conn = DriverManager.getConnection(url,user,pass);
			System.out.println("���Ӽ���"+conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
