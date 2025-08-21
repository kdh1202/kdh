package movieDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import movie.DTO.MovieDTO;

public class MovieDAO {
    Connection conn = null;
    PreparedStatement ps = null;

	private Connection getConn() {
		Connection conn = null;

		try {

			// JNDI 방식 : 글씨로 뭔가를 가져오는 방식
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			conn = dataFactory.getConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public List<MovieDTO> MovieAll() {
		List<MovieDTO> list = new ArrayList<MovieDTO>();
		try {

			 conn = getConn();
			String query = " select * from movie";
			 ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
		            MovieDTO movie = new MovieDTO();
		            movie.setMovie_id(rs.getInt("movie_id"));
		            movie.setTitle(rs.getString("title"));
		            movie.setImg_url(rs.getString("img_url"));
		            movie.setOpen_date(rs.getString("open_date")); // 문자열로 가져오기
		            list.add(movie);
		        }
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	// 수정
	public int updateMovie(MovieDTO movie) {
		Connection conn = null;

		int result = 0;

		 try {
		        conn = getConn();
		        String query = "UPDATE movie SET title=?, img_url=?, open_date=? WHERE movie_id=?";
		       
		        
		        ps = conn.prepareStatement(query);
		        ps.setString(1, movie.getTitle());
		        ps.setString(2, movie.getImg_url());
		        ps.setDate(3, Date.valueOf(movie.getOpen_date()));
		        ps.setInt(4, movie.getMovie_id());

		        result = ps.executeUpdate();
		    } catch (Exception e) {
		        e.printStackTrace();
		    } finally {
		        try { if(ps != null) ps.close(); } catch(Exception e) {}
		        try { if(conn != null) conn.close(); } catch(Exception e) {}
		    }

		    return result;
}
	public MovieDTO getMovieById(int movie_id) {
	    MovieDTO movie = null;
	    try {
	        Connection conn = getConn();
	        String query = "SELECT * FROM movie WHERE movie_id=?";
	        PreparedStatement ps = conn.prepareStatement(query);
	        ps.setInt(1, movie_id);
	        ResultSet rs = ps.executeQuery();
	        if(rs.next()) {
	            movie = new MovieDTO();
	            movie.setMovie_id(rs.getInt("movie_id"));
	            movie.setTitle(rs.getString("title"));
	            movie.setImg_url(rs.getString("img_url"));
	            movie.setOpen_date(rs.getString("open_date"));
	        }
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	    return movie;
	}
}
