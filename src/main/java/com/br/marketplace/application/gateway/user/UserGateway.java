package com.br.marketplace.application.gateway.user;

import com.br.marketplace.core.domain.user.save.SaveUserInput;
import com.br.marketplace.core.domain.user.save.SaveUserOutput;

public interface UserGateway {
    SaveUserOutput saveUser(SaveUserInput saveUserInput);
}
