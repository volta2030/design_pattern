package factory;

import javax.swing.JButton;

public class ProgrammingMode extends Mode {

	@Override
	public JButton[] createInputBtn() {
		btns = new JButton[2];
		btns[0] = new JButton();
		btns[0].setText("OR");
		
		btns[1] = new JButton();
		btns[1].setText("AND");
		return btns;
	}
	
}
