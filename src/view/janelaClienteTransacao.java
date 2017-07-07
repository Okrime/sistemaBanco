package view;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class janelaClienteTransacao extends Shell {
	private Text text;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			janelaClienteTransacao shell = new janelaClienteTransacao(display);
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
	public janelaClienteTransacao(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Label label = new Label(this, SWT.NONE);
		label.setText("Conta");
		label.setBounds(49, 13, 41, 15);
		
		Label label_1 = new Label(this, SWT.NONE);
		label_1.setText("Agencia");
		label_1.setBounds(49, 52, 43, 15);
		
		Label label_2 = new Label(this, SWT.NONE);
		label_2.setText("Valor");
		label_2.setBounds(49, 96, 41, 15);
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(103, 10, 138, 21);
		
		text_1 = new Text(this, SWT.BORDER);
		text_1.setBounds(103, 49, 140, 21);
		
		text_2 = new Text(this, SWT.BORDER);
		text_2.setBounds(101, 93, 140, 21);
		
		Label label_3 = new Label(this, SWT.NONE);
		label_3.setText("Tipo de Conta");
		label_3.setBounds(21, 139, 85, 15);
		
		Button button = new Button(this, SWT.RADIO);
		button.setText("Corrente");
		button.setBounds(120, 138, 67, 16);
		
		Button button_1 = new Button(this, SWT.RADIO);
		button_1.setText("Poupanca");
		button_1.setBounds(200, 138, 74, 16);
		
		Button button_2 = new Button(this, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
			}
		});
		button_2.setText("Cancelar");
		button_2.setBounds(211, 210, 75, 25);
		
		Button button_3 = new Button(this, SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean valid = false;
				float saldo = 9.99f;	//* BD * puxar valor do saldo do banco
				float valor;
				String agencia = text_1.getText();
				String conta = text.getText();
				String aux;
				aux = text_2.getText();
				valor = Float.parseFloat(aux);
				System.out.println(valor);
				//agencia = getAgencia(id);
				valid = menu.checarAgencia(agencia);	//checar agencia
				if (valid){
					valid = menu.checarConta(conta);	//checar conta
					if (valid)
						valid = menu.checarValor(saldo, valor);	//validar saldo
				}
				setVisible(false);
				if (valid){
					//saldo = saldo - valor;	//* BD * atualizar valor do saldo do transferidor
					//saldoAlvo = saldoAlvo + valor;	//* BD * atualizar valor do saldo da conta do transferido
					operacaoSucesso oS = new operacaoSucesso(display);
					oS.setVisible(true);
				}else {
					operacaoFalha oF = new operacaoFalha(display);
					oF.setVisible(true);
				}
			}
		});
		button_3.setText("Confirmar");
		button_3.setBounds(130, 210, 75, 25);
		
		Label lblSaldoDisponivel = new Label(this, SWT.NONE);
		lblSaldoDisponivel.setBounds(10, 177, 114, 15);
		lblSaldoDisponivel.setText("Saldo Disponivel\tR$");
		
		Label label_value = new Label(this, SWT.NONE);
		label_value.setBounds(130, 177, 41, 15);
		label_value.setText(String.valueOf(10));	//*BD*
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Transação");
		setSize(310, 278);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
