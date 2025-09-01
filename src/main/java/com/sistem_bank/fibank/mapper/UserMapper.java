package com.sistem_bank.fibank.mapper;

import com.sistem_bank.fibank.dto.SignupRequest;
import com.sistem_bank.fibank.dto.SignupResponse;
import com.sistem_bank.fibank.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(SignupRequest signupRequest);

   @Mapping (target = "message", constant = "registration completed successfully")
    SignupResponse toSignupResponse(User user);


}
