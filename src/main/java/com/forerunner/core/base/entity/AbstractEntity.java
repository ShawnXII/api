package com.forerunner.core.base.entity;

import java.io.Serializable;
/**
 *
 * @author admin
 *
 * @param <ID>
 */
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7965146210646715902L;
	
	public abstract ID getId();
	
	public abstract void setId(ID id);
	
	public boolean isNew(){
		return getId()==null;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
