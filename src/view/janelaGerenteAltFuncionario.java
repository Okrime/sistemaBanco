package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class janelaGerenteAltFuncionario extends Shell {
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

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			janelaGerenteAltFuncionario shell = new janelaGerenteAltFuncionario(display);
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
	public janelaGerenteAltFuncionario(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Label label = new Label(this, SWT.NONE);
		label.setText("Nome");
		label.setBounds(17, 13, 55, 15);
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(78, 10, 326, 21);
		
		text_1 = new Text(this, SWT.BORDER);
		text_1.setBounds(78, 37, 129, 21);
		
		Label label_1 = new Label(this, SWT.NONE);
		label_1.setText("CPF");
		label_1.setBounds(17, 40, 55, 15);
		
		Label label_2 = new Label(this, SWT.NONE);
		label_2.setText("RG");
		label_2.setBounds(230, 40, 21, 15);
		
		text_2 = new Text(this, SWT.BORDER);
		text_2.setBounds(258, 37, 146, 21);
		
		Label label_3 = new Label(this, SWT.NONE);
		label_3.setText("Sexo");
		label_3.setBounds(17, 67, 55, 15);
		
		Label label_4 = new Label(this, SWT.NONE);
		label_4.setText("Estado Civil");
		label_4.setBounds(208, 67, 61, 15);
		
		Label label_5 = new Label(this, SWT.NONE);
		label_5.setText("Email");
		label_5.setBounds(17, 123, 55, 15);
		
		Label label_6 = new Label(this, SWT.NONE);
		label_6.setText("Telefone");
		label_6.setBounds(17, 96, 55, 15);
		
		Label label_7 = new Label(this, SWT.NONE);
		label_7.setText("Logradouro");
		label_7.setBounds(10, 150, 62, 15);
		
		Label label_8 = new Label(this, SWT.NONE);
		label_8.setText("N\u00FAmero");
		label_8.setBounds(272, 150, 55, 15);
		
		Combo combo = new Combo(this, SWT.NONE);
		combo.setItems(new String[] {"Feminino", "Masculino"});
		combo.setBounds(78, 64, 112, 23);
		
		Combo combo_1 = new Combo(this, SWT.NONE);
		combo_1.setItems(new String[] {"Casado(a)", "Divorciado(a)", "Separado(a)", "Solteiro(a)", "Vi\u00FAvo(a)"});
		combo_1.setBounds(283, 64, 121, 23);
		
		text_3 = new Text(this, SWT.BORDER);
		text_3.setBounds(78, 120, 191, 21);
		
		text_4 = new Text(this, SWT.BORDER);
		text_4.setBounds(78, 93, 112, 21);
		
		text_5 = new Text(this, SWT.BORDER);
		text_5.setBounds(78, 147, 155, 21);
		
		Label label_9 = new Label(this, SWT.NONE);
		label_9.setText("Data de Nascimento");
		label_9.setBounds(196, 96, 112, 15);
		
		text_6 = new Text(this, SWT.BORDER);
		text_6.setBounds(311, 93, 91, 21);
		
		text_7 = new Text(this, SWT.BORDER);
		text_7.setBounds(328, 147, 76, 21);
		
		Label label_10 = new Label(this, SWT.NONE);
		label_10.setText("Cidade");
		label_10.setBounds(17, 177, 55, 15);
		
		text_8 = new Text(this, SWT.BORDER);
		text_8.setBounds(78, 174, 139, 21);
		
		text_9 = new Text(this, SWT.BORDER);
		text_9.setBounds(328, 174, 76, 21);
		
		text_10 = new Text(this, SWT.BORDER);
		text_10.setBounds(78, 201, 129, 21);
		
		text_11 = new Text(this, SWT.BORDER);
		text_11.setBounds(78, 228, 129, 21);
		
		Label label_11 = new Label(this, SWT.NONE);
		label_11.setText("Complemento");
		label_11.setBounds(244, 177, 83, 15);
		
		Label label_12 = new Label(this, SWT.NONE);
		label_12.setText("CEP");
		label_12.setBounds(17, 204, 55, 15);
		
		Label label_13 = new Label(this, SWT.NONE);
		label_13.setText("Login");
		label_13.setBounds(17, 231, 55, 15);
		
		text_12 = new Text(this, SWT.BORDER);
		text_12.setBounds(292, 228, 112, 21);
		
		Label label_14 = new Label(this, SWT.NONE);
		label_14.setText("Senha");
		label_14.setBounds(247, 231, 38, 15);
		
		Label label_15 = new Label(this, SWT.NONE);
		label_15.setText("Estado");
		label_15.setBounds(272, 204, 55, 15);
		
		Combo combo_2 = new Combo(this, SWT.NONE);
		combo_2.setItems(new String[] {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"});
		combo_2.setBounds(328, 201, 76, 23);
		
		Button btnCancelar = new Button(this, SWT.NONE);
		btnCancelar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
			}
		});
		btnCancelar.setText("Cancelar");
		btnCancelar.setBounds(311, 255, 75, 25);
		
		Button btnSalvar = new Button(this, SWT.NONE);
		btnSalvar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean valid = false;
				String CPF = text_1.getText();
				String user = text_11.getText();
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
		btnSalvar.setText("Salvar");
		btnSalvar.setBounds(230, 255, 75, 25);
		
		Label lblSalarioInicial = new Label(this, SWT.NONE);
		lblSalarioInicial.setBounds(17, 258, 61, 15);
		lblSalarioInicial.setText("Salario: R$");
		
		text_13 = new Text(this, SWT.BORDER);
		text_13.setBounds(81, 255, 126, 21);
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Alterar Funcion\u00E1rio");
		setSize(451, 323);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
