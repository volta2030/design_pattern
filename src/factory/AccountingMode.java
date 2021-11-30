package factory;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class AccountingMode extends Mode{
	
	@Override
	public JButton[] createInputOpBtn() {
		
		String[] buttonLabels = {"+", "-", "*", "/"};
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
		String[] buttonLabels = {"1", "2", "3", "4", "5", "6", "7", "8", "9", " " ,"0", "."};
		numberBtns = new JButton[buttonLabels.length];
		for (int i= 0; i < numberBtns.length; i++) {
			numberBtns[i] = new JButton();
			numberBtns[i].setFont(numberBtns[i] .getFont().deriveFont(20f));
			numberBtns[i].setPreferredSize(new Dimension(55,42));
			numberBtns[i].setText(buttonLabels[i]);
		}
		
		numberBtns[9].setEnabled(false);
		numberBtns[9].setBorder(BorderFactory.createEmptyBorder());

		return numberBtns;
	}
	
	@Override
	public GridLayout createGridLayout() {
		return new GridLayout(3,4);
	}
	
}
