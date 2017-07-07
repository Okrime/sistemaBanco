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

public class janelaGerenteCadFuncionario extends Shell {
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text txtEmail;
	private Text txtTelefone;
	private Text txtLogradouro;
	private Text txtNascimento;
	private Text txtNumero;
	private Text txtCidade;
	private Text txtComplemento;
	private Text txtCep;
	private Text txtLogin;
	private Text txtSenha;
	private Text text_3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			janelaGerenteCadFuncionario shell = new janelaGerenteCadFuncionario(display);
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
	public janelaGerenteCadFuncionario(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Label lblNome = new Label(this, SWT.NONE);
		lblNome.setBounds(10, 16, 55, 15);
		lblNome.setText("Nome");
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(71, 13, 326, 21);
		
		text_1 = new Text(this, SWT.BORDER);
		text_1.setBounds(71, 40, 129, 21);
		
		Label lblCpf = new Label(this, SWT.NONE);
		lblCpf.setBounds(10, 43, 55, 15);
		lblCpf.setText("CPF");
		
		Label lblRg = new Label(this, SWT.NONE);
		lblRg.setBounds(223, 43, 22, 15);
		lblRg.setText("RG");
		
		text_2 = new Text(this, SWT.BORDER);
		text_2.setBounds(251, 40, 146, 21);
		
		Label lblSexo = new Label(this, SWT.NONE);
		lblSexo.setBounds(10, 70, 55, 15);
		lblSexo.setText("Sexo");
		
		Label lblEstadoCivil = new Label(this, SWT.NONE);
		lblEstadoCivil.setBounds(201, 70, 61, 15);
		lblEstadoCivil.setText("Estado Civil");
		
		Label lblEmail = new Label(this, SWT.NONE);
		lblEmail.setBounds(10, 126, 55, 15);
		lblEmail.setText("Email");
		
		Label lblTelefone = new Label(this, SWT.NONE);
		lblTelefone.setBounds(10, 99, 55, 15);
		lblTelefone.setText("Telefone");
		
		Label lblLogradouro = new Label(this, SWT.NONE);
		lblLogradouro.setBounds(3, 153, 62, 15);
		lblLogradouro.setText("Logradouro");
		
		Label lblNumero = new Label(this, SWT.NONE);
		lblNumero.setBounds(265, 153, 55, 15);
		lblNumero.setText("N\u00FAmero");
		
		Combo combo = new Combo(this, SWT.NONE);
		combo.setItems(new String[] {"Feminino", "Masculino"});
		combo.setBounds(71, 67, 112, 23);
		
		Combo combo_1 = new Combo(this, SWT.NONE);
		combo_1.setItems(new String[] {"Casado(a)", "Divorciado(a)", "Separado(a)", "Solteiro(a)", "Vi\u00FAvo(a)"});
		combo_1.setBounds(276, 67, 121, 23);
		
		txtEmail = new Text(this, SWT.BORDER);
		txtEmail.setBounds(71, 123, 191, 21);
		
		txtTelefone = new Text(this, SWT.BORDER);
		txtTelefone.setBounds(71, 96, 112, 21);
		
		txtLogradouro = new Text(this, SWT.BORDER);
		txtLogradouro.setBounds(71, 150, 155, 21);
		
		Label lblDataDeNascimento = new Label(this, SWT.NONE);
		lblDataDeNascimento.setBounds(189, 99, 112, 15);
		lblDataDeNascimento.setText("Data de Nascimento");
		
		txtNascimento = new Text(this, SWT.BORDER);
		txtNascimento.setBounds(304, 96, 91, 21);
		
		txtNumero = new Text(this, SWT.BORDER);
		txtNumero.setBounds(321, 150, 76, 21);
		
		Label lblCidade = new Label(this, SWT.NONE);
		lblCidade.setBounds(10, 180, 55, 15);
		lblCidade.setText("Cidade");
		
		txtCidade = new Text(this, SWT.BORDER);
		txtCidade.setBounds(71, 177, 139, 21);
		
		txtComplemento = new Text(this, SWT.BORDER);
		txtComplemento.setBounds(321, 177, 76, 21);
		
		txtCep = new Text(this, SWT.BORDER);
		txtCep.setBounds(71, 204, 129, 21);
		
		txtLogin = new Text(this, SWT.BORDER);
		txtLogin.setBounds(71, 231, 129, 21);
		
		Label lblComplemento = new Label(this, SWT.NONE);
		lblComplemento.setBounds(237, 180, 83, 15);
		lblComplemento.setText("Complemento");
		
		Label lblCep = new Label(this, SWT.NONE);
		lblCep.setBounds(10, 207, 55, 15);
		lblCep.setText("CEP");
		
		Label lblLogin = new Label(this, SWT.NONE);
		lblLogin.setBounds(10, 234, 55, 15);
		lblLogin.setText("Login");
		
		txtSenha = new Text(this, SWT.BORDER);
		txtSenha.setBounds(285, 231, 112, 21);
		
		Label lblSenha = new Label(this, SWT.NONE);
		lblSenha.setBounds(240, 234, 38, 15);
		lblSenha.setText("Senha");
		
		Label lblEstado = new Label(this, SWT.NONE);
		lblEstado.setBounds(265, 207, 55, 15);
		lblEstado.setText("Estado");
		
		Combo combo_2 = new Combo(this, SWT.NONE);
		combo_2.setItems(new String[] {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"});
		combo_2.setBounds(321, 204, 76, 23);
		
		Button btnCancelar = new Button(this, SWT.NONE);
		btnCancelar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(326, 258, 75, 25);
		btnCancelar.setText("Cancelar");
		
		Button btnConfirmar = new Button(this, SWT.NONE);
		btnConfirmar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean valid = false;
				String CPF = text_1.getText();
				String user = txtLogin.getText();
				valid = menu.checarCPF(CPF);	//validar se CPF existe
				if (valid)
					valid = menu.checarUser(user);	//validar se login existe
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
		btnConfirmar.setBounds(245, 258, 75, 25);
		btnConfirmar.setText("Confirmar");
		
		Label lblSalrioInicialR = new Label(this, SWT.NONE);
		lblSalrioInicialR.setBounds(0, 261, 91, 15);
		lblSalrioInicialR.setText("Sal\u00E1rio Inicial: R$");
		
		text_3 = new Text(this, SWT.BORDER);
		text_3.setBounds(97, 258, 103, 21);
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Cadastrar Funcion\u00E1rio");
		setSize(450, 327);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
