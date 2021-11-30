package command;

import javax.swing.JButton;

import mvc.*;

public class DeleteCommand implements Command{

	private JButton button;
	
	public DeleteCommand(JButton button) {
		this.button = button;
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		Receiver.delete(button);
	}
	
}