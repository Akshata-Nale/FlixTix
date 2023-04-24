package com.example.FlixTix.Service;

import com.example.FlixTix.Convertors.UserEntryConverter;
import com.example.FlixTix.Entities.UserEntity;
import com.example.FlixTix.EntryDtos.UserEntryDto;
import com.example.FlixTix.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String addUser(UserEntryDto userEntityDto) {
        UserEntity user = UserEntryConverter.entryConverter(userEntityDto);
        userRepository.save(user);
        return "User Added Successfully";
    }
}
