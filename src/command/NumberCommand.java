package command;

import javax.swing.JButton;

public class NumberCommand implements Command {
	
	private JButton[] buttons;
	
	public NumberCommand(JButton[] buttons) {
		this.buttons = buttons;
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		for(JButton button : buttons) {
			button.addActionListener(e->{
				 Receiver.processNumber(e);
				 button.setFocusable(false);
			});
		}
	}
}
