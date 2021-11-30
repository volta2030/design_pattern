package mvc;

import java.awt.event.*;
import command.*;

public class Controller {
	
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
		
		this.addButtonListener();
	}
	
	private void addButtonListener() {
		
		Receiver.createInstance(model, view);
		
		ClearCommand clearCmd = new ClearCommand(view.clearBtn);
		DeleteCommand deleteCmd = new DeleteCommand(view.deleteBtn);		
		ResultCommand resultCmd = new ResultCommand(view.equalBtn);
		NumberCommand numberCmd = new NumberCommand(view.numberBtns);
		OperatorCommand operationCmd = new OperatorCommand(view.opBtns);
		
		addCmdQueue(clearCmd, deleteCmd, resultCmd, numberCmd, operationCmd);
		
	}
	
	private void addCmdQueue(Command... commands) {
		for(Command command : commands) {
			command.excute();
		}
	}

}
