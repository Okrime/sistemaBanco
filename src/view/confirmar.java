package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class confirmar extends Shell {
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			confirmar shell = new confirmar(display);
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
	public confirmar(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Label lblConfirmarOperao = new Label(this, SWT.NONE);
		lblConfirmarOperao.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lblConfirmarOperao.setBounds(25, 10, 129, 23);
		lblConfirmarOperao.setText("Confirmar opera\u00E7\u00E3o");
		
		Label lblDigiteASenha = new Label(this, SWT.NONE);
		lblDigiteASenha.setBounds(17, 53, 137, 15);
		lblDigiteASenha.setText("Digite a senha novamente");
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(25, 85, 122, 21);
		
		Button btnConfirmar = new Button(this, SWT.NONE);
		btnConfirmar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String passwordInput = null;
				boolean valid = false;
				passwordInput = text.getText();
				valid = checarSenha(passwordInput);
				setVisible(false);
				if (valid == true){
					operacaoSucesso oS = new operacaoSucesso(display);
					oS.setVisible(true);
				}else {
					operacaoFalha oF = new operacaoFalha(display);
					oF.setVisible(true);
				}
			}
		});
		btnConfirmar.setBounds(10, 123, 75, 25);
		btnConfirmar.setText("Confirmar");
		
		Button btnVoltar = new Button(this, SWT.NONE);
		btnVoltar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBounds(91, 123, 75, 25);
		btnVoltar.setText("Voltar");
		createContents();
	}
	
	public static boolean checarSenha(String password) {
		boolean valid = false;
		String bdPassword = "password";	//*BD*
		
		if(bdPassword.equals(password)){
            valid = true;
        }
		else{
			valid = false;
		}
		System.out.println(valid);
		return valid;
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Confirmar Operação");
		setSize(190, 200);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
