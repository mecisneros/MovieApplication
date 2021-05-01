package com.example.MovieApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieRatingService {

    @Autowired
    private MovieRatingRepository movieRatingRepository;

    public MovieRating addMovieRating(MovieRating movieRating){
        movieRatingRepository.save(movieRating);
        return  movieRating;
    }

    public List<MovieRating> getMovies(){
        return movieRatingRepository.findAllMovieRatingsOrderByTitleDateDesc();
    }

}
