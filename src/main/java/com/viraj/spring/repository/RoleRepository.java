package com.viraj.spring.repository;

import com.viraj.spring.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by DangerROSS on 7/8/2017.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
