package com.ishanrtripathi.movieinfomicroservice.resources;

import com.ishanrtripathi.movieinfomicroservice.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("{movieId}")
    public Movie getMovie(@PathVariable("movieId") String movieId){
        return new Movie(movieId, "Transformer");
    }
}
