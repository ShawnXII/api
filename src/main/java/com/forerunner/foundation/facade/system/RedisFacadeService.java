package com.forerunner.foundation.facade.system;

import java.util.Set;

/**
 * Redis操作开放接口
 * @author Administrator
 *
 */
public interface RedisFacadeService {
	/**
	 * 通过key删除
	 * @param key
	 * @return
	 */
	public abstract Long del(String... key);
	/**
	 * 添加key-value 并且设置存活时间
	 * @param set
	 * @param value
	 * @param liveTime 单位秒
	 */
	public abstract void set(byte[] set,byte[] value,long liveTime);
	/**
	 * 添加key-value 并且设置存活时间
	 * @param key
	 * @param value
	 * @param liveTime 单位秒
	 */
	public abstract void set(String key,String value,long liveTime);
	/**
	 * 添加key-value
	 * @param key
	 * @param value
	 */
	public abstract void set(String key,String value);
	/**
	 * 添加key-value
	 * @param key
	 * @param value
	 */
	public abstract void set(byte[] key,byte[] value);
	/**
	 * 获取 Redis value
	 * @param key
	 * @return
	 */
	public abstract String get(String key);
	/**
	 * 检查key是否存在
	 * @param key
	 * @return
	 */
	public abstract boolean exists(String key);
	/**
	 * 清空所有数据
	 * @return
	 */
	public abstract boolean flush();
	/**
	 * 查看redis里面有多少条数据
	 * @return
	 */
	public abstract long size();
	/**
	 * 检查redis是否连接成功
	 * @return
	 */
	public abstract String ping();
	/**
	 * 通过正则匹配keys
	 * @param pattern
	 * @return
	 */
	public abstract Set<String> keys(String pattern);
}
