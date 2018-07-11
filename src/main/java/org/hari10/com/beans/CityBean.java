package org.hari10.com.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.hari10.com.beans.base.BaseBean;
import org.hari10.com.domain.City;
import org.hari10.com.services.ICityService;
import org.hari10.com.services.base.IService;

/**
 * Backing bean for city (used only for returning all cities in drop down menu in sample).
 * 
 * @author Ignas
 *
 */
@ManagedBean(name = "cityBean")
@ViewScoped
public class CityBean extends BaseBean<City> {

    /** */
    private static final long serialVersionUID = 1L;

    /** Injected service. */
    @ManagedProperty(value = "#{cityService}")
    private ICityService cityService;

    /**
     * Constructor.
     */
    public CityBean() {
        super(City.class);
    }

    /**
     * @see org.hari10.com.beans.base.BaseBean#getPersistenceService()
     */
    @Override
    protected IService<City> getPersistenceService() {
        return cityService;
    }

    public void setCityService(ICityService cityService) {
        this.cityService = cityService;
    }

}
