package command;

import javax.swing.JButton;

public class NumberCommand implements Command {
	
	private JButton[] buttons;
	
	public NumberCommand(JButton[] buttons) {
		this.buttons = buttons;
	}
	
	@Override
	public void excute(Receiver rev) {
		// TODO Auto-generated method stub
		for(JButton btn : buttons) {
			rev.processNumber(btn);
		}
	}
}
