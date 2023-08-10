package pattern.controller;

import pattern.controller.component.FindController;

public class ControllerFactory {
	
	// 싱글톤 패턴
	private static ControllerFactory factory = new ControllerFactory();
	private ControllerFactory() {
		
		
	}
	public static ControllerFactory getInstance() {
		return factory;
	}
	
	//createController
	public Controller createController(String command) {
		Controller controller = null;
	
	
		
		if(command.equals("findModel")) {
			controller = new FindController();
		}
		
		return controller;
	}
}
