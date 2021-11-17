package singleton;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;

public class DisplayView extends JTextArea{
	
	private static DisplayView displayView;
	
	//寇何 按眉 积己 陛瘤
	private DisplayView() {
	}
	
	public static DisplayView getInstance() {
		if(displayView == null) {
			displayView = new DisplayView();
			displayView.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
			displayView.setFont(displayView.getFont().deriveFont(20f));
			displayView.setSize(new Dimension(200,100));
			displayView.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
		return displayView; 
	}
}
