package com.br.marketplace.infra.controller.category;

import com.br.marketplace.core.domain.category.save.SaveCategoryInput;
import com.br.marketplace.core.domain.category.save.SaveCategoryOutput;
import com.br.marketplace.usecase.category.save.SaveCategoryUsecase;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final SaveCategoryUsecase saveCategoryUsecase;

    public CategoryController(SaveCategoryUsecase saveCategoryUsecase) {
        this.saveCategoryUsecase = saveCategoryUsecase;
    }

    @PostMapping("/save-category")
    public ResponseEntity<SaveCategoryOutput> saveCategory(@RequestBody @Valid SaveCategoryInput saveCategoryInput) {
        SaveCategoryOutput saveCategoryOutput = saveCategoryUsecase.execute(saveCategoryInput);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveCategoryOutput);
    }
}
