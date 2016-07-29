package com.forerunner.foundation.domain.po.system;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.forerunner.core.base.entity.BaseEntity;
/**
 * 系统设置
 * 网站全局配置
 * @author Administrator
 *
 */
@Entity
@Table(name="s_config")
public class Config extends BaseEntity<Long>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7740959361217576456L;
	//站点主标题
	private String title;
	//公司信息 255
	@Column(length=512,name="company_info")
	private String companyInfo;
	//站点网址 255
	private String address;
	//网站关键字  255
	private String keywords;
	//系统语言
	@Column(length=512,name="sys_language")
	private String sysLanguage="zh";
	//网站描述 255
	private String description;
	//默认图片
	@Column(length=64,name="default_img")
	private String defaultImg;
	//网站logo
	@Column(length=64,name="website_logo")
	private String websiteLogo;
	//图片服务器地址
	@Column(length=64,name="image_web_path")
	private String imageWebPath;
	//默认会员图像
	@Column(length=64,name="member_image")
	private String memberImage;
	//默认供应商图像
	@Column(length=64,name="store_image")
	private String storeImage;
	//系统图标 系统初始化时把图像
	private String favicon;
	//网站作者
	private String author;
	//状态 0:启用 1:禁用 
	@Column(length=2)
	private int status=1;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompanyInfo() {
		return companyInfo;
	}
	public void setCompanyInfo(String companyInfo) {
		this.companyInfo = companyInfo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getSysLanguage() {
		return sysLanguage;
	}
	public void setSysLanguage(String sysLanguage) {
		this.sysLanguage = sysLanguage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDefaultImg() {
		return defaultImg;
	}
	public void setDefaultImg(String defaultImg) {
		this.defaultImg = defaultImg;
	}
	public String getWebsiteLogo() {
		return websiteLogo;
	}
	public void setWebsiteLogo(String websiteLogo) {
		this.websiteLogo = websiteLogo;
	}
	public String getImageWebPath() {
		return imageWebPath;
	}
	public void setImageWebPath(String imageWebPath) {
		this.imageWebPath = imageWebPath;
	}
	public String getMemberImage() {
		return memberImage;
	}
	public void setMemberImage(String memberImage) {
		this.memberImage = memberImage;
	}
	public String getStoreImage() {
		return storeImage;
	}
	public void setStoreImage(String storeImage) {
		this.storeImage = storeImage;
	}
	public String getFavicon() {
		return favicon;
	}
	public void setFavicon(String favicon) {
		this.favicon = favicon;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Config [title=" + title + ", companyInfo=" + companyInfo + ", address=" + address + ", keywords="
				+ keywords + ", sysLanguage=" + sysLanguage + ", description=" + description + ", defaultImg="
				+ defaultImg + ", websiteLogo=" + websiteLogo + ", imageWebPath=" + imageWebPath + ", memberImage="
				+ memberImage + ", storeImage=" + storeImage + ", favicon=" + favicon + ", author=" + author
				+ ", status=" + status + "]";
	}
	
}
