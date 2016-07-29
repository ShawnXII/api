package com.forerunner.foundation.facade.system;

import java.util.List;

import com.forerunner.foundation.domain.po.system.Resource;

public interface ResourceFacadeService extends BaseFacadeService<Resource,String>{
	/**
	 * 初始化系统资源
	 */
	public void init(List<Resource> resource);
	
}
