package com.example.demo.core.dataAccess;

import com.example.demo.entities.concrete.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByEmail(String email);
}
