package servlet.controller;
import java.io.IOException;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlet.model.dao.MemberDAO;
import servlet.model.vo.MemberDTO;
import servlet.model.vo.MemberVO;
@WebServlet("/AllMemberServlet")
public class AllMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		MemberDAO dao = new MemberDAO();
		try {
			ArrayList<MemberVO> list = MemberDAO.getInstance()./*dao.*/showAllMember();
			request.setAttribute("item", item);  	// AllMember서블릿만 불러오면 되니까 request에 바인딩, 세션이 너무 많은 것도 안 좋아
			request.getRequestDispatcher("views/allShow.jsp").forward(request, response);
		} catch (SQLException e) {}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}