package org.hari10.com.services;

import org.hari10.com.domain.Operation;
import org.hari10.com.repositories.OperationRepository;
import org.hari10.com.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Service implementation for Operation.
 * 
 * @author Ignas
 *
 */
@Service("operationService")
public class OperationService extends BaseService<Operation> implements IOperationService {

    /** */
    private static final long serialVersionUID = 1L;

    /** Injected repository. */
    @Autowired
    private OperationRepository repository;
    
    /**
     * @see org.hari10.com.services.base.BaseService#getRepository()
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    protected JpaRepository<Operation, Long> getRepository() {
        return (JpaRepository) repository;
    }
}
