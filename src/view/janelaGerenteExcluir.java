package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.List;
//import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class janelaGerenteExcluir extends Shell {
	private Text txtLogin;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			janelaGerenteExcluir shell = new janelaGerenteExcluir(display);
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
	public janelaGerenteExcluir(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Button btnCancelar = new Button(this, SWT.NONE);
		btnCancelar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(124, 56, 75, 25);
		btnCancelar.setText("Cancelar");
		
		Button btnExcluir = new Button(this, SWT.NONE);
		btnExcluir.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean valid = false;
				String user = txtLogin.getText();
				valid = menu.checarUser(user);	//validar se login existe
				setVisible(false);
				if (valid){	//se retornar true é porque achou login
					//* BD * excluir dados no banco
					operacaoSucesso oS = new operacaoSucesso(display);
					oS.setVisible(true);
				}else {
					operacaoFalha oF = new operacaoFalha(display);
					oF.setVisible(true);
				}
			}
		});
		btnExcluir.setBounds(27, 56, 75, 25);
		btnExcluir.setText("Excluir");
		
		Label lblLogin = new Label(this, SWT.NONE);
		lblLogin.setBounds(10, 13, 55, 15);
		lblLogin.setText("Login");
		
		txtLogin = new Text(this, SWT.BORDER);
		txtLogin.setBounds(65, 10, 155, 21);
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Excluir Usu\u00E1rio");
		setSize(242, 139);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
