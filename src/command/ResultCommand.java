package command;

import javax.swing.JButton;

import mvc.*;

public class ResultCommand implements Command{

	private JButton button;
	
	public ResultCommand(JButton button) {
		this.button = button;
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		button.addActionListener(e->{
		Receiver.getResult();
		});
	}
	
}