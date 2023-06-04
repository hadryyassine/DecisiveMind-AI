package com.decisivemind.Backend_decisivemind.repositories;

import com.decisivemind.Backend_decisivemind.entities.Role;
import com.decisivemind.Backend_decisivemind.entities.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
