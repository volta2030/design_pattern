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
			resultView.setPreferredSize(new Dimension(100,50));
			resultView.setEditable(false);
			resultView.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		}
		return resultView; 
	}
}
