package core;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import factory.Mode;
import factory.ModeFactory;
import factory.ModeType;
import singleton.DisplayView;

public class UI extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private Mode md;
	private DisplayView displayView;
	private JButton[] btns;
	
	
	public UI(ModeType modeType) {
		
		displayView = DisplayView.getInstance();
		md = ModeFactory.createInstance(modeType);
		btns = md.createInputBtn();

		setTitle("Calculator using Design Pattern");
		setLayout(new GridLayout(2,1));
		setSize(new Dimension(300,400));
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		build();
	}
	
	private void build() {
		
		UI.this.add(displayView);	
		UI.this.add(buildInputPanel());

	}
	
	private JPanel buildInputPanel() {
		
		JPanel inputPanel  = new JPanel();
		
		for(int i = 0; i < btns.length; i ++) {
			inputPanel.add(btns[i]);
		}
		
		return inputPanel;
	
	}
}
