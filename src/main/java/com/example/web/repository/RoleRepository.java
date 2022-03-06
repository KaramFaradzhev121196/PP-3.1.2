package com.example.web.repository;

import com.example.web.model.Role;
import org.springframework.data.repository.CrudRepository;
import java.util.Set;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Set<Role> findAll();
    Role findRoleByRole(String role);
    Role findRoleById(Long id);
}