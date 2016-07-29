package com.forerunner.foundation.facade.system;

import java.util.List;

import com.forerunner.foundation.domain.po.system.AdminMenu;

public interface AdminMenuFacadeService  extends BaseFacadeService<AdminMenu,Long>{
	/**
	 * 获取当前菜单
	 * @return
	 */
	public List<AdminMenu> getCurrentMenu(Long id);
	
	
}
