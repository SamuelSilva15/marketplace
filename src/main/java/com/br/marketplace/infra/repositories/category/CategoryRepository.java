package com.br.marketplace.infra.repositories.category;

import com.br.marketplace.infra.entity.category.Category;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
