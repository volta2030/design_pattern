package factory;

import javax.swing.JButton;

public abstract class Mode {
	
	protected JButton[] btns;
	
	public abstract JButton[] createInputBtn();

}
