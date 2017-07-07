package view;
import java.sql.*;
//import java.util.Scanner;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

//import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import conexao.connect;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class login extends Shell {
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			login shell = new login(display);
			shell.open();
			shell.layout();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * Create the shell.
	 * @param display
	 */
	public login(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Label lblLogin = new Label(this, SWT.NONE);
		lblLogin.setBounds(23, 37, 40, 15);
		lblLogin.setText("Login");
		
		Label lblSenha = new Label(this, SWT.NONE);
		lblSenha.setBounds(23, 70, 40, 15);
		lblSenha.setText("Senha");
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(69, 34, 117, 21);
		
		text_1 = new Text(this, SWT.BORDER);
		text_1.setBounds(69, 67, 117, 21);
		
		Button btnEntrar = new Button(this, SWT.NONE);
		btnEntrar.setBounds(10, 117, 75, 25);
		btnEntrar.setText("Entrar");
		btnEntrar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int id;
				String loginInput = null, passwordInput = null;
				//boolean valid = false;
				loginInput = text.getText();
				passwordInput = text_1.getText();
				id = checarLogin(loginInput, passwordInput);
				setVisible(false);
				if (id != 0){
					menu.idLogado = id;
					menu Menu = new menu(display, id);
					Menu.setVisible(true);
				}else {
					//print mensagem de erro
					menu.loggedType = 0;
					operacaoFalha oF = new operacaoFalha(display);
					oF.setVisible(true);
				}
			}
		});
		
		Button btnVoltar = new Button(this, SWT.NONE);
		btnVoltar.setBounds(126, 117, 75, 25);
		btnVoltar.setText("Voltar");
		btnVoltar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
			}
		});
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Login Cliente");
		setSize(227, 190);

	}
	
	public int checarLogin(String username, String password) {
		//String bdUsername = "a", bdPassword = "a";	//*BD*
		
		try{
			Connection Conn = connect.getConnection();
			Statement stmt = (Statement) Conn.createStatement();
			String sqlBusca = "SELECT * FROM new_schema.login WHERE loginnome = '" + username + "';";
			
			//Test later
			ResultSet rs = stmt.executeQuery(sqlBusca);
			rs.next();
			
			int id = rs.getInt(1);
			String bdPassword = rs.getString(3);
			String bdUsername = rs.getString(2);
		
			if(bdUsername.equals(username) && bdPassword.equals(password)){
				menu.loggedType = rs.getInt(4);
	            return id;
	        
			}else return 0;
			
		}catch(Exception e){
			System.out.println("Erro.");
			return 0;
		}
	}
	
	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
