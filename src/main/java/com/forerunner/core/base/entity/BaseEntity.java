package com.forerunner.core.base.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @param <ID>
 */
@MappedSuperclass
public abstract class BaseEntity<ID extends java.io.Serializable> extends AbstractEntity<ID>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3789944415663626578L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_TIME",nullable=true,insertable=false)
	private Date updateTime=new Date();
	
	@Column(name="UPDATE_BY",nullable=true,insertable=false)
	private String updateBy;
	
	@Column(name="CREATE_BY",nullable=false,updatable=false)
	private String createBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_TIME",nullable=false,updatable=false)
	private Date createTime=new Date();

	@Column(name="REMARKS")
	private String remarks;
	
	
	@Column(name="DELETE_STATUS")
	private Boolean deleteStatus;

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Boolean getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	
	@Override
	public ID getId() {
		return id;
	}

	@Override
	public void setId(ID id) {
		this.id=id;
	}
	
}
