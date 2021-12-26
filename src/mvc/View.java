package mvc;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import factory.Mode;
import factory.ModeFactory;
import factory.ModeType;
import singleton.InputView;
import singleton.ResultView;
import template.BrightTheme;
import template.DarkTheme;

public class View extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private Mode md;
	private ModeType modeType;
	private JTextField modeTF;
	public JTextArea inputView1;
	public JTextArea inputView2;
	public JTextArea operatorView;
	private ResultView resultView;
	private JButton settingsBtn;
	
	private DarkTheme darkTheme;
	private BrightTheme brightTheme;
	
	public JButton clearBtn;
	public JButton deleteBtn;
	public JButton equalBtn;
	public JButton[] opBtns;
	public JButton[] numberBtns;	
	
	public View(ModeType modeType) {
		
		this.modeType = modeType;
//		inputView = InputView.getInstance();
		resultView = ResultView.getInstance();
		
		
		md = ModeFactory.createInstance(modeType);
		
		clearBtn = md.createClearBtn();
		deleteBtn = md.createDeleteBtn();
		equalBtn = md.createEqualBtn();
		opBtns = md.createInputOpBtn();
		numberBtns = md.createInputNumberBtn();
		
		setTitle("Jalculator");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage("image\\calculator.png");
		setIconImage(img);
		setLayout(new BorderLayout());
		setSize(new Dimension(400,500));
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
		
		brightTheme = new BrightTheme();
		darkTheme = new DarkTheme();
		
		settingsBtn = new JButton("Dark");
		settingsBtn.setBorder(BorderFactory.createEmptyBorder(0,0,0,5));
		settingsBtn.addActionListener(e->{
			if(settingsBtn.getText() == "Bright") {
				brightTheme.change(inputView1, inputView2, operatorView, resultView, numberBtns ,clearBtn, deleteBtn);
				settingsBtn.setText("Dark");
			}
			else if (settingsBtn.getText() == "Dark") {
				darkTheme.change(inputView1, inputView2, operatorView, resultView, numberBtns ,clearBtn, deleteBtn);
				settingsBtn.setText("Bright");
			}
		});
		
		modeTF = new JTextField();
		modeTF.setEditable(false);
		modeTF.setBorder(BorderFactory.createEmptyBorder(5,5,0,0));
		modeTF.setText(modeType.name());
		configurePanel.setLayout(md.createGridLayout());
		configurePanel.add(modeTF);
		configurePanel.add(settingsBtn);
		return configurePanel;
	
	}
	
	private JPanel buildView() {
		
		JPanel view  = new JPanel();
		view.setLayout(new BoxLayout(view, BoxLayout.Y_AXIS));
		view.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		view.add(buildDisplayView());
		view.add(buildInputPanel());
		
		
		return view;
	}
	
	private JPanel buildDisplayView() {
		JPanel displayView = new JPanel();
		displayView.setLayout(new GridLayout(4,1));
		
		inputView1 = new JTextArea();
		inputView1.setEditable(false);
		inputView1.setFocusable(false);
		inputView1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		inputView1.setFont(inputView1.getFont().deriveFont(30f));
		inputView1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		inputView2 = new JTextArea();
		inputView2.setEditable(false);
		inputView2.setFocusable(false);
		inputView2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		inputView2.setFont(inputView1.getFont().deriveFont(30f));
		inputView2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		operatorView = new JTextArea();
		operatorView.setEditable(false);
		operatorView.setFocusable(false);
		operatorView.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		operatorView.setFont(inputView1.getFont().deriveFont(30f));
		operatorView.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		displayView.add(inputView1);
		displayView.add(operatorView);
		displayView.add(inputView2);
		displayView.add(resultView);
		
		return displayView;
	}
	
	private JPanel buildInputPanel() {
		
		JPanel inputPanel  = new JPanel();
		inputPanel.setPreferredSize(new Dimension(400,200));
		inputPanel.setLayout(new GridLayout(1,2));
		inputPanel.setBorder(BorderFactory.createEmptyBorder(5,0,0,0));
		inputPanel.add(buildNumberPanel());
		inputPanel.add(buildOperationPanel());
		
		return inputPanel;
	
	}
	
	private JPanel buildNumberPanel() {
		JPanel inputNumberPanel  = new JPanel();
		inputNumberPanel.setLayout(new GridLayout(2,1));
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
	
	public JButton getButton(char key){
		switch(key) {
			case 'c' : return clearBtn;
			case '\u0008' : return deleteBtn;
			case '+' : return opBtns[0];
			case '*' : return opBtns[1];
			case '!' : return opBtns[2];
			case '\n' : return equalBtn;
			case '0' : return numberBtns[0];
			case '1' : return numberBtns[1];
		}
		return new JButton();
	}
	
	public void updateResult(String result) {
		resultView.setText(result);
	}
	
	public void clear() {
		inputView1.setText("");
		inputView2.setText("");
		operatorView.setText("");
		resultView.setText("");
	}
	
	public void updateDelete(String str) {

		String update = str;
		inputView1.setText(update);
	}
	
	public void update(JTextArea inputView, String str) {
		String origin = inputView.getText();
		String update = origin + str;
		inputView.setText(update);
	}
	
	public void updateDelete(JTextArea inputView, String str) {
		String update = str;
		inputView.setText(update);
	}
}
