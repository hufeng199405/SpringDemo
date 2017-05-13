package com.test.comm.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.comm.constant.SystemConstant;
import com.test.product.user.model.SystemUsersRecord;

public class AutoSetUserAdapterFilter implements Filter {

	public void destroy() {
		

	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		String remoteUser = request.getRemoteUser();
		
		if (remoteUser != null) {

/*			// CAS账号登录信息 ，账号编号&修改时间
			String[] arr = remoteUser.split(SystemConstant.CAS_PARAM_SPLIT_FLAG);

			String casAccountCode = arr[0];
			long casModifyTime = Long.parseLong(arr[1]);*/
			
			//获取当前会话中的客户信息
			SystemUsersRecord systemUsersRecord=(SystemUsersRecord) request.getAttribute(SystemConstant.SESSION_VALID_CUSTOMER_SIGN);
			Cookie[] aa=request.getCookies();
			System.out.println(aa);
		}
		
		arg2.doFilter(request, response);
	}

	public void init(FilterConfig arg0) throws ServletException {
		

	}

}
