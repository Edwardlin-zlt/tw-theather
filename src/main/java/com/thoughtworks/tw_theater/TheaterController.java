package com.thoughtworks.tw_theater;

import com.thoughtworks.tw_theater.entities.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheaterController {

    public final MoviesService moviesService;

    public TheaterController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }


    @GetMapping("/index")
    public String getIndex(@RequestParam String name){
        System.out.println(name);
        return moviesService.getIndex();
    }

    @GetMapping("/theater_api/movie/{id}")
    public Movie getMovie(@PathVariable Integer id) {
        return moviesService.getMovie(id);
    }

    @GetMapping("/theater_api/movies")
    public Iterable<Movie> getMovies(){
        return moviesService.getMovies();
    }

//    @GetMapping("/theater_api/movies")
//    public Iterable<Movie> getMoviesFromIdToCount(@RequestParam Integer start, @RequestParam Integer count){
//        return moviesService.getMoviesFromIdToCount(start, count);
//    }
}
