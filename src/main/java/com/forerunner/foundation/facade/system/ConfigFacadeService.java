package com.forerunner.foundation.facade.system;

import com.forerunner.foundation.domain.po.system.Config;
/**
 * 系统配置
 * @author Administrator
 */
public interface ConfigFacadeService extends BaseFacadeService<Config,Long>{
	/**
	 * 获取系统配置
	 * @return
	 */
	public Config getConfig();
}
