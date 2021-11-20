package mvc;

import java.awt.event.*;
public class Controller {
	
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
		
		listener();
	}
	
	private void listener() {
		for(int i = 0; i < view.numberBtns.length; i++) {
			view.numberBtns[i].addActionListener(e->{
				if(model.operator.equals("")) model.input1 += e.getActionCommand();
				else{model.input2 += e.getActionCommand();}
				view.updateNumber(e.getActionCommand());
			});
		}
		
		for(int i = 0; i < view.opBtns.length; i++) {
			view.opBtns[i].addActionListener(e->{
				if(model.operator.equals("")) {
					model.operator = e.getActionCommand();
					view.updateOperator(e.getActionCommand());
					if(model.operator.equals("NOT")) {
						String result = model.getValue();
						view.updateResult(result);
						model.resetValue();
					}
				}
				if(e.getActionCommand().equals("=")) {
					String result = model.getValue();
					view.updateResult(result);
					model.resetValue();
				}
			});
		}
	}

}
