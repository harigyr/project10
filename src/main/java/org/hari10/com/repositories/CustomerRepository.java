package org.hari10.com.repositories;

import org.hari10.com.customrepository.GenericRepository;
import org.hari10.com.domain.Customer;

/**
 * Spring Data repository interface for {@link Customer} entity. Implementation created by spring.
 * 
 * @author Ignas
 *
 */
public interface CustomerRepository extends GenericRepository<Customer, Long> {
}