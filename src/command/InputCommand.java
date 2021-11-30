package command;

import javax.swing.JButton;

public class InputCommand implements Command {
	
	private JButton[] buttons;
	
	public InputCommand(JButton[] buttons) {
		this.buttons = buttons;
	}
	
	@Override
	public void excute(Receiver rev) {
		// TODO Auto-generated method stub
		for(JButton btn : buttons) {
			rev.processInput(btn);
		}
	}
}
