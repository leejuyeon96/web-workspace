package servlet.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.dao.MemberDAO;
import servlet.model.vo.MemberVO;

public class IdCheckController implements Controller{

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		
		MemberVO vo = MemberDAO.getInstance().findByIdMember(id);
		if(vo!=null) {
			out.print("ID 사용 불가!");
		} if(vo==null) {
			out.print("ID 사용 가능!!");
		}
		return null;
	}

}
