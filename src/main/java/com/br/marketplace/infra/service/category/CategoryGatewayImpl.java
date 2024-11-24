package com.br.marketplace.infra.service.category;

import com.br.marketplace.application.gateway.category.CategoryGateway;
import com.br.marketplace.core.domain.category.save.SaveCategoryInput;
import com.br.marketplace.core.domain.category.save.SaveCategoryOutput;
import com.br.marketplace.infra.entity.category.Category;
import com.br.marketplace.infra.mapper.category.CategoryMapper;
import com.br.marketplace.infra.repositories.category.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryGatewayImpl implements CategoryGateway {

    private final CategoryMapper categoryMapper;
    private final CategoryRepository categoryRepository;

    public CategoryGatewayImpl(CategoryMapper categoryMapper, CategoryRepository categoryRepository) {
        this.categoryMapper = categoryMapper;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public SaveCategoryOutput saveUser(SaveCategoryInput saveCategoryInput) {
        Category category = categoryMapper.toCategory(saveCategoryInput);
        categoryRepository.save(category);
        return new SaveCategoryOutput(category.getCategoryId(), category.getTitle(), category.getDescription());
    }
}
