package com.fara.foodapp.repo;

import com.fara.foodapp.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByUserId(String userId);

    boolean existsUsersByUserId(String userId);
}