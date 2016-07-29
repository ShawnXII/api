package com.forerunner.foundation.domain.po.user;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.forerunner.core.base.entity.AbstractEntity;
import com.forerunner.foundation.domain.po.system.Role;
import com.google.common.collect.Sets;
/**
 * 帐号管理 (登录用)
 * @author Administrator
 */
@Entity
@Table(name="s_account")
public class Account extends AbstractEntity<String>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3178672940393513766L;
	
	//帐号ID uuid生成 可以与密码一起加密
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",length=64,unique=true)
	private String id;
	//密码 必填
	@Column(length=255,nullable=false)
	private String password;
	//用户名(可以为空)
	@Column(length=255)
	private String username;
	//手机号(通过验证则可以通过手机号登录,可以短信登录,短信找回密码,短信激活帐号)
	@Column(length=32)
	private String mobile;
	//邮箱(通过验证则可以进行邮箱登录,激活帐号)
	private String email;
	//支付密码(可以为空,需要进行支付则需要设置该密码)
	@Column(length=64)
	private String payPassword;
	//状态 0:资料未完善 1:资料完善 必填
	@Column(length=3)
	private int status;
	//手机验证是否通过 必填
	private boolean validateMobile=false;
	//邮箱验证是否通过 必填
	private boolean validateEmail=false;
	//帐号是否锁定 必填
	private boolean enablead=false;
	//帐号是否删除
	private boolean deleteStatus=false;
	//帐号注册时间
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time",updatable=false)
	private Date createTime;
	//帐号呢称
	private String nickname;
	//个人形象照
	@Column(name="image_according")
	private String imageAccording;
	//注册IP地址
	private String ip;
	//个人资料
	@OneToOne(optional = true, cascade = CascadeType.ALL, mappedBy="account")
	private PersonalInfo info;
	
	//个人权限
	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinTable(name = "account_role", 
    joinColumns = { @javax.persistence.JoinColumn(name = "account_id") }, 
    inverseJoinColumns = { @javax.persistence.JoinColumn(name = "role_id")  })
	private Set<Role> roles=Sets.newHashSet();
	
	@Transient
	private String jsonStr;
	
	
	@Override
	public String getId() {
		return id;
	}
	@Override
	public void setId(String id) {
		this.id=id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPayPassword() {
		return payPassword;
	}
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public boolean isValidateMobile() {
		return validateMobile;
	}
	public void setValidateMobile(boolean validateMobile) {
		this.validateMobile = validateMobile;
	}
	public boolean isValidateEmail() {
		return validateEmail;
	}
	public void setValidateEmail(boolean validateEmail) {
		this.validateEmail = validateEmail;
	}
	public boolean isEnablead() {
		return enablead;
	}
	public void setEnablead(boolean enablead) {
		this.enablead = enablead;
	}
	public boolean isDeleteStatus() {
		return deleteStatus;
	}
	public void setDeleteStatus(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getImageAccording() {
		return imageAccording;
	}
	public void setImageAccording(String imageAccording) {
		this.imageAccording = imageAccording;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public PersonalInfo getInfo() {
		return info;
	}
	public void setInfo(PersonalInfo info) {
		this.info = info;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", password=" + password + ", username=" + username + ", mobile=" + mobile
				+ ", email=" + email + ", payPassword=" + payPassword + ", status=" + status + ", validateMobile="
				+ validateMobile + ", validateEmail=" + validateEmail + ", enablead=" + enablead + ", deleteStatus="
				+ deleteStatus + ", createTime=" + createTime + ", nickname=" + nickname + ", imageAccording="
				+ imageAccording + ", ip=" + ip + ", info=" + info + ", roles=" + roles + "]";
	}
	
	public String getJsonStr() {
		return jsonStr;
	}
	public void setJsonStr(String jsonStr) {
		this.jsonStr = jsonStr;
	}
	
		
	
}
