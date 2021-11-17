package factory;

import javax.swing.JButton;

public class EngineeringMode extends Mode {
	
	@Override
	public JButton[] createInputOpBtn() {
		opBtns = new JButton[4];
		opBtns[0] = new JButton();
		opBtns[0].setText("sin");
		
		opBtns[1] = new JButton();
		opBtns[1].setText("cos");
		
		opBtns[2] = new JButton();
		opBtns[2].setText("tan");
		
		opBtns[3] = new JButton();
		opBtns[3].setText("=");
		return opBtns;
		
	}
	
	@Override
	public JButton[] createInputNumberBtn() {

		return numberBtns;
	}
	
}
