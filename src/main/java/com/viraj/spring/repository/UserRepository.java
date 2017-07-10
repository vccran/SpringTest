package com.viraj.spring.repository;

import com.viraj.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by DangerROSS on 7/8/2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
