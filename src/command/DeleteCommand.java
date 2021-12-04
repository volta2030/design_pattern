package command;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
		
		button.addActionListener(e->{
		Receiver.delete();
		 button.setFocusable(false);
		});
	}

}

