package sec01.exam01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/quizServlet")
public class quizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 할 때 한글 깨짐
		request.setCharacterEncoding("utf-8");
		
		// 응답 할 때 한글 깨짐
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		System.out.println(id);
		System.out.println(pw);
		try {
			
		PrintWriter out = response.getWriter() ;
		if( (id == null ||id.equals("")) && (pw == null||pw.equals(""))) {
			out.println("아이디 비밀번호 를 입력해주세요");
		}  else if (id == null || id.equals("")) {
			out.println("아이디를 입력해주세요");
		} else if( pw == null||pw.equals("")) {
			out.println("비밀번호를 입력해주세요");
		} 	else if("admin".equals(id) && "1234".equals(pw)) {
			out.println("관리자모드");
		}
		
		

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
