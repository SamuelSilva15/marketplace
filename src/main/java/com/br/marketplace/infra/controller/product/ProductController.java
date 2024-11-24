package com.br.marketplace.infra.controller.product;

import com.br.marketplace.core.domain.product.register.RegisterProductInput;
import com.br.marketplace.core.domain.product.register.RegisterProductOutput;
import com.br.marketplace.usecase.product.register.RegisterProductUsecase;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    private final RegisterProductUsecase registerProductUseCase;

    public ProductController(RegisterProductUsecase registerProductUseCase) {
        this.registerProductUseCase = registerProductUseCase;
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterProductOutput> registerProduct(@RequestBody @Valid RegisterProductInput registerProductInput) {
        RegisterProductOutput registerProductOutput = registerProductUseCase.execute(registerProductInput);
        return ResponseEntity.status(HttpStatus.CREATED).body(registerProductOutput);
    }
}
