package movie.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movie.DTO.MovieDTO;
import movieService.MovieService;

@WebServlet("/edit")
public class MovieEditServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        int movie_id = Integer.parseInt(request.getParameter("movie_id"));
        MovieService movieService = new MovieService();
        MovieDTO dto = movieService.getMovieById(movie_id);

        PrintWriter out = response.getWriter();
        out.println("<h1>영화 수정</h1>");
        out.println("<form method='post' action='edit'>");
        out.println("<input type='hidden' name='movie_id' value='" + dto.getMovie_id() + "'>");
        out.println("제목: <input type='text' name='title' value='" + dto.getTitle() + "'><br>");
        out.println("이미지 URL: <input type='text' name='img_url' value='" + dto.getImg_url() + "'><br>");
        out.println("개봉일: <input type='date' name='open_date' value='" + dto.getOpen_date() + "'><br>");
        out.println("<input type='submit' value='수정 완료'>");
        out.println("</form>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
       
        int movieId = Integer.parseInt(request.getParameter("movie_id"));
        String title = request.getParameter("title");
        String imgUrl = request.getParameter("img_url");
        String openDate = request.getParameter("open_date");
        MovieService movieService = new MovieService();
        
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setMovie_id(movieId);
        movieDTO.setTitle(title);
        movieDTO.setImg_url(imgUrl);
        movieDTO.setOpen_date(openDate);

        MovieService movieService1 = new MovieService();
        movieService1.updateMovie(movieDTO);
        
        response.sendRedirect("mlist");
    }
}
