package com.br.marketplace.infra.mapper.product;

import com.br.marketplace.core.domain.product.register.RegisterProductInput;
import com.br.marketplace.infra.entity.product.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toProduct(RegisterProductInput registerProductInput) {
        return new Product(registerProductInput.title(), registerProductInput.description(),
                registerProductInput.price());
    }
}
