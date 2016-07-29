package com.forerunner.foundation.facade.user;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Order;

import com.forerunner.core.Exception.ServiceException;
import com.forerunner.foundation.domain.po.user.Account;
import com.forerunner.foundation.facade.system.BaseFacadeService;

public interface AccountFacadeService extends BaseFacadeService<Account,String>{
	/**
	 * 根据用户名/手机号/邮箱获取用户
	 * @param username
	 * @return
	 * @throws ServiceException
	 */
	public Account getAccount(String username) throws ServiceException;
	/**
	 * 用户注册
	 * @param username
	 * @param password
	 * @param ip
	 * @return
	 * @throws ServiceException
	 */
	public boolean register(String username,String password,String ip)throws ServiceException;
	/**
	 * 分页查询
	 * @param pageSize
	 * @param pageIndex
	 * @param orders
	 * @return
	 */
	public Page<Account> findList(int pageSize,int pageIndex,List<Order> orders);
	/**
	 * 分页查询
	 * @param pageSize
	 * @param pageIndex
	 * @return
	 */
	public Page<Account> findList(int pageSize,int pageIndex);	
}
