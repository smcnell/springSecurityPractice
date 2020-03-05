package com.shannon.securityPractice.repository;

import com.shannon.securityPractice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}