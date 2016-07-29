package com.forerunner.foundation.domain.po.system;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.forerunner.core.base.entity.AbstractEntity;
import com.forerunner.foundation.domain.po.user.Account;

/**
 * 图片管理
 * @author Administrator
 */
@Entity
@Table(name="s_accessory")
public class Accessory extends AbstractEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 711689032093701177L;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id=id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",length=64,unique=true)
	private Long id;
	//图片访问地址
	private String path;
	//图片后缀
	private String suffix;
	//图片信息
	private String info;
	//创建时间
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;
	//图片大小
	private BigDecimal size;
	//图片宽
	private Double width;
	//图片高
	private Double height;
	//文件名称
	@Column(name="file_name")
	private String fileName;	
	//上传人
	private Account createBy;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigDecimal getSize() {
		return size;
	}

	public void setSize(BigDecimal size) {
		this.size = size;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Account getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Account createBy) {
		this.createBy = createBy;
	}
	
	
}
