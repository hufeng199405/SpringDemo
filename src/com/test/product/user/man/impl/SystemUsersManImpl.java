package com.test.product.user.man.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.comm.base.BaseMan;
import com.test.product.user.dao.SystemUsersRecordMapper;
import com.test.product.user.man.SystemUsersMan;
import com.test.product.user.model.SystemUsersRecord;
import com.test.product.user.model.SystemUsersRecordExample;

/**
 * 员工实现类
 * 
 * @author hufeng
 */
@Service("systemUsersManImpl")
public class SystemUsersManImpl extends BaseMan implements SystemUsersMan {

	@Resource
	private SystemUsersRecordMapper systemUsersRecordMapper;

	/**
	 * 员工查询
	 */
	public List<SystemUsersRecord> selectEmployee(SystemUsersRecord systemUsersRecord) throws Exception {

		SystemUsersRecordExample recordExample = new SystemUsersRecordExample();

		SystemUsersRecordExample.Criteria criteria = recordExample.createCriteria();

		criteria.andUserLoginNameEqualTo(systemUsersRecord.getUserLoginName());
		criteria.andUserLoginPasswordEqualTo(systemUsersRecord.getUserLoginPassword());

		return this.systemUsersRecordMapper.selectByExample(recordExample);
	}

}
