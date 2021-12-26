package template;

import javax.swing.JButton;
import javax.swing.JTextArea;

import singleton.ResultView;

public abstract class Theme {
	
	public final void change(JTextArea inputView1, JTextArea inputView2, JTextArea operatorView, ResultView resultView, JButton[] numberBtns, JButton clearBtn, JButton deleteBtn) {
		
		JTextArea[] views = {inputView1, inputView2, operatorView, resultView};
		
		JButton[] buttons = new JButton[numberBtns.length + 2];
		JButton[] temp = {clearBtn, deleteBtn};
		
		System.arraycopy(temp, 0, buttons, 0, 2);
		System.arraycopy(numberBtns, 0, buttons, 2, numberBtns.length);
		
		changeViewColor(views);
		changeButtonColor(buttons);
	}
	
	protected abstract void changeButtonColor(JButton[] buttons);
	protected abstract void changeViewColor(JTextArea[] view);
}
