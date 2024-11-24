package com.br.marketplace.usecase.category.save;

import com.br.marketplace.core.domain.category.save.SaveCategoryInput;
import com.br.marketplace.core.domain.category.save.SaveCategoryOutput;

public interface SaveCategoryUsecase {
    SaveCategoryOutput execute(SaveCategoryInput saveCategoryInput);
}
