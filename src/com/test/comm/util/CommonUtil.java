package com.test.comm.util;
/** 
 * 通用工具类
 *
 * @author  胡峰 
 * @date    2017年5月6日 上午10:17:04 
 * @version 1.0   
 * @since   
 */
public class CommonUtil {

	// 攻击请求URL
	private static String[] filterLoadClassArrays = { "classloader", "class." };
	
	/**
	 * 验证请求是否含有攻击代码
	 * 
	 * @param key
	 * @return true为包含攻击代码
	 */
	public static boolean filterLoadClass(String key) {

		boolean result = false;

		for (String filterLoadClass : filterLoadClassArrays) {

			if (key.contains(filterLoadClass)) {

				result = true;
				break;
			}
		}

		return result;
	}
}
