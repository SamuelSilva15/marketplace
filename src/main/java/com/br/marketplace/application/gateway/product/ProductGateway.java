package com.br.marketplace.application.gateway.product;

import com.br.marketplace.core.domain.product.register.RegisterProductInput;
import com.br.marketplace.core.domain.product.register.RegisterProductOutput;

public interface ProductGateway {
    RegisterProductOutput registerProduct(RegisterProductInput registerProductInput);
}
