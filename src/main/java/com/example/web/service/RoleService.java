package com.example.web.service;

import com.example.web.model.Role;
import java.util.Set;

public interface RoleService {
    Set<Role> getAllRoles();
    Role getRoleByID(Long id);
    Role getRoleByRole(String role);
    void addRole(Role role);
}