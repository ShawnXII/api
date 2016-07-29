package com.forerunner.foundation.facade.system;

import com.forerunner.core.base.entity.AbstractEntity;

public interface BaseFacadeService<M extends AbstractEntity<ID>,ID extends java.io.Serializable> {
	/**
	 * 
	 * @param id
	 * @return
	 */
	public M findOne(ID id);
	/**
	 * 
	 * @param m
	 */
	public M save(M m);
	/**
	 * 
	 * @param m
	 * @return
	 */
	public void delete(M m);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public void delete(ID id);
	/**
	 * 查询全部
	 * @return
	 */
	public Iterable<M> findAll();
}
