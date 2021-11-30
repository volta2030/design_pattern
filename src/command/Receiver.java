package command;

import javax.swing.JButton;

import mvc.*;

public class Receiver {
	
	private static Model model;
	private static View view;
	
	public static void createInstance(Model m, View v) {
		model = m;
		view = v;
	}
	
	public static void delete(JButton button) {
		button.addActionListener(e->{
			if(model.operator.equals("")) {
				model.undoInput1();
				view.updateDelete(view.inputView1, model.input1);
			}else if(!model.input1.equals("") && 
					 !model.operator.equals("") && 
					  model.input2.equals("")) {
				model.undoOperator();
				view.updateDelete(view.operatorView, model.operator);
			}else {
				model.undoInput2(); 
				view.updateDelete(view.inputView2, model.input2);
			}
		});
	}
	
	public static void clear(JButton button) {
		button.addActionListener(e->{
			model.resetValue();
			view.clear();
		});
	}
	
	public static void getResult(JButton button) {
		button.addActionListener(e->{
			String result = model.getValue();
			view.updateResult(result);
			model.resetValue();
		});
	}
	
	public static void processNumber(JButton button) {
		button.addActionListener(e->{
			if(model.operator.equals("")) {
				model.input1 += e.getActionCommand();
				view.update(view.inputView1, e.getActionCommand());
			} 
			else{
				model.input2 += e.getActionCommand();
				view.update(view.inputView2, e.getActionCommand());
			}
			
		});
	}
	
	public static void processOperator(JButton button) {
		button.addActionListener(e->{
			if(model.operator.equals("")) {
				model.setOperator(e.getActionCommand());
				view.update(view.operatorView ,e.getActionCommand());
	
				if(model.operator.equals("NOT")) {
					String result = model.getValue();
					view.updateResult(result);
					model.resetValue();
				}
			}
							
		});
	}
	
//	public void addQueue(Command...commands ) {
//		for(Command command : commands) {
//			command.excute();
//		}
//	}
}
