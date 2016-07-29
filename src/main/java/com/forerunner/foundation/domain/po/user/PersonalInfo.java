package com.forerunner.foundation.domain.po.user;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.forerunner.core.base.entity.AbstractEntity;

/**
 * 个人信息
 * 
 * @author Administrator
 */
@Entity
@Table(name = "s_personal_info")
public class PersonalInfo extends AbstractEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7302924962745557602L;

	@OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "accountId", referencedColumnName = "id", unique = false)
	private Account account;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 64, unique = true)
	private Long id;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

}
