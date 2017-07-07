package controle;

//import java.net.ConnectException;
import java.sql.*;
import javax.swing.JOptionPane;
//import org.eclipse.ui.internal.menus.ExtensionContribution;
//import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import classes.Cliente;
import conexao.connect;

public class clienteControle
{
	public void insereDados(String nome, String email, int telefone)
	{
		connect banco = new connect();
		try
		{
			Connection ExConn = connect.getConnection();
			Statement stmt = (Statement)ExConn.createStatement();
			
			String sql = "insert into cliente (clientenome, email, telefone) " 
					+ "values ('"+ nome + "','" + email + "','"+ telefone + "');";
			
			System.out.println(sql);
			
			boolean res = stmt.execute(sql);
			
			JOptionPane.showMessageDialog(null, (!res)?"Dados inseridos com Sucesso":""
					+ ""+"Os dados não puderam ser inseridos");
			
			stmt.close();
			ExConn.close();
		}
		catch(Exception e)
		{
			JOptionPane.showConfirmDialog(null, "Os dados não puderam ser inseridos!!");
		}
	}
	
	public void excluiDados(int codigo)
	{
		connect banco = new connect();	//criar uma variavel do tipo Connect com nome banco - cria conexão com o banco
		try
		{
			Connection ExConn = connect.getConnection();
			Statement stmt = (Statement) ExConn.createStatement();
			String sqlDelete = "DELETE FROM cliente WHERE clienteid = " + codigo + ";";
			System.out.println(sqlDelete);
			boolean retorno = stmt.execute(sqlDelete);
			
			JOptionPane.showMessageDialog(null, (!retorno)?"Dados do funcionário excluídos com Sucesso!":"" + "Dados do funcionário não foram excluídos!");
			
			stmt.close();	//fechar statement
			ExConn.close();	//fechar banco de dados
		}
		
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "Os dados do funcionário não puderam ser excluídos!");
		}
	}

	
	public ResultSet buscaDados(){
		connect banco = new connect();
		try{
			Connection ExConn = connect.getConnection();
			Statement stmt = (Statement) ExConn.createStatement();
			String sqlBusca = "Select * from cliente";
			
			ResultSet rs = stmt.executeQuery(sqlBusca);
			
			return rs;
		}
		catch(Exception e){
			
			return null;
		}
	}
	
	public ResultSet buscaDados(int codigo){
		connect banco = new connect();
		try{
			Connection ExConn = connect.getConnection();
			Statement stmt = (Statement) ExConn.createStatement();
			String sqlBusca = "Select * from cliente where clienteid = "+ codigo + ";";
			
			ResultSet rs = stmt.executeQuery(sqlBusca);
			
			return rs;
		}
		catch(Exception e){
			return null;
		}
	}
		
		public void alteraDados(String nome, String email, int telefone, Cliente ClienteClass){
			connect banco = new connect();
			try{
				Connection ExConn = connect.getConnection();
				Statement stmt = (Statement) ExConn.createStatement();
				
				String sqlUpdate = "update cliente set" + "CLIENTENOME = '" + nome+ "', "
						+ "EMAIL = '" + email + "',"
						+ "TELEFONE = '" + telefone + "'"
						+ "" + "where clienteid ="
						+ ClienteClass.getclienteId() + ";";
				
				int retorno = stmt.executeUpdate(sqlUpdate);
				
				if(retorno == 1)
					JOptionPane.showConfirmDialog(null, "Dados atualizados");
				
				stmt.close();
				ExConn.close();
			}
			catch(Exception e){
				JOptionPane.showConfirmDialog(null, "Dados nao atualizados");
				
			}
	}
}
