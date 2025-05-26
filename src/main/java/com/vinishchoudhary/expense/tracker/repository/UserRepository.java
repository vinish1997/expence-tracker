package com.vinishchoudhary.expense.tracker.repository;

import com.vinishchoudhary.expense.tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
