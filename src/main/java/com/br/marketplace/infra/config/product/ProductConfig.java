package com.br.marketplace.infra.config.product;

import com.br.marketplace.application.gateway.product.ProductGateway;
import com.br.marketplace.application.usecaseimpl.product.register.RegisterProductUsecaseImpl;
import com.br.marketplace.usecase.product.register.RegisterProductUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    public RegisterProductUsecase registerProductUsecase(ProductGateway productGateway) {
        return new RegisterProductUsecaseImpl(productGateway);
    }
}
