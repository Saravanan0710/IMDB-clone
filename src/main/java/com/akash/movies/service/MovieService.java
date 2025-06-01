package com.akash.movies.service;

import com.akash.movies.model.Movie;
import com.akash.movies.repo.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repo;

    public List<Movie> getMovies() {
        return repo.findAll();
    }

    public Optional<Movie> getMovieByImdbId(String imdbId) {
        return repo.findMovieByImdbId(imdbId);
    }
}
