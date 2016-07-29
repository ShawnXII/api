package com.forerunner.foundation.domain.po.system;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.forerunner.core.base.entity.AbstractEntity;
import com.google.common.collect.Lists;
/**
 * 资源表(没有创建时间字段)
 * @author admin
 *
 */
@Entity
@Table(name="s_resource")
public class Resource extends AbstractEntity<String>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1930898424511737335L;
	
	//资源名称
	@Column(name ="RES_NAME",length=64)
	private String resName;
	//资源
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="URI",length=255,unique = true, nullable = false)
	private String uri;
	//来源
	@Column(name ="SOURCE",length=24)
	private String source;
	//分组
	@Column(name ="GROUP_BY",length=255)
	private String group;
	//资源类别
	@Column(name ="TYPE",length=255)
	private String type;
	//资源所在类
	@Column(name ="CLASS_NAME",length=255)
	private String className;
	//资源访问方式
	@Column(name ="REQUEST_MODE",length=255)
	private String requestMode;
	//资源的方法名称
	@Column(name ="FUN_NAME",length=255)
	private String funName;
	
	
	@Column(name ="INFO",length=255)
	private String info;
	/**
	 * 角色列表
	 */
	@ManyToMany(mappedBy = "res", targetEntity = Role.class, fetch = FetchType.LAZY,cascade = { javax.persistence.CascadeType.ALL })
	private List<Role> roles=Lists.newArrayList();
	//是否有效
	@Column(name ="ENABLED",length=255)
	private boolean enabled=true;
	

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getRequestMode() {
		return requestMode;
	}

	public void setRequestMode(String requestMode) {
		this.requestMode = requestMode;
	}

	public String getFunName() {
		return funName;
	}

	public void setFunName(String funName) {
		this.funName = funName;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String getId() {
		return uri;
	}

	@Override
	public void setId(String id) {
		this.uri=id;	
	}	
	
}
