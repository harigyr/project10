package org.hari10.com.services;

import org.hari10.com.domain.City;
import org.hari10.com.repositories.CityRepository;
import org.hari10.com.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Service implementation for City.
 * 
 * @author Ignas
 *
 */
@Service("cityService")
public class CityService extends BaseService<City> implements ICityService {

    /** */
    private static final long serialVersionUID = 1L;

    /** Injected repository. */
    @Autowired
    private CityRepository repository;
    
    /**
     * @see org.hari10.com.services.base.BaseService#getRepository()
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    protected JpaRepository<City, Long> getRepository() {
        return (JpaRepository) repository;
    }
}
