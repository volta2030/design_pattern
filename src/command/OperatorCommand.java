package command;

import javax.swing.JButton;

public class OperatorCommand implements Command {
	
	private JButton[] buttons;
	
	public OperatorCommand(JButton[] buttons) {
		this.buttons = buttons;
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		for(JButton btn : buttons) {
			Receiver.processOperator(btn);
		}
	}
}
