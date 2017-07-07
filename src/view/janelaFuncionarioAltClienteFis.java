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

public class janelaFuncionarioAltClienteFis extends Shell {
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
			janelaFuncionarioAltClienteFis shell = new janelaFuncionarioAltClienteFis(display);
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
	public janelaFuncionarioAltClienteFis(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Label lblNome = new Label(this, SWT.NONE);
		lblNome.setBounds(10, 21, 55, 15);
		lblNome.setText("Nome");
		
		Label lblCpf = new Label(this, SWT.NONE);
		lblCpf.setBounds(10, 50, 28, 15);
		lblCpf.setText("CPF");
		
		Label lblSexo = new Label(this, SWT.NONE);
		lblSexo.setBounds(10, 83, 28, 15);
		lblSexo.setText("Sexo");
		
		Label lblRg = new Label(this, SWT.NONE);
		lblRg.setBounds(230, 50, 28, 15);
		lblRg.setText("RG");
		
		Label lblEstadoCivil = new Label(this, SWT.NONE);
		lblEstadoCivil.setBounds(218, 83, 68, 15);
		lblEstadoCivil.setText("Estado Civil");
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(68, 21, 332, 21);
		
		text_1 = new Text(this, SWT.BORDER);
		text_1.setBounds(68, 50, 156, 21);
		
		text_2 = new Text(this, SWT.BORDER);
		text_2.setBounds(258, 50, 142, 21);
		
		Combo combo = new Combo(this, SWT.NONE);
		combo.setItems(new String[] {"Feminino", "Masculino"});
		combo.setBounds(68, 80, 99, 23);
		
		Combo combo_1 = new Combo(this, SWT.NONE);
		combo_1.setItems(new String[] {"Solteiro", "Casado", "Separado", "Divorciado", "Vi\u00FAvo"});
		combo_1.setBounds(292, 83, 108, 23);
		
		Label lblEmail = new Label(this, SWT.NONE);
		lblEmail.setBounds(10, 116, 38, 15);
		lblEmail.setText("Email");
		
		text_3 = new Text(this, SWT.BORDER);
		text_3.setBounds(68, 116, 332, 21);
		
		Label lblTelefone = new Label(this, SWT.NONE);
		lblTelefone.setBounds(10, 154, 55, 15);
		lblTelefone.setText("Telefone");
		
		Label lblDataDeNasc = new Label(this, SWT.NONE);
		lblDataDeNasc.setBounds(224, 157, 75, 15);
		lblDataDeNasc.setText("Data de Nasc.");
		
		text_4 = new Text(this, SWT.BORDER);
		text_4.setBounds(68, 154, 144, 21);
		
		text_5 = new Text(this, SWT.BORDER);
		text_5.setBounds(304, 154, 96, 21);
		
		Label lblLogradouro = new Label(this, SWT.NONE);
		lblLogradouro.setBounds(0, 189, 68, 15);
		lblLogradouro.setText("Logradouro");
		
		text_6 = new Text(this, SWT.BORDER);
		text_6.setBounds(68, 186, 156, 21);
		
		Label lblNumero = new Label(this, SWT.NONE);
		lblNumero.setBounds(244, 192, 55, 15);
		lblNumero.setText("Numero");
		
		text_7 = new Text(this, SWT.BORDER);
		text_7.setBounds(304, 186, 96, 21);
		
		Label lblCidade = new Label(this, SWT.NONE);
		lblCidade.setBounds(10, 229, 46, 15);
		lblCidade.setText("Cidade");
		
		text_8 = new Text(this, SWT.BORDER);
		text_8.setBounds(68, 226, 116, 21);
		
		Label lblComplemento = new Label(this, SWT.NONE);
		lblComplemento.setBounds(204, 229, 82, 15);
		lblComplemento.setText("Complemento");
		
		text_9 = new Text(this, SWT.BORDER);
		text_9.setBounds(292, 226, 108, 21);
		
		Label lblCep = new Label(this, SWT.NONE);
		lblCep.setBounds(10, 263, 38, 15);
		lblCep.setText("CEP");
		
		text_10 = new Text(this, SWT.BORDER);
		text_10.setBounds(68, 260, 108, 21);
		
		Label lblEstado = new Label(this, SWT.NONE);
		lblEstado.setBounds(212, 263, 46, 15);
		lblEstado.setText("Estado");
		
		Combo combo_2 = new Combo(this, SWT.NONE);
		combo_2.setBounds(272, 260, 54, 23);
		
		Label lblAgencia = new Label(this, SWT.NONE);
		lblAgencia.setBounds(10, 299, 46, 15);
		lblAgencia.setText("Agencia");
		
		text_11 = new Text(this, SWT.BORDER);
		text_11.setBounds(68, 293, 116, 21);
		
		Label lblConta = new Label(this, SWT.NONE);
		lblConta.setBounds(204, 299, 38, 15);
		lblConta.setText("Conta");
		
		text_12 = new Text(this, SWT.BORDER);
		text_12.setBounds(66, 329, 118, 21);
		
		Button btnCancelar = new Button(this, SWT.NONE);
		btnCancelar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(349, 363, 75, 25);
		btnCancelar.setText("Cancelar");
		
		Button btnSalvar = new Button(this, SWT.NONE);
		btnSalvar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean valid = false;
				String CPF = text_1.getText();
				String user = text_12.getText();
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
		btnSalvar.setBounds(268, 363, 75, 25);
		btnSalvar.setText("Salvar");
		
		Label lblSaldoInicial = new Label(this, SWT.NONE);
		lblSaldoInicial.setBounds(10, 368, 82, 15);
		lblSaldoInicial.setText("Saldo Inicial R$");
		
		text_13 = new Text(this, SWT.BORDER);
		text_13.setBounds(258, 296, 142, 21);
		
		Label lblSenha = new Label(this, SWT.NONE);
		lblSenha.setBounds(204, 332, 38, 15);
		lblSenha.setText("Senha");
		
		text_14 = new Text(this, SWT.BORDER);
		text_14.setBounds(258, 329, 142, 21);
		
		Label lblLogin = new Label(this, SWT.NONE);
		lblLogin.setBounds(10, 332, 38, 15);
		lblLogin.setText("Login");
		
		text_15 = new Text(this, SWT.BORDER);
		text_15.setBounds(98, 363, 99, 24);
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Alterar Cliente F\u00EDsico");
		setSize(450, 436);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
