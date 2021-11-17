package factory;

import javax.swing.JButton;

public abstract class Mode {
	
	protected JButton[] opBtns;
	protected JButton[] numberBtns;
	
	public abstract JButton[] createInputOpBtn();
	
	public abstract JButton[] createInputNumberBtn();

}
