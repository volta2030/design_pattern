package command;

import javax.swing.JButton;

public class ClearCommand implements Command{

	private JButton button;
	
	public ClearCommand(JButton button) {
		this.button = button;
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		this.button.addActionListener(e->{
			Receiver.clear();
			}
		);
	}

}
