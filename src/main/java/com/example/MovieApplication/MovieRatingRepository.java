package com.example.MovieApplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MovieRatingRepository extends CrudRepository<MovieRating, Long> {
    @Query("select m from MovieRating m order by m.title, m.date  desc")
    List<MovieRating> findAllMovieRatingsOrderByTitleDateDesc();
}

