package factory;

import javax.swing.JButton;

public abstract class Mode {
	
	protected JButton[] opBtns;
	protected JButton[] numberBtns;
	
	protected JButton clearBtn;
	protected JButton deleteBtn;
	protected JButton equalBtn;
	
	public abstract JButton[] createInputOpBtn();
	
	public abstract JButton[] createInputNumberBtn();
	
	public JButton createClearBtn() {
		clearBtn = new JButton();
		clearBtn .setFont(clearBtn .getFont().deriveFont(20f));
		clearBtn.setText("C");
		return clearBtn;
	}
	
	public JButton createDeleteBtn() {
		deleteBtn= new JButton();
		deleteBtn .setFont(deleteBtn .getFont().deriveFont(20f));
		deleteBtn.setText("del");
		return deleteBtn;
	}

	public JButton createEqualBtn() {
		equalBtn= new JButton();
		equalBtn .setFont(equalBtn .getFont().deriveFont(20f));
		equalBtn.setText("=");
		return equalBtn;
	}

}
