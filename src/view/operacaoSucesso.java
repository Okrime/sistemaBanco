package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class operacaoSucesso extends Shell {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			operacaoSucesso shell = new operacaoSucesso(display);
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
	public operacaoSucesso(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Label lblOperaoRealizadaCom = new Label(this, SWT.NONE);
		lblOperaoRealizadaCom.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		lblOperaoRealizadaCom.setForeground(SWTResourceManager.getColor(50, 205, 50));
		lblOperaoRealizadaCom.setBounds(10, 10, 257, 26);
		lblOperaoRealizadaCom.setText("Opera\u00E7\u00E3o realizada com sucesso!");
		
		Button btnVoltar = new Button(this, SWT.NONE);
		btnVoltar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBounds(94, 42, 75, 25);
		btnVoltar.setText("Fechar");
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Sucesso!");
		setSize(288, 116);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
