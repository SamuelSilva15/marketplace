package com.br.marketplace.usecase.product.register;

import com.br.marketplace.core.domain.product.register.RegisterProductInput;
import com.br.marketplace.core.domain.product.register.RegisterProductOutput;

public interface RegisterProductUsecase {
    RegisterProductOutput execute(RegisterProductInput registerProductInput);
}
