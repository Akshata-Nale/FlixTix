package com.example.FlixTix.Convertors;

import com.example.FlixTix.Entities.UserEntity;
import com.example.FlixTix.EntryDtos.UserEntryDto;

public class UserEntryConverter {
    public static UserEntity entryConverter(UserEntryDto userEntityDto) {
        return UserEntity.builder().address(userEntityDto.getAddress()).age(userEntityDto.getAge()).mobNo(userEntityDto.getMobNo()).email(userEntityDto.getEmail()).userName(userEntityDto.getUserName()).build();
    }
}
