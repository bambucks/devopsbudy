package com.devopsbuddy.backend.persistence.repositories;

import com.devopsbuddy.backend.persistence.domain.backend.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by bhermanto on 3/21/2017.
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
