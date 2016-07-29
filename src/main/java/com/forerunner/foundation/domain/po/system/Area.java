package com.forerunner.foundation.domain.po.system;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.forerunner.core.base.entity.AbstractEntity;

/**
 * 地址管理
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "s_area")
public class Area extends AbstractEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6349555435921094616L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	
	private String code;
	
	@Column(name="area_name")
	private String areaName;
	
	@Column(name="full_name")
	private String fullName;

	@ManyToOne(fetch = FetchType.LAZY)
	private Area parent;

	private int sequence;
	
	private int level;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Area getParent() {
		return parent;
	}

	public void setParent(Area parent) {
		this.parent = parent;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
