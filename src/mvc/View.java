package mvc;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import factory.Mode;
import factory.ModeFactory;
import factory.ModeType;
import singleton.InputView;
import singleton.ResultView;

public class View extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private Mode md;
	private InputView inputView;
	private ResultView resultView;
	public JButton[] opBtns;
	public JButton[] numberBtns;	
	
	public View(ModeType modeType) {
		
		inputView = InputView.getInstance();
		resultView = ResultView.getInstance();
		
		md = ModeFactory.createInstance(modeType);
		opBtns = md.createInputOpBtn();
		numberBtns = md.createInputNumberBtn();

		setTitle("Calculator using Design Pattern");
		setLayout(new GridLayout(3,1));
		setSize(new Dimension(400,500));
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		build();
	}
	
	private void build() {
		
		View.this.add(inputView);
		View.this.add(resultView);
		View.this.add(buildInputPanel());

	}
	
	private JPanel buildInputPanel() {
		
		JPanel inputPanel  = new JPanel();
		inputPanel.setLayout(new GridLayout(1,2));
		inputPanel.add(buildNumberPanel());
		inputPanel.add(buildOperationPanel());
		
		return inputPanel;
	
	}
	
	private JPanel buildNumberPanel() {
		JPanel inputNumberPanel  = new JPanel();
		for(int i = 0; i < numberBtns.length; i ++) {
			inputNumberPanel.add(numberBtns[i]);
		}
		return inputNumberPanel;
	}
	
	private JPanel buildOperationPanel() {
		JPanel inputOpPanel  = new JPanel();
		inputOpPanel.setLayout(new GridLayout(opBtns.length,1));
		for(int i = 0; i < opBtns.length; i ++) {
			inputOpPanel.add(opBtns[i]);
		}
		return inputOpPanel;
	}
	
	public void updateResult(String result) {
		resultView.setText(result);
	}
	
	public void updateNumber(String str) {
		String origin = inputView.getText();
		String update = origin + str;
		inputView.setText(update);
	}
	
	public void updateOperator(String str) {
		String origin = inputView.getText();
		String update = origin + "\n" + str + "\n";
		inputView.setText(update);
	}
}
