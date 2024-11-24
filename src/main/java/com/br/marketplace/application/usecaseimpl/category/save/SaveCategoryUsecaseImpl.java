package com.br.marketplace.application.usecaseimpl.category.save;

import com.br.marketplace.application.gateway.category.CategoryGateway;
import com.br.marketplace.core.domain.category.save.SaveCategoryInput;
import com.br.marketplace.core.domain.category.save.SaveCategoryOutput;
import com.br.marketplace.usecase.category.save.SaveCategoryUsecase;

public class SaveCategoryUsecaseImpl implements SaveCategoryUsecase {

    private final CategoryGateway categoryGateway;

    public SaveCategoryUsecaseImpl(CategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public SaveCategoryOutput execute(SaveCategoryInput saveCategoryInput) {
        return categoryGateway.saveUser(saveCategoryInput);
    }
}
