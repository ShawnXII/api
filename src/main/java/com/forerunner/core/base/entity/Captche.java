package com.forerunner.core.base.entity;

import java.awt.Color;
import java.awt.Font;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

import com.forerunner.core.util.CaptchaUtil;
import com.forerunner.core.util.CommUtil;
import com.forerunner.core.util.Constant;

/**
 * 验证码
 * @author Administrator
 */
public class Captche implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3406262522160871324L;
	//字体
	private Font font;
	//图片宽度
	private int width=96;
	//图片高度
	private int height=36;
	//图片格式
	private String format="JPEG";
	//颜色
	private Color color;
	//大小
	private int size=4;
	//干扰线数量
	private int lineNum;
	
	private HttpServletRequest request;
	
	private HttpServletResponse response;
	
	//存放类型 有session 和 cookie
	private String type="cookie";
	
	//存放的key
	private String key=Constant.CAPTCHA_DEFAULT_KEY;
	//存放的域 key
	private String field=Constant.CAPTCHA_FIELD;
	//字体的高度
	private int fontHeight;
	
	/**
	 * 
	 * @param request
	 */
	public Captche(HttpServletRequest request){
		this.request=request;
		int width=CommUtil.null2Int(this.request.getParameter("width"));
		if(width>0){
			this.width=width;
		}
		int height=CommUtil.null2Int(this.request.getParameter("height"));
		if(height>0){
			this.height=height;
		}
		int size=CommUtil.null2Int(this.request.getParameter("size"));
		if(size>0){
			this.size=size;
		}
		String key=CommUtil.null2String(this.request.getParameter("type"));
		if(!StringUtils.isBlank(key)){
			this.key=key;
		}
		this.color=CaptchaUtil.getRandomColor();
		this.font=CaptchaUtil.getFont(this.fontHeight);
		this.fontHeight=this.width-2<1?1:this.width-2;
	}
	
	public Captche(int width,int height){
		this.width=width;
		this.height=height;
		this.fontHeight=this.width-2<1?1:this.width-2;
		this.color=CaptchaUtil.getRandomColor();
		this.font=CaptchaUtil.getFont(this.fontHeight);		
	}
	
	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
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

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getLineNum() {
		return lineNum;
	}

	public void setLineNum(int lineNum) {
		this.lineNum = lineNum;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public int getFontHeight() {
		return fontHeight;
	}

	public void setFontHeight(int fontHeight) {
		this.fontHeight = fontHeight;
	}
	
	
	
}
