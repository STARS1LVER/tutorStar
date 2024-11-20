package com.tutorstar.TutorStar.dto;

import com.tutorstar.TutorStar.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper( componentModel = "spring")
public interface UserMapper {

  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    /**
     *  Convierte una entidad User a un DTO UserDto
     *  Excluye el campo password para no exponerlo
     * @param user
     *
     */
  @Mapping( target = "password", ignore = true )// Ignora el campo `password`
  UserDto userToUserDto( User user );

    /**
     * Convierte un DTO UserDto a una entidad User
     * @param userDto
     *
     */
  @Mapping( target = "password", ignore = true )// Ignora el campo `password`
  User userDtoToUser( UserDto userDto );
    
}
