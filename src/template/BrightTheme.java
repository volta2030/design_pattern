package template;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class BrightTheme extends Theme {

	@Override
	protected void changeViewColor(JTextArea ...views){
		for(JTextArea view : views) {
			view.setBackground(Color.WHITE);
			view.setForeground(Color.BLACK);
		}
	};
	
	@Override
	protected void changeButtonColor(JButton ...buttons) {
		for(JButton button : buttons) {
			button.setBackground(Color.WHITE);
			button.setForeground(Color.BLACK);
			button.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		}
	};
}
