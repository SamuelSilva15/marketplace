package com.br.marketplace.infra.config.category;

import com.br.marketplace.application.gateway.category.CategoryGateway;
import com.br.marketplace.application.usecaseimpl.category.save.SaveCategoryUsecaseImpl;
import com.br.marketplace.usecase.category.save.SaveCategoryUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryConfig {

    @Bean
    public SaveCategoryUsecase saveCategoryUsecase(CategoryGateway categoryGateway) {
        return new SaveCategoryUsecaseImpl(categoryGateway);
    }
}
