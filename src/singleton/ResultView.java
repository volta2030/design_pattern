package singleton;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;

public class ResultView extends JTextArea {
	private static ResultView resultView ;
	
	//寇何 按眉 积己 陛瘤
	private ResultView() {
	}
	
	public static ResultView getInstance() {
		if(resultView == null) {
			resultView = new ResultView();
			resultView.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
			resultView.setFont(resultView.getFont().deriveFont(30f));
			resultView.setSize(new Dimension(100,100));
			resultView.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
		return resultView; 
	}
}
