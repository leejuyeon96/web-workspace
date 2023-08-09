package controller;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import servlet.model.dao.MemberDAO;
import servlet.model.vo.MemberVO;
// 13프로젝트의 컨트롤러 변경
@WebServlet(urlPatterns="/front.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청이 어디에서 들어오는 요청인지.. command 값 받는다.
		String command = request.getParameter("command");
		String path = "index.jsp";
		
		protected String login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			
			HttpSession session = request.getSession();
			
			if(vo!=null) {
				session.setAttribute("vo", vo);
				return "views/login_result.jsp";
			}
			return "index.jsp";
		}
		
		try {
			if(command.equals("register")) {
			path = register(request,response);  // register메소드 호출
			} else if (command.equals("login")) {
			path = login(request, response);
			} else if (command.equals("allshow")) {
			path = allshow(request,response);
			} else if (command.equals("find")) {
			path = find(request, response);
			} else if (command.equals("update")) {
			path = update(request, response);
			}
		} catch (SQLException e) {}	
			
		// 네비게이션은 앞으로 forward만 사용함
		request.getRequestDispatcher(path).forward(request,response);
		
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected String register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		//1. 폼값 가져오기
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		//2. 객체 생성 -> 폼값 담기 // dto 이므로 set으로 받아와
		MemberVO vo = new MemberVO(id,password,name,address);
		
			
		//3. DAO와 연결
//		MemberDAO dao = new MemberDAO();
		
		MemberDAO.getInstance().registerMember(vo);
			
		//4. 데이터 바인딩->생략 회원가입 후 바로 메인페이지로 넘기기 위해
//		HttpSession session = request.getSession();
//		session.setAttribute("vo", vo);
			
		//5. 네비게이션
		
		
		return "index.jsp";	// index.jsp로 이동하겠다
	}
	protected String login HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		MemberVO vo = new MemberVO(id,password);
		HttpSession session = request.getSession();
		session.setAttribute("vo", vo);
	}
	
}
