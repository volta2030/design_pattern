package factory;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ProgrammingMode extends Mode {

	@Override
	public JButton[] createInputOpBtn() {
		String[] buttonLabels = {"OR", "AND", "NOT", "NOR", "NAND", "XOR", "XNOR"};
		opBtns = new JButton[buttonLabels.length];
		for (int i= 0; i < opBtns.length; i++) {
			opBtns[i] = new JButton();
			opBtns[i] .setFont(opBtns[i] .getFont().deriveFont(20f));
			opBtns[i].setText(buttonLabels[i]);
			opBtns[i].setBorder(BorderFactory.createEtchedBorder());
			opBtns[i].setBackground(new Color(47, 102, 169));
			opBtns[i].setForeground(Color.WHITE);
		}
		return opBtns;
	}
	
	@Override
	public JButton[] createInputNumberBtn() {
		
		String[] buttonLabels = {"0", "1"};
		numberBtns = new JButton[buttonLabels.length];
		for (int i= 0; i < numberBtns.length; i++) {
			numberBtns[i] = new JButton();
			numberBtns[i] .setFont(numberBtns[i] .getFont().deriveFont(20f));
			numberBtns[i].setText(buttonLabels[i]);
			numberBtns[i].setBorder(BorderFactory.createEtchedBorder());
		}
		return numberBtns;
	}
	
	@Override
	public GridLayout createGridLayout() {
		return new GridLayout(1,2);
	}
}
