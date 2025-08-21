package sec01.exam01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/quiz2")
public class quiz2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("/quiz2 doget 실행");
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		String dong = request.getParameter("dong");
		
		// 요청 할 때 한글 깨짐
		request.setCharacterEncoding("utf-8");
		// 응답 할 때 한글 깨짐
		response.setContentType("text/html;charset=utf-8");

		try {
			PrintWriter out = response.getWriter();
			
//			if( id == dong ) {
//				System.out.println("아이디가 같습니다 ");
//			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
