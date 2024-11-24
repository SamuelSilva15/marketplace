package com.br.marketplace.core.domain.product.register;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;


public record RegisterProductInput(@NotBlank String title, @NotBlank String description, @NotNull Float price, @NotNull UUID categoryId, @NotNull UUID ownerId) {}