package command;

import javax.swing.JButton;

import mvc.*;

public class Receiver {
	
	private final Model model;
	private final View view;
	
	public Receiver(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void delete(JButton button) {
		button.addActionListener(e->{
			if(model.operator.equals("")) model.undoInput1(); 
			else { model.undoInput2(); }
		});
	}
	
	public void clear(JButton button) {
		button.addActionListener(e->{
			model.resetValue();
			view.clear();
		});
	}
	
	public void getResult(JButton button) {
		button.addActionListener(e->{
			String result = model.getValue();
			view.updateResult(result);
			model.resetValue();
		});
	}
	
	public void processNumber(JButton button) {
		button.addActionListener(e->{
			if(model.operator.equals("")) {
				model.input1 += e.getActionCommand();
			} 
			else{model.input2 += e.getActionCommand();}
			view.updateNumber(e.getActionCommand());
		});
	}
	
	public void processInput(JButton button) {
		button.addActionListener(e->{
			if(model.operator.equals("")) {
				model.setOperator(e.getActionCommand());
				view.updateOperator(e.getActionCommand());
	
				if(model.operator.equals("NOT")) {
					String result = model.getValue();
					view.updateResult(result);
					model.resetValue();
				}
			}
							
		});
	}
	
	public void addQueue(Command...commands ) {
		for(Command command : commands) {
			command.excute(this);
		}
	}
}
