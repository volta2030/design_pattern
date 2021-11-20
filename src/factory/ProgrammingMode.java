package factory;

import javax.swing.JButton;

public class ProgrammingMode extends Mode {

	@Override
	public JButton[] createInputOpBtn() {
		opBtns = new JButton[5];
		
		opBtns[0] = new JButton();
		opBtns[0].setText("C");
		
		opBtns[1] = new JButton();
		opBtns[1].setText("OR");
		
		opBtns[2] = new JButton();
		opBtns[2].setText("AND");
		
		opBtns[3] = new JButton();
		opBtns[3].setText("NOT");
		
		opBtns[4] = new JButton();
		opBtns[4].setText("=");
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
