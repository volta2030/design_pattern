package mvc;

import java.awt.event.*;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

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
		
		//Click EventListener
		Receiver.createInstance(model, view);
		
		ClearCommand clearCmd = new ClearCommand(view.clearBtn);
		DeleteCommand deleteCmd = new DeleteCommand(view.deleteBtn);		
		ResultCommand resultCmd = new ResultCommand(view.equalBtn);
		NumberCommand numberCmd = new NumberCommand(view.numberBtns);
		OperatorCommand operatorCmd = new OperatorCommand(view.opBtns);
		
		addCmdQueue(clearCmd, deleteCmd, resultCmd, numberCmd, operatorCmd);    
		
	    // HERE ARE THE KEY BINDINGS
		JRootPane rootPane = this.view.getRootPane();
		rootPane.setFocusable(true);
		char[] keys = {'0', '1', 'c', '\u0008', '+', '*', '!', '\n'};
		for(char key : keys) {
		    rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(key), key);
		    rootPane.getActionMap().put(key, new AbstractAction(){
		        @Override
		        public void actionPerformed(ActionEvent e){
		            view.getButton(key).doClick(10);
		        }
		    });			
		}
		
//	    rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke('\u0008'), '\u0008');
//	    rootPane.getActionMap().put('\u0008', new AbstractAction(){
//	        @Override
//	        public void actionPerformed(ActionEvent e){
//	            Receiver.delete();
//	        }
//	    });	
//	    
	}
	
	private void addCmdQueue(Command... commands) {
		for(Command command : commands) {
			command.excute();
		}
	}

}

