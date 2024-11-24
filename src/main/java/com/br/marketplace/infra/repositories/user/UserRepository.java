package com.br.marketplace.infra.repositories.user;

import com.br.marketplace.infra.entity.user.User;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
