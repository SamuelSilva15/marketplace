package com.br.marketplace.core.domain.product.register;

public record RegisterProductOutput(String title, String description, Float price, String category, String ownerId) {
}
