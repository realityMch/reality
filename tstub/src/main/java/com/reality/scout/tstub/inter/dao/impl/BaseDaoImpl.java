package com.reality.scout.tstub.inter.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.reality.scout.tstub.inter.dao.BaseDao;
@Repository
public class BaseDaoImpl implements BaseDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	protected EntityManager entityManager;
	
	@Override
	public <T> T find(Class<T> entityClazz, String id) {
		if (id != null) {
            return entityManager.find(entityClazz, id);
        }
        return null;
	}

}
