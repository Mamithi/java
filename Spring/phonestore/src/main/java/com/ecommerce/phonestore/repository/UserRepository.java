package com.ecommerce.phonestore.repository;

import com.ecommerce.phonestore.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);
}
