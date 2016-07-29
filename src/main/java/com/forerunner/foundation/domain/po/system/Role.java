package com.forerunner.foundation.domain.po.system;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.forerunner.core.base.entity.AbstractEntity;
import com.forerunner.foundation.domain.po.user.Account;
import com.google.common.collect.Sets;
/**
 * 角色表
 * 一个用户只拥有一个角色
 */
@Entity
@Table(name="s_role")
public class Role extends AbstractEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3014689191542962656L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	//角色名称
	@Column(name="role_name",length=64)
	private String roleName;
	//角色类型
	@Column(name="type",length=24)
	private String type;
	//角色说明
	@Column(name="info",length=255)
	private String info;
	//角色编号
	@Column(name="role_code",length=64)
	private String roleCode;
	//排序号
	@Column(name="sequence")
	private int sequence;
	
	@ManyToMany(targetEntity = Resource.class, fetch = FetchType.LAZY,cascade = { javax.persistence.CascadeType.ALL })
	@JoinTable(name = "role_res", joinColumns = { @javax.persistence.JoinColumn(name = "role_id") }, inverseJoinColumns = { @javax.persistence.JoinColumn(name = "res_id") })
	private Set<Resource> res=new TreeSet<Resource>();
	
	@ManyToMany(mappedBy = "roles")
	private Set<Account> accounts=Sets.newHashSet();
	 
	@Override
	public Long getId() {
		return id;
	}
	@Override
	public void setId(Long id) {
		this.id=id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public Set<Resource> getRes() {
		return res;
	}
	public void setRes(Set<Resource> res) {
		this.res = res;
	}
	public Set<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", type=" + type + ", info=" + info + ", roleCode="
				+ roleCode + ", sequence=" + sequence + ", res=" + res + ", accounts=" + accounts + "]";
	}
	
}
