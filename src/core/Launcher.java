package core;

import facade.DisplayFacade;
import factory.ModeType;

public class Launcher {
	
	public static void main(String[] args) {
		
		DisplayFacade df = new DisplayFacade();
		
		UI ui = new UI(ModeType.PROGRAMMING);
		
		ui.setVisible(true);
		int result = 85;

//		DisplayFacade df = new DisplayFacade();
//		System.out.println(df.shortVersion.resultFormat() + result);
	}

}
