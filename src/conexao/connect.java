package conexao;
import java.sql.Connection;
import java.sql.DriverManager;

public class connect {
	public static Connection getConnection(){
		Connection Conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","vertrigo");
		}catch(Exception e){System.out.println(e);}
		return Conn;
	}
}