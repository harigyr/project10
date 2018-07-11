package org.hari10.com.repositories;

import org.hari10.com.customrepository.GenericRepository;
import org.hari10.com.domain.User;

/**
 * Spring Data repository interface for {@link User} entity. Implementation created by spring.
 * 
 * @author Ignas
 *
 */
public interface UserRepository extends GenericRepository<User, Long> {
    
    /**
     * Loads User by his unique username.
     */
    User findByUsername(String username);

}
