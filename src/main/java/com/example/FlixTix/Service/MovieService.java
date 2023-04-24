package com.example.FlixTix.Service;

import com.example.FlixTix.Convertors.MovieEntryConverter;
import com.example.FlixTix.Entities.MovieEntity;
import com.example.FlixTix.EntryDtos.MovieEntryDto;
import com.example.FlixTix.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
    public String addMovie(MovieEntryDto movieEntryDto) {
        MovieEntity movie = MovieEntryConverter.movieEntryConvertor(movieEntryDto);
        movieRepository.save(movie);
        return "Successfully Added";
    }
}
