package movie.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movie.DTO.MovieDTO;
import movieService.MovieService;

@WebServlet("/mlist")
public class MovieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/list doget 실행");
		// 요청 할 때 한글 깨짐
		request.setCharacterEncoding("utf-8");
		// 응답 할 때 한글 깨짐
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		MovieService movieService = new MovieService();
		List<MovieDTO> list = movieService.getAllMovie();
		
		
		out.println("<h1>영화관</h1>");
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td> 영화 넘버 </td>");
		out.println("<td> 영화제목 </td>");
		out.println("<td> 이미지 </td>");
		out.println("<td> 날짜  </td>");
		out.println("</tr>");

		for(MovieDTO dto : list) {
			out.println("<table border=1>");
			out.println("<tr>");
			out.println("<td> 영화 넘버 '"+dto.getMovie_id()+"'</td>");
			out.println("<td> 영화제목 '"+dto.getTitle()+"'</td>");
			out.println("<td> 이미지 '"+dto.getImg_url()+"'</td>");
			out.println("<td> 날짜  '"+dto.getOpen_date()+"'</td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("<form method='get' action='edit'>");
			out.println("<input type='hidden' name='movie_id' value='" + dto.getMovie_id() + "'>");
			out.println("<input type='submit' value='수정'>");
			out.println("</form>");
		}
//		
		out.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		}
	

	
}
