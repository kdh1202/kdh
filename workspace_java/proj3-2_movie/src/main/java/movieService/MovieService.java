package movieService;

import java.util.List;

import movie.DTO.MovieDTO;
import movieDAO.MovieDAO;

public class MovieService {

	MovieDAO movieDAO = new MovieDAO();

	public List<MovieDTO> getAllMovie() {
		List list = movieDAO.MovieAll();

		return list;
	}

	public void updateMovie(MovieDTO movieDTO) {
		MovieDAO movieDAO = new MovieDAO();
		movieDAO.updateMovie(movieDTO);
		
	}

	public MovieDTO getMovieById(int movie_id) {
	    return movieDAO.getMovieById(movie_id);
	}
	

}
