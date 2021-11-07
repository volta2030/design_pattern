package factory;

import javax.swing.JButton;

public class GeneralMode extends Mode{
	
	@Override
	public JButton[] createInputBtn() {
		btns = new JButton[4];
		btns[0] = new JButton();
		btns[0].setText("+");
		
		btns[1] = new JButton();
		btns[1].setText("-");
		
		btns[2] = new JButton();
		btns[2].setText("*");
		
		btns[3] = new JButton();
		btns[3].setText("/");
		
		return btns;
	}
	
}
