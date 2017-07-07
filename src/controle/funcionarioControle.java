package controle;

//import java.net.ConnectException;
import java.sql.*;
import javax.swing.JOptionPane;
//import org.eclipse.ui.internal.menus.ExtensionContribution;
//import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import classes.Funcionario;
import conexao.connect;

import java.util.Date;

public class funcionarioControle
{
	public void insereDados(String nome, Date dataContratacao, double salario)
	{
		connect banco = new connect();
		try
		{
			Connection ExConn = connect.getConnection();
			Statement stmt = (Statement)ExConn.createStatement();
			
			String sql = "insert into funcionario (funcionarionome, datacontratacao, salario) " 
					+ "values ('"+ nome + "','" + dataContratacao + "','"+ salario + "');";
			
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
	
	public void excluirDados (int codigo){
		/*connect banco = new connect();
		try{
			Connection ExConn = (Connection)banco.abrirBDConn();
			Statement stmt = (Statement) ExConn.createStatement();
			String sqlDelete = "delete from funcionario where funcionarioid = " + codigo;
			boolean rs = stmt.execute(sqlDelete);
			optionPane.showConfirmDialog(null,(!rs)? "Dados do funcionario"  + 
			Dados do clien ")
			stmt.close();
			banco.fecharBDConn();
		}
		catch(Exception e){
			
		}*/
	}
	
	public ResultSet buscaDados(){
		connect banco = new connect();
		try{
			Connection ExConn = connect.getConnection();
			Statement stmt = (Statement) ExConn.createStatement();
			String sqlBusca = "Select * from funcionario";
			
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
			String sqlBusca = "Select * from funcionario where funcionarioid = "+ codigo + ";";
			
			ResultSet rs = stmt.executeQuery(sqlBusca);
			
			return rs;
		}
		catch(Exception e){
			return null;
		}
	}
		
		public void alteraDados(String nome, Date dataContratacao, double salario, Funcionario FuncionarioClass){
			connect banco = new connect();
			try{
				Connection ExConn = connect.getConnection();
				Statement stmt = (Statement) ExConn.createStatement();
				
				String sqlUpdate = "update funcionario set" + "FUNCIONARIONOME = '" + nome+ "', "
						+ "DATACONTRATACAO = '" + dataContratacao + "',"
						+ "FUNCIONARIOSALARIO = '" + salario + "'"
						+ "" + "where funcionarioid ="
						+ FuncionarioClass.getfuncionarioId() + ";";
				
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
