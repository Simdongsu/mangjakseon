package com.mangjakseon.repository;


import com.mangjakseon.entity.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
public class MovieRepositoryTests {
    @Autowired
    private MovieRepository movieRepository;

    @Commit
    @Transactional
    @Test
    public void insertMovies(){
        Movie movie = Movie.builder().title("리얼").build();
        movieRepository.save(movie);
    }

}
