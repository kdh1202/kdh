package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/set")
public class SetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 할 때 한글 깨짐
		request.setCharacterEncoding("utf-8");
		// 응답 할 때 한글 깨짐
		response.setContentType("text/html;charset=utf-8");
		
		// 만료일이 있는 쿠키
		Cookie c1 = new Cookie("addr","강원도");
		c1.setMaxAge(60*60*24);  // 초단위
//		c1.setMaxAge(10);
		response.addCookie(c1);
		
		
		// 만료일이 없는 쿠키
		// 세션 쿠키
		// setMaxAge 를 설정하기 않거나
		// setMaxAge(-1) 음수로 설정한다 
		// 브라우저 메모리에만 저장된다
		// 즉, 모든 탭을 끄면 사라진다 
		
		Cookie c2 =new Cookie("dinner","회");
		c2.setMaxAge(-1);
		response.addCookie(c2);
		
		Cookie c3 =new Cookie("showPopup","N");
		c3.setMaxAge(1);
		response.addCookie(c3);
		
		
	}

}
