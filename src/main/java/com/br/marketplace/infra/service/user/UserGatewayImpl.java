package com.br.marketplace.infra.service.user;

import com.br.marketplace.application.gateway.user.UserGateway;
import com.br.marketplace.core.domain.user.save.SaveUserInput;
import com.br.marketplace.core.domain.user.save.SaveUserOutput;
import com.br.marketplace.infra.entity.user.User;
import com.br.marketplace.infra.mapper.user.UserMapper;
import com.br.marketplace.infra.repositories.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserGatewayImpl implements UserGateway {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserGatewayImpl(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public SaveUserOutput saveUser(SaveUserInput saveUserInput) {
        User user = userMapper.toUser(saveUserInput);
        userRepository.save(user);
        return new SaveUserOutput(user.getUserId(), user.getName());
    }
}
