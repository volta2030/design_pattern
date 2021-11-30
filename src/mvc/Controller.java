package mvc;

import java.awt.event.*;
import command.*;

public class Controller {
	
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
		
		listener();
	}
	
	private void listener() {
		
		Receiver receiver = new Receiver(model, view);
		
		ClearCommand clearCmd = new ClearCommand(view.clearBtn);
		DeleteCommand deleteCmd = new DeleteCommand(view.deleteBtn);		
		ResultCommand resultCmd = new ResultCommand(view.equalBtn);
		NumberCommand numberCmd = new NumberCommand(view.numberBtns);
		InputCommand inputCmd = new InputCommand(view.numberBtns);
		
		receiver.addQueue(clearCmd, 
				          deleteCmd, 
				          resultCmd,
				          numberCmd,
				          inputCmd);

	}

}
