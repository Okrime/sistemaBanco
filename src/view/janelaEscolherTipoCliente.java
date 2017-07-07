package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class janelaEscolherTipoCliente extends Shell {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			janelaEscolherTipoCliente shell = new janelaEscolherTipoCliente(display);
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
	public janelaEscolherTipoCliente(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Button btnPessoaFisica = new Button(this, SWT.RADIO);
		btnPessoaFisica.setBounds(10, 36, 90, 16);
		btnPessoaFisica.setText("Pessoa Fisica");
		
		Button btnPessoaJuridica = new Button(this, SWT.RADIO);
		btnPessoaJuridica.setBounds(118, 36, 98, 16);
		btnPessoaJuridica.setText("Pessoa Juridica");
		
		Button btnPrximo = new Button(this, SWT.NONE);
		btnPrximo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (btnPessoaFisica.getSelection()){
					setVisible(false);
					janelaFuncionarioCadClienteFis fccf = new janelaFuncionarioCadClienteFis(display);
					fccf.setVisible(true);
					
				} else if(btnPessoaJuridica.getSelection()){
					setVisible(false);
					janelaFuncionarioCadClienteJur fccj = new janelaFuncionarioCadClienteJur(display);
					fccj.setVisible(true);
				}
			}
		});
		btnPrximo.setBounds(10, 74, 75, 25);
		btnPrximo.setText("Pr\u00F3ximo");
		
		Button btnVoltar = new Button(this, SWT.NONE);
		btnVoltar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBounds(128, 74, 75, 25);
		btnVoltar.setText("Voltar");
		
		Label lblSelecioneOTipo = new Label(this, SWT.NONE);
		lblSelecioneOTipo.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblSelecioneOTipo.setBounds(37, 10, 156, 15);
		lblSelecioneOTipo.setText("Selecione o tipo do cliente:");
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Escolher Tipo Cliente");
		setSize(243, 148);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
