package mvc;

import factory.ModeType;

public class Launcher {
	
	public static void main(String[] args) {
		
		//MVC Pattern
		Model model = new Model();
		View view = new View(ModeType.PROGRAMMING);
		Controller controller = new Controller(view, model);
		
		view.setVisible(true);
	}

}
