package com.example.FlixTix.Convertors;

import com.example.FlixTix.Entities.MovieEntity;
import com.example.FlixTix.EntryDtos.MovieEntryDto;

public class MovieEntryConverter {
    public static MovieEntity movieEntryConvertor(MovieEntryDto movieDto) {
        return MovieEntity.builder().movieName(movieDto.getMovieName()).duration(movieDto.getDuration()).genre(movieDto.getGenre()).language(movieDto.getLanguage()).rating(movieDto.getRating()).genre(movieDto.getGenre()).build();
    }
}
