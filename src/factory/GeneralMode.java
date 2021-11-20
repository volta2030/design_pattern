package factory;

import javax.swing.JButton;

public class GeneralMode extends Mode{
	
	@Override
	public JButton[] createInputOpBtn() {
		opBtns = new JButton[6];
		
		opBtns[0] = new JButton();
		opBtns[0].setText("C");
		
		opBtns[1] = new JButton();
		opBtns[1].setText("+");
		
		opBtns[2] = new JButton();
		opBtns[2].setText("-");
		
		opBtns[3] = new JButton();
		opBtns[3].setText("*");
		
		opBtns[4] = new JButton();
		opBtns[4].setText("/");
		
		opBtns[5] = new JButton();
		opBtns[5].setText("=");
		
		return opBtns;
	}
	
	@Override
	public JButton[] createInputNumberBtn() {
		numberBtns = new JButton[10];
		for(int i = 0; i < 10; i++) {
			numberBtns[i] = new JButton();
			numberBtns[i].setText(Integer.toString(i));						
		}

		return numberBtns;
	}
	
}
