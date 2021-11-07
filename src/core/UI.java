package core;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import factory.Mode;
import factory.ModeFactory;
import factory.ModeType;

public class UI extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private Mode md;
	private JButton[] btns;
	
	public UI(ModeType modeType) {
		md = ModeFactory.createInstance(modeType);
		btns = md.createInputBtn();
		build();
	}
	
	private void build() {

		UI.this.setSize(new Dimension(300,100));
		UI.this.setTitle("Calculator using Design Pattern");
		UI.this.setResizable(false);
		UI.this.setLocationRelativeTo(null);
		UI.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
