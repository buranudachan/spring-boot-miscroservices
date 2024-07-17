package com.practices.movies_rating_service;

public class Rating {
    public String movieId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String name;
    public String desc;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
    Rating(String movieId,String name,String desc){
        this.movieId=movieId;
        this.name=name;
        this.desc=desc;
    }
}
