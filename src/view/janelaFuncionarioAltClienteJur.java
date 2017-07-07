package view;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import view.menu;

public class janelaFuncionarioAltClienteJur extends Shell {
	private Text text;
	private Text text_3;
	private Text text_4;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text_11;
	private Text text_12;
	private Text text_1;
	private Text text_2;
	private Text text_5;
	private Text text_13;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			janelaFuncionarioAltClienteJur shell = new janelaFuncionarioAltClienteJur(display);
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
	public janelaFuncionarioAltClienteJur(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Label label = new Label(this, SWT.NONE);
		label.setText("Nome");
		label.setBounds(20, 28, 55, 15);
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(78, 25, 332, 21);
		
		Label label_5 = new Label(this, SWT.NONE);
		label_5.setText("Email");
		label_5.setBounds(20, 57, 38, 15);
		
		text_3 = new Text(this, SWT.BORDER);
		text_3.setBounds(78, 57, 332, 21);
		
		Label label_6 = new Label(this, SWT.NONE);
		label_6.setText("Telefone");
		label_6.setBounds(20, 95, 55, 15);
		
		text_4 = new Text(this, SWT.BORDER);
		text_4.setBounds(78, 95, 124, 21);
		
		Label label_8 = new Label(this, SWT.NONE);
		label_8.setText("Logradouro");
		label_8.setBounds(10, 130, 68, 15);
		
		text_6 = new Text(this, SWT.BORDER);
		text_6.setBounds(78, 127, 156, 21);
		
		Label label_9 = new Label(this, SWT.NONE);
		label_9.setText("Numero");
		label_9.setBounds(253, 130, 55, 15);
		
		text_7 = new Text(this, SWT.BORDER);
		text_7.setBounds(314, 127, 96, 21);
		
		Label label_10 = new Label(this, SWT.NONE);
		label_10.setText("Cidade");
		label_10.setBounds(20, 170, 46, 15);
		
		text_8 = new Text(this, SWT.BORDER);
		text_8.setBounds(78, 167, 124, 21);
		
		Label label_11 = new Label(this, SWT.NONE);
		label_11.setText("Complemento");
		label_11.setBounds(214, 170, 82, 15);
		
		text_9 = new Text(this, SWT.BORDER);
		text_9.setBounds(302, 167, 108, 21);
		
		Label label_12 = new Label(this, SWT.NONE);
		label_12.setText("CEP");
		label_12.setBounds(20, 204, 38, 15);
		
		text_10 = new Text(this, SWT.BORDER);
		text_10.setBounds(78, 201, 124, 21);
		
		Label label_13 = new Label(this, SWT.NONE);
		label_13.setText("Estado");
		label_13.setBounds(222, 204, 46, 15);
		
		Combo combo_2 = new Combo(this, SWT.NONE);
		combo_2.setBounds(282, 201, 54, 23);
		
		Label label_14 = new Label(this, SWT.NONE);
		label_14.setText("Agencia");
		label_14.setBounds(20, 240, 46, 15);
		
		text_11 = new Text(this, SWT.BORDER);
		text_11.setBounds(78, 234, 124, 21);
		
		Label label_15 = new Label(this, SWT.NONE);
		label_15.setText("Conta");
		label_15.setBounds(240, 237, 38, 15);
		
		text_12 = new Text(this, SWT.BORDER);
		text_12.setBounds(282, 234, 128, 21);
		
		Label lblSaldoInicial = new Label(this, SWT.NONE);
		lblSaldoInicial.setBounds(6, 317, 82, 15);
		lblSaldoInicial.setText("Saldo Inicial: R$");
		
		text_1 = new Text(this, SWT.BORDER);
		text_1.setBounds(94, 314, 104, 21);
		
		Button btnCancelar = new Button(this, SWT.NONE);
		btnCancelar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(331, 312, 75, 25);
		btnCancelar.setText("Cancelar");
		
		text_2 = new Text(this, SWT.BORDER);
		text_2.setBounds(314, 95, 96, 21);
		
		text_5 = new Text(this, SWT.BORDER);
		text_5.setBounds(78, 274, 124, 21);
		
		Button btnSalvar = new Button(this, SWT.NONE);
		btnSalvar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean valid = false;
				String CNPJ = text_2.getText();
				String user = text_5.getText();
				valid = menu.checarUser(user);	//validar se login existe
				valid = menu.checarCNPJ(CNPJ);	//validar se CNPJ existe
				setVisible(false);
				if (!valid){	//se retornar falso é porque nao achou nenhum CNPJ igual
					//* BD * inserir dados no banco
					operacaoSucesso oS = new operacaoSucesso(display);
					oS.setVisible(true);
				}else {
					operacaoFalha oF = new operacaoFalha(display);
					oF.setVisible(true);
				}
			}
		});
		btnSalvar.setBounds(233, 312, 75, 25);
		btnSalvar.setText("Salvar");
		
		Label lblCnpj = new Label(this, SWT.NONE);
		lblCnpj.setBounds(258, 95, 38, 15);
		lblCnpj.setText("CNPJ");
		
		Label lblLogin = new Label(this, SWT.NONE);
		lblLogin.setBounds(28, 280, 30, 15);
		lblLogin.setText("Login");
		
		Label lblSenha = new Label(this, SWT.NONE);
		lblSenha.setBounds(240, 280, 38, 15);
		lblSenha.setText("Senha");
		
		text_13 = new Text(this, SWT.BORDER);
		text_13.setBounds(282, 277, 128, 21);
		
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Alterar Cliente Jur\u00EDdico");
		setSize(450, 384);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
