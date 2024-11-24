package com.br.marketplace.infra.repositories.product;

import com.br.marketplace.infra.entity.category.Category;
import com.br.marketplace.infra.entity.product.Product;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    Product findByUser_UserId(UUID userId);

    Product findByCategory_CategoryId(UUID attr0);
}
