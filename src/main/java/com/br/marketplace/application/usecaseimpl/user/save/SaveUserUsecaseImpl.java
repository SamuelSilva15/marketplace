package com.br.marketplace.application.usecaseimpl.user.save;

import com.br.marketplace.application.gateway.user.UserGateway;
import com.br.marketplace.core.domain.user.save.SaveUserInput;
import com.br.marketplace.core.domain.user.save.SaveUserOutput;
import com.br.marketplace.usecase.user.save.SaveUserUsecase;

public class SaveUserUsecaseImpl implements SaveUserUsecase {

    private final UserGateway userGateway;

    public SaveUserUsecaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public SaveUserOutput execute(SaveUserInput saveUserInput) {
        return userGateway.saveUser(saveUserInput);
    }
}
