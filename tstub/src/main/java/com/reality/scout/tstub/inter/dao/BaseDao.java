package com.reality.scout.tstub.inter.dao;

import java.io.Serializable;

public interface BaseDao extends Serializable {

	/**
	 * 查找实体对象
	 * @param <T>
	 * @param id	ID
	 * @return		实体对象，若不存在则返回null
	 */
	<T> T find(Class<T> entityClazz, String id);
}
