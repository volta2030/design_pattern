package command;

import javax.swing.JButton;

import mvc.*;

public class ClearCommand implements Command{

	private JButton button;
	
	public ClearCommand(JButton button) {
		this.button = button;
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		Receiver.clear(button);
	}

}
