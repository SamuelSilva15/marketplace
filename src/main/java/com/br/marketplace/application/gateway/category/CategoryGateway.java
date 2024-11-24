package com.br.marketplace.application.gateway.category;

import com.br.marketplace.core.domain.category.save.SaveCategoryInput;
import com.br.marketplace.core.domain.category.save.SaveCategoryOutput;

public interface CategoryGateway {
    SaveCategoryOutput saveUser(SaveCategoryInput saveCategoryInput);
}
