package template;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class DarkTheme extends Theme {

	@Override
	protected void changeViewColor(JTextArea ...views){
		for(JTextArea view : views) {
			view.setBackground(Color.BLACK);
			view.setForeground(Color.WHITE);
		}
	};
	
	@Override
	protected void changeButtonColor(JButton ...buttons) {
		for(JButton button : buttons) {
			button.setBackground(Color.BLACK);
			button.setForeground(Color.WHITE);
			button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		}
	};
	
}
