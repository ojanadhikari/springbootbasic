package com.example.demo.repo;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ozads
 * @version v1.0
 * @project cab demo
 * @since 2024-07-18
 **/
public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
