package dev.thejas.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepo movieRepositary;

    public List<Movie> allMovies() {
        System.out.println(movieRepositary.findAll().toString());
        return movieRepositary.findAll();
    }

    public Optional<Movie> singleMovie(ObjectId id) {
        return movieRepositary.findById(id);

    }
}
