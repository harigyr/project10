package org.hari10.com.services;

import java.util.List;

import org.hari10.com.domain.Customer;
import org.hari10.com.domain.CustomerPerk;
import org.hari10.com.services.base.IService;

/**
 * Customer service interface.
 * 
 * @author Ignas
 * 
 */
public interface ICustomerService extends IService<Customer> {

    /**
     * Loads all customer perks.
     */
    List<CustomerPerk> getAllCustomerPerks();

}
