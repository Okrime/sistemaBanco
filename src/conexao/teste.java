package conexao;

import java.sql.*;
import java.util.Scanner;

//import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
//import com.mysql.jdbc.ResultSetMetaData;


public class teste {

	public static void main(String[] args){
		Connection conn = null;
		try{
			conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema"
					,"root","vertrigo");
			
			if(conn!=null){
				System.out.println("Conectado com sucesso.");
			}
		}catch(Exception e){
			System.out.println("Nao conectado");
		}
		
		//insere um id, insere os bagulho do id, dai insierer cliente mesmo id, 
		//dai recuperar saldo desse id cliente
		
		Scanner scanner = new Scanner(System.in);  
		int codigo = scanner.nextInt();
		try{
			Connection Conn = connect.getConnection();
			Statement stmt = (Statement) Conn.createStatement();
			String sqlBusca = "Select * from cliente where clienteid =" + codigo + ";";
			
			ResultSet rs = stmt.executeQuery(sqlBusca);
			rs.next();
			
			String nome = rs.getString(2);
			float saldo = rs.getFloat(5);
			System.out.println("O saldo de " + nome + " é: " + saldo);
			
			/*ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				//Print one row          
				for(int i = 1 ; i <= columnsNumber; i++){

				      System.out.print(rs.getString(i) + " "); //Print one element of a row

				}

				  System.out.println();//Move to the next line to print the next row.           

				    }
			
			*/
		}catch(Exception e){
			System.out.println("Codigo não encontrado.");
		}
		
		scanner.close();
	}
}
