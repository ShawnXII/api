package com.forerunner.foundation.domain.po.system;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.forerunner.core.base.entity.BaseEntity;
import com.google.common.collect.Lists;

/**
 * 后台菜单
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "s_admin_menu")
public class AdminMenu extends BaseEntity<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8898681653797580674L;
	// 菜单标题
	private String title;
	// 菜单类型
	private String url;
	// 打开方式 _self _blank ...
	private String target;
	// 排序
	private Integer sequence;
	// 菜单等级
	private Integer level;
	
	private String icon;
	
	//菜单是否禁用
	private boolean enablead=false;

	@Column(name = "parent_id")
	private Long parentId;
	@Transient
	private AdminMenu parent;
	@Transient
	private List<AdminMenu> childs = Lists.newArrayList();
	// 当前访问菜单
	@Transient
	private List<AdminMenu> currentMenu = Lists.newArrayList();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public AdminMenu getParent() {
		return parent;
	}

	public void setParent(AdminMenu parent) {
		this.parent = parent;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public List<AdminMenu> getChilds() {
		return childs;
	}

	public void setChilds(List<AdminMenu> childs) {
		this.childs = childs;
	}

	public List<AdminMenu> getCurrentMenu() {
		return currentMenu;
	}

	public void setCurrentMenu(List<AdminMenu> currentMenu) {
		this.currentMenu = currentMenu;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public boolean isEnablead() {
		return enablead;
	}

	public void setEnablead(boolean enablead) {
		this.enablead = enablead;
	}
}
