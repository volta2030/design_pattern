package factory;

import javax.swing.JButton;

public class ProgrammingMode extends Mode {

	@Override
	public JButton[] createInputOpBtn() {
		opBtns = new JButton[3];
		opBtns[0] = new JButton();
		opBtns[0].setText("OR");
		
		opBtns[1] = new JButton();
		opBtns[1].setText("AND");
		
		opBtns[2] = new JButton();
		opBtns[2].setText("=");
		return opBtns;
	}
	
	@Override
	public JButton[] createInputNumberBtn() {
		numberBtns = new JButton[2];
		numberBtns[0] = new JButton();
		numberBtns[0].setText("0");
		
		numberBtns[1] = new JButton();
		numberBtns[1].setText("1");
		return numberBtns;
	}
}
