package sec01.exam01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Input2Servlet")
public class Input2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 요청 할 때 한글 깨짐
		request.setCharacterEncoding("utf-8");

		// 응답 할 때 한글 깨짐
		response.setContentType("text/html;charset=utf-8");
		
		// request.getParameter("num1") html에 있는 name을 가져온것
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		try {
			
			// Integer.parseInt 글씨를 숫자로 바꿔주는것
			int num11 = Integer.parseInt(num1);
			int num22 = Integer.parseInt(num2);
			int sum1 = num11+num22;
			
			
			  PrintWriter out = response.getWriter() ;
//			response.getWriter().println("<h1>"+"num1 :"+num11+"</h1>");
//			response.getWriter().println("<h1>"+"num2 :"+num22+"</h1>");
//			response.getWriter().println("<h1>"+"sum :"+sum1+"</h1>");
			  
			  out.println("<h1>"+"num1 :"+num11+"</h1>");
			  out.println("<h1>"+"num2 :"+num22+"</h1>");
			  out.println("<h1>"+"sum :"+sum1+"</h1>");
			  
			request.setAttribute("number3", sum1);
			int n4  = (int)request.getAttribute("number3");
			
			request.getRequestDispatcher("/WEB-INF/view/calc/inputResult.jsp").forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
