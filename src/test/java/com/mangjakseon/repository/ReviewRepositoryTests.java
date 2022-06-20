package com.mangjakseon.repository;

import com.mangjakseon.entity.Member;
import com.mangjakseon.entity.Movie;
import com.mangjakseon.entity.Review;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ReviewRepositoryTests {
    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    public void insertMovieReviews(){
        Member member = Member.builder().mno(3L).build();

        Review movieReview = Review.builder()
                .member(member)
                .movie(Movie.builder().movienum(1L).build())
                .grade((int)(Math.random()*5)+1)
                .title("재밌음")
                .content("볼만함 한번 보셈")
                .build();
        reviewRepository.save(movieReview);


    }
    @Test
    public void testGetMovieReviews(){
        Movie movie = Movie.builder().movienum(1L).build();

        List<Review>  result = reviewRepository.findByMovie(movie);

        result.forEach(movieReview -> {
           System.out.print(movieReview.getRno());
           System.out.print("\t"+movieReview.getGrade());
           System.out.print("\t"+movieReview.getTitle());
           System.out.print("\t"+movieReview.getContent());
           System.out.print("\t"+movieReview.getMember().getEmail());
           System.out.print("========================");
            });
    }
}
