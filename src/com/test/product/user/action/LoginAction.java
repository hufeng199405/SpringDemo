package com.test.product.user.action;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.comm.base.BaseAction;
import com.test.comm.constant.SystemConstant;
import com.test.product.user.man.SystemUsersMan;
import com.test.product.user.model.SystemUsersRecord;

@Controller
@RequestMapping("/esteem")
public class LoginAction extends BaseAction {

	@Resource
	private SystemUsersMan systemUsersManImpl;

	@RequestMapping("/login")
	public String login(SystemUsersRecord systemUsersRecord) throws Exception {

		List<SystemUsersRecord> userRecords = this.systemUsersManImpl.selectEmployee(systemUsersRecord);

		// 判断不为空
		if(userRecords!=null && userRecords.size()>0){
			
			// 缓存用户信息
			request.getSession().setAttribute(SystemConstant.SESSION_VALID_CUSTOMER_SIGN, userRecords.get(0));
			// 生成安全随机码
			String uuid = UUID.randomUUID().toString();
			request.getSession().setAttribute(SystemConstant.SECURITY_USER_INFO_CODE, uuid);
		}else{
			
			return "/esteem/index.html";
		}

		return "/esteem/buttons.html";
	}
	
	@RequestMapping("/reLogin")
	public String reLogin(SystemUsersRecord systemUsersRecord) throws Exception {

		return "/esteem/index.html";
	}
}
