package mvc;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import factory.Mode;
import factory.ModeFactory;
import factory.ModeType;
import singleton.InputView;
import singleton.ResultView;

public class View extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private Mode md;
	private ModeType modeType;
	private JTextField modeTF;
	private InputView inputView;
	private ResultView resultView;
	public JButton clearBtn;
	public JButton deleteBtn;
	public JButton equalBtn;
	public JButton[] opBtns;
	public JButton[] numberBtns;	
	
	public View(ModeType modeType) {
		
		this.modeType = modeType;
		inputView = InputView.getInstance();
		resultView = ResultView.getInstance();
		md = ModeFactory.createInstance(modeType);
		
		clearBtn = md.createClearBtn();
		deleteBtn = md.createDeleteBtn();
		equalBtn = md.createEqualBtn();
		opBtns = md.createInputOpBtn();
		numberBtns = md.createInputNumberBtn();
		
		
		
		setTitle("Jalculator");
		setLayout(new BorderLayout());
		setSize(new Dimension(400,495));
//		getRootPane().setBorder(BorderFactory.createEtchedBorder(Color.LIGHT_GRAY, Color.LIGHT_GRAY));
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		build();
	}
	
	private void build() {
		View.this.add(buildConfigurePanel(), BorderLayout.PAGE_START);
		View.this.add(buildView(), BorderLayout.CENTER);
//		View.this.add(buildInputPanel(), BorderLayout.PAGE_END);

	}
	
	private JPanel buildConfigurePanel() {
		JPanel configurePanel  = new JPanel();
		modeTF = new JTextField();
		modeTF.setEditable(false);
		modeTF.setBorder(BorderFactory.createEmptyBorder(5,5,0,0));
		modeTF.setText(modeType.name());
		configurePanel.setLayout(new GridLayout(1,2));
		configurePanel.add(modeTF);
		return configurePanel;
	
	}
	
	private JPanel buildView() {
		
		JPanel view  = new JPanel();
		view.setLayout(new BoxLayout(view, BoxLayout.Y_AXIS));
		view.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		inputView.setPreferredSize(new Dimension(400,150));
		inputView.setSize(new Dimension(400,80));
		view.add(inputView);
		view.add(resultView);
		view.add(buildInputPanel());
		
		return view;
	}
	
	private JPanel buildInputPanel() {
		
		JPanel inputPanel  = new JPanel();
		inputPanel.setPreferredSize(new Dimension(400,200));
		inputPanel.setLayout(new GridLayout(1,2));
		inputPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
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
		inputOpPanel.setLayout(new GridLayout(5,2));
		inputOpPanel.add(clearBtn);
		inputOpPanel.add(deleteBtn);
		for(int i = 0; i < opBtns.length; i ++) {
			inputOpPanel.add(opBtns[i]);
		}
		inputOpPanel.add(equalBtn);
		return inputOpPanel;
	}
	
	public void updateResult(String result) {
		resultView.setText(result);
	}
	
	public void clear() {
		inputView.setText("");
		resultView.setText("");
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
