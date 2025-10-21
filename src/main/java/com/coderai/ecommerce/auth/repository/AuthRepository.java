package com.coderai.ecommerce.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.coderai.ecommerce.auth.entity.Auth;

@Repository
public interface AuthRepository extends JpaRepository<Auth, Long> {
    // TODO: add query methods
}
