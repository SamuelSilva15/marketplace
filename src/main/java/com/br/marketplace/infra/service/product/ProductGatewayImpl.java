package com.br.marketplace.infra.service.product;

import com.br.marketplace.application.gateway.product.ProductGateway;
import com.br.marketplace.core.domain.product.register.RegisterProductInput;
import com.br.marketplace.core.domain.product.register.RegisterProductOutput;
import com.br.marketplace.core.exception.user.UserNotFoundException;
import com.br.marketplace.core.exception.category.CategoryNotFoundException;
import com.br.marketplace.core.exception.category.CategoryRegisteredException;
import com.br.marketplace.core.exception.user.UserRegisteredException;
import com.br.marketplace.infra.entity.category.Category;
import com.br.marketplace.infra.entity.product.Product;
import com.br.marketplace.infra.entity.user.User;
import com.br.marketplace.infra.mapper.product.ProductMapper;
import com.br.marketplace.infra.repositories.product.ProductRepository;
import com.br.marketplace.infra.repositories.category.CategoryRepository;
import com.br.marketplace.infra.repositories.user.UserRepository;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class ProductGatewayImpl implements ProductGateway {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;

    public ProductGatewayImpl(ProductMapper productMapper, ProductRepository productRepository, CategoryRepository categoryRepository, UserRepository userRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.userRepository = userRepository;
    }

    @Override
    public RegisterProductOutput registerProduct(RegisterProductInput registerProductInput) {
        Product product = productMapper.toProduct(registerProductInput);
        
        Product productFound = productRepository.findByUser_UserId(registerProductInput.ownerId());
        Product categoryFound = productRepository.findByCategory_CategoryId(registerProductInput.categoryId());

        if(Objects.nonNull(productFound)) {
            throw new UserRegisteredException(productFound.getUser().getName());
        }
        
        if(Objects.nonNull(categoryFound)) {
            throw new CategoryRegisteredException(categoryFound.getCategory().getDescription());
        }

        Category category  = categoryRepository.findById(registerProductInput.categoryId()).orElseThrow(() -> new CategoryNotFoundException(registerProductInput.categoryId()));
        User user = userRepository.findById(registerProductInput.ownerId()).orElseThrow(() -> new UserNotFoundException(registerProductInput.ownerId()));
        product.setCategory(category);
        product.setUser(user);
        productRepository.save(product);
        return new RegisterProductOutput(product.getTitle(), product.getDescription(), product.getPrice(),
                product.getCategory().getTitle(), product.getUser().getName());
    }
}
