package factory;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
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
		clearBtn.setBorder(BorderFactory.createEtchedBorder());
		return clearBtn;
	}
	
	public JButton createDeleteBtn() {
		deleteBtn= new JButton();
		deleteBtn .setFont(deleteBtn .getFont().deriveFont(20f));
		deleteBtn.setText("ก็");
		deleteBtn.setBorder(BorderFactory.createEtchedBorder());
		return deleteBtn;
	}

	public JButton createEqualBtn() {
		equalBtn= new JButton();
		equalBtn .setFont(equalBtn .getFont().deriveFont(20f));
		equalBtn.setText("=");
		equalBtn.setBackground(new Color(246,50,114));
		equalBtn.setBorder(BorderFactory.createEtchedBorder());
		return equalBtn;
	}
	
	public GridLayout createGridLayout() {
		return new GridLayout(1,2);
	}

}
