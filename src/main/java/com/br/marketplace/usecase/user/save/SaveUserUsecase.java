package com.br.marketplace.usecase.user.save;

import com.br.marketplace.core.domain.user.save.SaveUserInput;
import com.br.marketplace.core.domain.user.save.SaveUserOutput;

public interface SaveUserUsecase {
    SaveUserOutput execute(SaveUserInput saveUserInput);
}
