package org.hari10.com.beans;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.hari10.com.beans.base.BaseBean;
import org.hari10.com.domain.Account;
import org.hari10.com.services.IAccountService;
import org.hari10.com.services.base.IService;

/**
 * Backing bean for account UI.
 * 
 * @author Ignas
 *
 */
@ManagedBean(name = "accountBean")
@ViewScoped
public class AccountBean extends BaseBean<Account> {

    /** */
    private static final long serialVersionUID = 1L;

    /** Injected service. */
    @ManagedProperty(value = "#{accountService}")
    private IAccountService accountService;

    /**
     * Constructor.
     */
    public AccountBean() {
        super(Account.class);
    }

    /**
     * @see org.hari10.com.beans.base.BaseBean#getPersistenceService()
     */
    @Override
    protected IService<Account> getPersistenceService() {
        return accountService;
    }

    public void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * Fetch customer field so no LazyInitialize exception is thrown when
     * we access it from account list view.
     * 
     * @see org.hari10.com.beans.base.BaseBean#getListFieldsToFetch()
     */
    @Override
    protected List<String> getListFieldsToFetch() {
        return Arrays.asList("customer", "operations");
    }

    /**
     * Fetch customer field so no LazyInitialize exception is thrown when
     * we access it from account edit view.
     * 
     * @see org.hari10.com.beans.base.BaseBean#getFormFieldsToFetch()
     */
    @Override
    protected List<String> getFormFieldsToFetch() {
        return Arrays.asList("customer", "operations");
    }

}
