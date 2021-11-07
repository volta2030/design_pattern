package factory;

import javax.swing.JButton;

public class EngineeringMode extends Mode {
	
	@Override
	public JButton[] createInputBtn() {
		btns = new JButton[3];
		btns[0] = new JButton();
		btns[0].setText("sin");
		
		btns[1] = new JButton();
		btns[1].setText("cos");
		
		btns[2] = new JButton();
		btns[2].setText("tan");
		
		return btns;
		
	}
	
}
