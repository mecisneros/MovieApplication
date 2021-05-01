package com.example.MovieApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieController {

	@Autowired
	private MovieRatingService movieRatingService;

	@GetMapping("/movies")
	public String getMovies(Model model) {
		model.addAttribute("moviesList",movieRatingService.getMovies());
		return "moviesTableForm";
	}

	@GetMapping("/movies/new")
	public String getBlankForm(Model model) {
		model.addAttribute("movieRating",new MovieRating());
		return "moviesRatingForm";
	}

	@PostMapping("/movies/new")
	public String getResultForm(@ModelAttribute("movieRating") MovieRating movieRating){
		movieRatingService.addMovieRating(movieRating);
		return "movieRatingResult";
	}
	
}
