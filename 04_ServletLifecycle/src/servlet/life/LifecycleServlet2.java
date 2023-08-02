package servlet.life;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifecycleServlet1
 */
public class LifecycleServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public int count = 0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifecycleServlet2() {
      //클래스명과 일치 = 생성자
      System.out.println("1. LifecycleServlet 생성자..");
        
    }

	public void init(ServletConfig config) throws ServletException {
	  System.out.println("2. init... 호출..");
	}


	public void destroy() {
		System.out.println("4. destroy... 호출..");
			}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//비즈니스 로직이 작성되는 부분
		System.out.println("3. service...호출..");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<a href=life2.jsp?count=" + ++count + ">life2.jsp로 이동></a>");
		
		
		out.close();
	}

}
