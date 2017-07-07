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

public class janelaFuncionarioCadClienteFis extends Shell {
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text_11;
	private Text text_12;
	private Text text_13;
	private Text text_14;
	private Text text_15;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			janelaFuncionarioCadClienteFis shell = new janelaFuncionarioCadClienteFis(display);
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
	public janelaFuncionarioCadClienteFis(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Label label = new Label(this, SWT.NONE);
		label.setText("Nome");
		label.setBounds(20, 22, 55, 15);
		
		Label label_1 = new Label(this, SWT.NONE);
		label_1.setText("CPF");
		label_1.setBounds(20, 51, 28, 15);
		
		Label label_2 = new Label(this, SWT.NONE);
		label_2.setText("Sexo");
		label_2.setBounds(20, 84, 28, 15);
		
		Label label_3 = new Label(this, SWT.NONE);
		label_3.setText("RG");
		label_3.setBounds(240, 51, 28, 15);
		
		Label label_4 = new Label(this, SWT.NONE);
		label_4.setText("Estado Civil");
		label_4.setBounds(228, 84, 68, 15);
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(78, 22, 332, 21);
		
		text_1 = new Text(this, SWT.BORDER);
		text_1.setBounds(78, 51, 156, 21);
		
		text_2 = new Text(this, SWT.BORDER);
		text_2.setBounds(268, 51, 142, 21);
		
		Combo combo = new Combo(this, SWT.NONE);
		combo.setItems(new String[] {"Feminino", "Masculino"});
		combo.setBounds(78, 81, 99, 23);
		
		Combo combo_1 = new Combo(this, SWT.NONE);
		combo_1.setItems(new String[] {"Solteiro", "Casado", "Separado", "Divorciado", "Vi\u00FAvo"});
		combo_1.setBounds(302, 84, 108, 23);
		
		Label label_5 = new Label(this, SWT.NONE);
		label_5.setText("Email");
		label_5.setBounds(20, 117, 38, 15);
		
		text_3 = new Text(this, SWT.BORDER);
		text_3.setBounds(78, 117, 332, 21);
		
		Label label_6 = new Label(this, SWT.NONE);
		label_6.setText("Telefone");
		label_6.setBounds(20, 155, 55, 15);
		
		Label label_7 = new Label(this, SWT.NONE);
		label_7.setText("Data de Nasc.");
		label_7.setBounds(240, 158, 82, 15);
		
		text_4 = new Text(this, SWT.BORDER);
		text_4.setBounds(78, 155, 144, 21);
		
		text_5 = new Text(this, SWT.BORDER);
		text_5.setBounds(314, 155, 96, 21);
		
		Label label_8 = new Label(this, SWT.NONE);
		label_8.setText("Logradouro");
		label_8.setBounds(10, 190, 68, 15);
		
		text_6 = new Text(this, SWT.BORDER);
		text_6.setBounds(78, 187, 156, 21);
		
		Label label_9 = new Label(this, SWT.NONE);
		label_9.setText("Numero");
		label_9.setBounds(254, 193, 55, 15);
		
		text_7 = new Text(this, SWT.BORDER);
		text_7.setBounds(314, 187, 96, 21);
		
		Label label_10 = new Label(this, SWT.NONE);
		label_10.setText("Cidade");
		label_10.setBounds(20, 230, 46, 15);
		
		text_8 = new Text(this, SWT.BORDER);
		text_8.setBounds(78, 227, 116, 21);
		
		Label label_11 = new Label(this, SWT.NONE);
		label_11.setText("Complemento");
		label_11.setBounds(214, 230, 82, 15);
		
		text_9 = new Text(this, SWT.BORDER);
		text_9.setBounds(302, 227, 108, 21);
		
		Label label_12 = new Label(this, SWT.NONE);
		label_12.setText("CEP");
		label_12.setBounds(20, 264, 38, 15);
		
		text_10 = new Text(this, SWT.BORDER);
		text_10.setBounds(78, 261, 116, 21);
		
		Label label_13 = new Label(this, SWT.NONE);
		label_13.setText("Estado");
		label_13.setBounds(254, 264, 38, 15);
		
		Combo combo_2 = new Combo(this, SWT.NONE);
		combo_2.setBounds(302, 261, 54, 23);
		
		Label label_14 = new Label(this, SWT.NONE);
		label_14.setText("Agencia");
		label_14.setBounds(20, 300, 46, 15);
		
		text_11 = new Text(this, SWT.BORDER);
		text_11.setBounds(78, 294, 116, 21);
		
		Label label_15 = new Label(this, SWT.NONE);
		label_15.setText("Conta");
		label_15.setBounds(258, 300, 38, 15);
		
		text_12 = new Text(this, SWT.BORDER);
		text_12.setBounds(302, 297, 118, 21);
		
		Label lblSaldoInicialR = new Label(this, SWT.NONE);
		lblSaldoInicialR.setText("Saldo Inicial R$");
		lblSaldoInicialR.setBounds(20, 378, 82, 15);
		
		Button button = new Button(this, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
			}
		});
		button.setText("Cancelar");
		button.setBounds(335, 373, 75, 25);
		
		text_15 = new Text(this, SWT.BORDER);
		text_15.setBounds(78, 332, 116, 21);
		
		Button button_1 = new Button(this, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean valid = false;
				String CPF = text_1.getText();
				String user = text_15.getText();
				valid = menu.checarUser(user);	//validar se login existe
				if (valid)
					valid = menu.checarCPF(CPF);	//validar se CPF existe
				setVisible(false);
				if (!valid){	//se retornar falso é porque nao achou nenhum CPF igual
					//* BD * inserir dados no banco
					operacaoSucesso oS = new operacaoSucesso(display);
					oS.setVisible(true);
				}else {
					operacaoFalha oF = new operacaoFalha(display);
					oF.setVisible(true);
				}
			}
		});
		button_1.setText("Salvar");
		button_1.setBounds(254, 373, 75, 25);
		
		Label lblSenha = new Label(this, SWT.NONE);
		lblSenha.setBounds(258, 335, 38, 15);
		lblSenha.setText("Senha");
		
		text_13 = new Text(this, SWT.BORDER);
		text_13.setBounds(302, 332, 116, 21);
		
		text_14 = new Text(this, SWT.BORDER);
		text_14.setBounds(108, 375, 108, 21);
		
		Label lblLogin = new Label(this, SWT.NONE);
		lblLogin.setBounds(20, 335, 38, 15);
		lblLogin.setText("Login");
	
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Cadastrar Cliente F\u00EDsico");
		setSize(450, 448);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
