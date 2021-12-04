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
			resultView.setEditable(false);
			resultView.setToolTipText("Result Display");
			resultView.setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createLineBorder(new Color(47, 102, 169)),
					BorderFactory.createEmptyBorder(5,5,5,5)));
		}
		return resultView; 
	}
}
