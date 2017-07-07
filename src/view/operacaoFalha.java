package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class operacaoFalha extends Shell {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			operacaoFalha shell = new operacaoFalha(display);
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
	public operacaoFalha(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Label lblOperaoRealizadaCom = new Label(this, SWT.NONE);
		lblOperaoRealizadaCom.setForeground(SWTResourceManager.getColor(255, 0, 0));
		lblOperaoRealizadaCom.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		lblOperaoRealizadaCom.setBounds(10, 10, 141, 25);
		lblOperaoRealizadaCom.setText("Opera\u00E7\u00E3o falhou!");
		
		Button btnFechar = new Button(this, SWT.NONE);
		btnFechar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(43, 51, 75, 25);
		btnFechar.setText("Fechar");
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Erro!");
		setSize(177, 125);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
