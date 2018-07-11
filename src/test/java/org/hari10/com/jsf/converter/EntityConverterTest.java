package org.hari10.com.jsf.converter;

import javax.faces.component.UIComponent;

import org.hari10.com.domain.TestEntity;
import org.hari10.com.domain.base.BaseEntity;
import org.hari10.com.domain.base.IEntity;
import org.hari10.com.services.base.IVariableTypeService;
import org.junit.Assert;
import org.junit.Test;
import org.primefaces.component.selectcheckboxmenu.SelectCheckboxMenu;

/**
 * Tests for generic entity converter.
 * 
 * @author Ignas
 * 
 */
public class EntityConverterTest {

    @Test
    public void testGetAsObject() {
        UIComponent component = new SelectCheckboxMenu();

        EntityConverter converter = new EntityConverter();
        converter.setVariableTypeService(new DummyVariableService());
        Assert.assertEquals(Long.valueOf(109), ((TestEntity)converter.getAsObject(null, component, "109_org.hari10.com.domain.TestEntity")).getId());

    }

    @Test
    public void testGetAsString() {
        EntityConverter converter = new EntityConverter();
        TestEntity testEntity = new TestEntity();
        testEntity.setId(110L);
        Assert.assertEquals("110_org.hari10.com.domain.TestEntity", converter.getAsString(null, null, testEntity));
    }

    private static class DummyVariableService implements IVariableTypeService {

        @Override
        public BaseEntity findById(Class<? extends IEntity> entityClass, Long id) {
            TestEntity entity = new TestEntity();
            entity.setId(109L);
            return entity;
        }
        
    }
    
}