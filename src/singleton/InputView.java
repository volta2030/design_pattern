package singleton;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;

public class InputView extends JTextArea{
	
	private static InputView inputView;
	
	//寇何 按眉 积己 陛瘤
	private InputView() {
	}
	
	public static InputView getInstance() {
		if(inputView == null) {
			inputView = new InputView();
			inputView.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
			inputView.setFont(inputView.getFont().deriveFont(30f));
			inputView.setPreferredSize(new Dimension(200,200));
			inputView.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
		return inputView; 
	}
}