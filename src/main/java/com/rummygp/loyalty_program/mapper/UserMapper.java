package com.rummygp.loyalty_program.mapper;

import com.rummygp.loyalty_program.command.UserCreateCommand;
import com.rummygp.loyalty_program.dto.UserDto;
import com.rummygp.loyalty_program.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toPojo(UserCreateCommand userCreateCommand);
    UserDto toDto(User user);
}
