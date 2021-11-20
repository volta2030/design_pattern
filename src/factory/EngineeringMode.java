package factory;

import javax.swing.JButton;

public class EngineeringMode extends Mode {
	
	@Override
	public JButton[] createInputOpBtn() {
		opBtns = new JButton[5];
		
		opBtns[0] = new JButton();
		opBtns[0].setText("C");
		
		opBtns[1] = new JButton();
		opBtns[1].setText("sin");
		
		opBtns[2] = new JButton();
		opBtns[2].setText("cos");
		
		opBtns[3] = new JButton();
		opBtns[3].setText("tan");
		
		opBtns[4] = new JButton();
		opBtns[4].setText("=");
		return opBtns;
		
	}
	
	@Override
	public JButton[] createInputNumberBtn() {

		return numberBtns;
	}
	
}
