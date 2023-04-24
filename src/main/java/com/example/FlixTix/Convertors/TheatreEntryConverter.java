package com.example.FlixTix.Convertors;

import com.example.FlixTix.Entities.TheatreEntity;
import com.example.FlixTix.EntryDtos.TheatreEntryDto;

public class TheatreEntryConverter {
    public static TheatreEntity entryConverter(TheatreEntryDto theatreEntryDto) {
        return TheatreEntity.builder().theatreName(theatreEntryDto.getTheatreName()).location(theatreEntryDto.getLocation()).build();
    }
}
