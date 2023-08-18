package member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	//컨트롤ㄹ러는 인터페이스 왜?
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
