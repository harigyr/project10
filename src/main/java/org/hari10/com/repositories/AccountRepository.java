package org.hari10.com.repositories;

import org.hari10.com.customrepository.GenericRepository;
import org.hari10.com.domain.Account;

/**
 * Spring Data repository interface for {@link Account} entity. Implementation
 * created by spring.
 * 
 * @author Ignas
 * 
 */
public interface AccountRepository extends GenericRepository<Account, Long> {

}
