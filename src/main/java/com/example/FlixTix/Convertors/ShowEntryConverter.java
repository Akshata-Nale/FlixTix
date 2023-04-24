package com.example.FlixTix.Convertors;

import com.example.FlixTix.Entities.ShowEntity;
import com.example.FlixTix.EntryDtos.ShowEntryDto;

public class ShowEntryConverter {
    public static ShowEntity entryConverter(ShowEntryDto showEntryDto) {
        return ShowEntity.builder().localTime(showEntryDto.getLocalTime()).localDate(showEntryDto.getLocalDate()).showType(showEntryDto.getShowType()).seatPrice(showEntryDto.getSeatPrice()).build();
    }
}
