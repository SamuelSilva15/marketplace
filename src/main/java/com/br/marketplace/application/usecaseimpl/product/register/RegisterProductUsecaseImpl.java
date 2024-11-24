package com.br.marketplace.application.usecaseimpl.product.register;

import com.br.marketplace.application.gateway.product.ProductGateway;
import com.br.marketplace.core.domain.product.register.RegisterProductInput;
import com.br.marketplace.core.domain.product.register.RegisterProductOutput;
import com.br.marketplace.usecase.product.register.RegisterProductUsecase;

public class RegisterProductUsecaseImpl implements RegisterProductUsecase {

    private final ProductGateway productGateway;

    public RegisterProductUsecaseImpl(ProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public RegisterProductOutput execute(RegisterProductInput registerProductInput) {
        return productGateway.registerProduct(registerProductInput);
    }
}
