package com.test.product.user.man;

import java.util.List;

import com.test.product.user.model.SystemUsersRecord;


/**
 * 员工操作man
 * 
 * @author hufeng
 */
public interface SystemUsersMan{

	/**
	 * 查询员工信息
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<SystemUsersRecord> selectEmployee(SystemUsersRecord systemUsersRecord) throws Exception;
}
