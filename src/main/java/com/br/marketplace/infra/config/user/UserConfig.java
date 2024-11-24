package com.br.marketplace.infra.config.user;

import com.br.marketplace.application.gateway.user.UserGateway;
import com.br.marketplace.application.usecaseimpl.user.save.SaveUserUsecaseImpl;
import com.br.marketplace.usecase.user.save.SaveUserUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public SaveUserUsecase saveUserUsecase(UserGateway userGateway) {
        return new SaveUserUsecaseImpl(userGateway);
    }
}
