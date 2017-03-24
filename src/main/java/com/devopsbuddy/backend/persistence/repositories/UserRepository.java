package com.devopsbuddy.backend.persistence.repositories;

import com.devopsbuddy.backend.persistence.domain.backend.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by bhermanto on 3/21/2017.
 */
public interface UserRepository  extends CrudRepository<User, Long> {
}
