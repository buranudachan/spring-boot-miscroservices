package com.practices.movies_rating_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("rating")
public class MoviesCatalogueController {

    @GetMapping("/{movieId}")
    public Rating getMovieCatalogue(@PathVariable("movieId") String movieId){
        return new Rating(movieId,"test movies name","test desc");
    }
}
