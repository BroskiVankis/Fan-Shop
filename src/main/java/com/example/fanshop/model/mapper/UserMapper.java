package com.example.fanshop.model.mapper;

import com.example.fanshop.model.dto.user.UserRegisterDTO;
import com.example.fanshop.model.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "active", constant = "true")
    UserEntity userDtoToUserEntity(UserRegisterDTO registerDTO);
}
