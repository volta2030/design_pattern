package singleton;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class DisplayView extends JPanel{
	
	private static DisplayView displayView;
	
	//외부 객체 생성 금지
	private DisplayView() {
	}
	
	public static DisplayView getInstance() {
		if(displayView == null) {
			displayView = new DisplayView();
			displayView.setSize(new Dimension(200,200));
			displayView.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
		return displayView; 
	}
}
