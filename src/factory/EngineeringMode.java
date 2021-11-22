package factory;

import javax.swing.JButton;

public class EngineeringMode extends Mode {
	
	@Override
	public JButton[] createInputOpBtn() {
		String[] buttonLabels = {"C", "sin", "cos", "tan", "="};
		opBtns = new JButton[buttonLabels.length];
		for (int i= 0; i < opBtns.length; i++) {
			opBtns[i] = new JButton();
			opBtns[i] .setFont(opBtns[i] .getFont().deriveFont(20f));
			opBtns[i].setText(buttonLabels[i]);
		}
		return opBtns;
	}
	
	@Override
	public JButton[] createInputNumberBtn() {
		String[] buttonLabels = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		numberBtns = new JButton[buttonLabels.length];
		for (int i= 0; i < numberBtns.length; i++) {
			numberBtns[i] = new JButton();
			numberBtns[i] .setFont(numberBtns[i] .getFont().deriveFont(20f));
			numberBtns[i].setText(buttonLabels[i]);
		}
		return numberBtns;
	}
	
}
