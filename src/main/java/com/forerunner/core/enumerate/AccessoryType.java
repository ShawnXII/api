package com.forerunner.core.enumerate;
/**
 * 图片类型
 * 大小后缀统一在这里进行管理
 * @author Administrator
 */
public enum AccessoryType {
	
	PERSONAL_IMAGE(480,480,"all");
	//图片宽
	private int width;
	//图片高
	private int height;
	//图片后缀
	private String suffix;
	
	private AccessoryType(int width, int height, String suffix) {
		this.width = width;
		this.height = height;
		this.suffix = suffix;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	
	
}
