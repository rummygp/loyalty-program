package com.rummygp.loyalty_program.validator;

import com.rummygp.loyalty_program.model.User;
import com.rummygp.loyalty_program.repository.UserRepository;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UserValidator {
    public static void validateUserCreate(User user, UserRepository userRepository) {
        List<String> errorList = new ArrayList<>();
            if(user.getId() == null) errorList.add("ID");
            if(user.getFirstName() == null) errorList.add("Name");
            if(user.getLastName() == null) errorList.add("Last Name");
            if(user.getEmail() == null) errorList.add("Email");

            if(!errorList.isEmpty()) throw new IllegalArgumentException("Following fields should not be null: " + errorList);
    }
}
