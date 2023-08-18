package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class HandlerMapping {
	
	private static HandlerMapping handler = new HandlerMapping();
    
 
    private HandlerMapping() {
        
    }
    public static HandlerMapping getInstance() {
		return handler;
	}


	public Controller createController(String command) {
		Controller controller = null;
		
		if(command.equals("itemList.do")) {
			controller = new ItemListController();
			System.out.println("controller :: ");
		} else if(command.equals("itemView.do")) {
			controller = new ItemViewController();
		}
		return controller;
	}
}