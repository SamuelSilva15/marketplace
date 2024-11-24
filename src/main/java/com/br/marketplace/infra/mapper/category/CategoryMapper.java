package com.br.marketplace.infra.mapper.category;

import com.br.marketplace.core.domain.category.save.SaveCategoryInput;
import com.br.marketplace.infra.entity.category.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {

    public Category toCategory(SaveCategoryInput saveCategoryInput) {
        return new Category(saveCategoryInput.title(), saveCategoryInput.description());
    }
}
