package com.nthao.identify.demo.mapper;

import com.nthao.identify.demo.dto.request.UserCreationRequest;
import com.nthao.identify.demo.entity.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest userCreationRequest);
}
