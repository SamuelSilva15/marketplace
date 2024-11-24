package com.br.marketplace.infra.mapper.user;

import com.br.marketplace.core.domain.user.save.SaveUserInput;
import com.br.marketplace.infra.entity.user.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toUser(SaveUserInput saveUserInput) {
        return new User(saveUserInput.name());
    }
}
