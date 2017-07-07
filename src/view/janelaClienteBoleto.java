package view;
import java.sql.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.mysql.jdbc.Statement;

import conexao.connect;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import view.menu;

public class janelaClienteBoleto extends Shell {
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			janelaClienteBoleto shell = new janelaClienteBoleto(display);
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
	public janelaClienteBoleto(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Label lblCodigo = new Label(this, SWT.NONE);
		lblCodigo.setBounds(37, 16, 50, 15);
		lblCodigo.setText("Codigo");
		
		Label lblDataDeVenc = new Label(this, SWT.NONE);
		lblDataDeVenc.setBounds(10, 58, 77, 15);
		lblDataDeVenc.setText("Data de Venc.");
		
		Label lblValor = new Label(this, SWT.NONE);
		lblValor.setBounds(48, 90, 35, 15);
		lblValor.setText("Valor");
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(89, 13, 270, 21);
		
		text_1 = new Text(this, SWT.BORDER);
		text_1.setBounds(89, 52, 25, 21);
		
		text_2 = new Text(this, SWT.BORDER);
		text_2.setBounds(89, 87, 132, 21);
		
		Button btnCancelar = new Button(this, SWT.NONE);
		btnCancelar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(300, 137, 75, 25);
		btnCancelar.setText("Cancelar");
		
		Label label_value = new Label(this, SWT.NONE);
		label_value.setBounds(124, 142, 41, 15);
		
		Button btnConfirmar = new Button(this, SWT.NONE);
		btnConfirmar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String codigo, aux;
				float saldo=0;
				menu.idLogado = 1;
				try{
					Connection Conn = connect.getConnection();
					Statement stmt = (Statement) Conn.createStatement();
					String sqlBusca = "SELECT * FROM new_schema.cliente WHERE clienteid = " + menu.idLogado + ";";
					
					//Test later
					ResultSet rs = stmt.executeQuery(sqlBusca);
					rs.next();
					
					saldo = rs.getFloat(5);
					
				}catch(Exception j){
					System.out.println("Erro.");
				}
				System.out.println(saldo);
				aux = String.valueOf(saldo);
				System.out.println(aux);
				label_value.setText(aux);	//*BD*
				float valor;
				aux = text_2.getText();
				valor = Float.parseFloat(aux);
				int dia, mes, ano;
				codigo = text.getText();
				aux = text_1.getText();
				dia = Integer.parseInt(aux);
				aux = text_3.getText();
				mes = Integer.parseInt(aux);
				aux = text_4.getText();
				ano = Integer.parseInt(aux);
				boolean valid = false;
				int tam;
				String inputedPassword = text_2.getText();
				tam = codigo.length();
				valid = menu.checarTamanho(tam, 1);	//validar boleto, tamanho do boleto deve ser 1
				if (valid){
					valid = checarData(dia, mes, ano);	//validar data
					if (valid)
						valid = menu.checarValor(saldo, valor);	//validar saldo
				}
				setVisible(false);
				/* confirmar senha
				confirmar C = new confirmar(display);
				C.setVisible(true);
				*/
				if (valid){
					saldo = saldo - valor;	//* BD * atualizar saldo no BD
					operacaoSucesso oS = new operacaoSucesso(display);
					oS.setVisible(true);
				}else {
					operacaoFalha oF = new operacaoFalha(display);
					oF.setVisible(true);
				}
			}
		});
		btnConfirmar.setBounds(219, 137, 75, 25);
		btnConfirmar.setText("Confirmar");
		
		text_3 = new Text(this, SWT.BORDER);
		text_3.setBounds(130, 52, 25, 21);
		
		text_4 = new Text(this, SWT.BORDER);
		text_4.setBounds(171, 52, 50, 21);
		
		Label label = new Label(this, SWT.NONE);
		label.setBounds(120, 55, 5, 15);
		label.setText("/");
		
		Label label_1 = new Label(this, SWT.NONE);
		label_1.setText("/");
		label_1.setBounds(161, 55, 10, 15);
		
		Label lblSaldoDisponvel = new Label(this, SWT.NONE);
		lblSaldoDisponvel.setBounds(10, 142, 115, 15);
		lblSaldoDisponvel.setText("Saldo Dispon\u00EDvel\tR$");
		
		
		createContents();
	}
	
	public boolean checarData(int dia, int mes, int ano){
		boolean valid = false;
		if ((dia<32)&&(dia>-1)){
			if ((mes<13)&&(mes>-1)){
				if ((ano<2025)&&(ano>2016))
					valid = true;
			}
		}
		return valid;
	}
	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Pagamento de Boleto");
		setSize(399, 216);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
