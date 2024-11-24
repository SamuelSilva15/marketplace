package com.br.marketplace.core.domain.category.save;

import java.util.UUID;

public record SaveCategoryOutput(UUID categoryID, String title, String description) {
}
