package com.example.FlixTix.EntryDtos;

import com.example.FlixTix.Enums.Genre;
import com.example.FlixTix.Enums.Language;
import lombok.Data;

@Data
public class MovieEntryDto {
    private String movieName;

    private Language language;

    private Genre genre;

    private Double rating;

    private Double duration;
}
