package com.test.comm.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.test.comm.constant.GrantConstant;
import com.test.comm.constant.SystemConstant;
import com.test.comm.util.CommonUtil;
import com.test.comm.util.StringUtil;

/**
 * 权限过滤器
 *
 * @author 胡峰
 * @date 2017年5月5日 下午1:45:31
 * @version 1.0
 * @since
 */
public class AuthorityFilter implements Filter {

	// 不需要过滤的url
	private List<String> notAuthorityFilterUrl;

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;

		// 获取项目路径
		String contextPath = request.getContextPath();

		// 执行权限操作
		// 不需要过滤的url
		String result = notAuthorityFilterToUrl(request);

		// 拦截到攻击请求
		if (SystemConstant.REQUEST_ILLEGAL.equals(result)) {

			// 重定向到登录界面
			response.sendRedirect(contextPath + GrantConstant.LOGIN_URL);
			return;
		}
		
		// 请求需要进行权限控制
		if (SystemConstant.OPERA_NOT_PASS.equals(result)) {

			// 获取session会话,为空不创建
			HttpSession httpSession = request.getSession(false);
			if (httpSession == null || httpSession.getAttribute(SystemConstant.SECURITY_USER_INFO_CODE) == null) {

				// 重定向到登录界面
				response.sendRedirect(contextPath + GrantConstant.LOGIN_URL);
				return;
			}
		}

		// 继续往下执行，激活下一个相关的过滤器
		arg2.doFilter(arg0, arg1);
	}

	public void init(FilterConfig arg0) throws ServletException {

		// 初始化参数
		String notFilterUrl = arg0.getInitParameter("notFilterUrl");
		this.notAuthorityFilterUrl = Arrays.asList(notFilterUrl.split(","));
	}

	/**
	 * 不需要过滤的url
	 * 
	 * @param request
	 *            请求的request
	 * @return
	 */
	public String notAuthorityFilterToUrl(HttpServletRequest request) {

		// 获取当前请求的url
		String currentUri = request.getRequestURI();
		// 获取项目路径
		String contextPath = request.getContextPath();
		// 获取ip地址
		String ip = request.getRemoteAddr();
		// 
		Map<String, Object> map = request.getParameterMap();
		
		for (String key : map.keySet()) {

			// 对键进行过滤
			if (StringUtil.isNotEmpty(key) && CommonUtil.filterLoadClass(key)) {

				//TODO 打印日志
			}
			
			String[] contents=(String[]) map.get(key);
			for(String content:contents){
				
				if(CommonUtil.filterLoadClass(content)){
					
					//TODO 打印日志
				}
			}
			
		}

		List<String> requestList = new ArrayList<String>();

		requestList.add(SystemConstant.REQUEST_URL_ACTION);
		requestList.add(SystemConstant.REQUEST_URL_JSP);
		requestList.add(SystemConstant.REQUEST_URL_HTM);
		requestList.add(SystemConstant.REQUEST_URL_HTML);

		// 只拦截jsp，action，htm，html请求
		if (requestList.contains(StringUtil.captureLast(currentUri))) {

			// 客户登录不需要过滤
			if (currentUri.equals(contextPath + GrantConstant.LOGIN_URL) || currentUri.equals(contextPath + "/esteem/login.action")) {

				// 请求链接通过
				return SystemConstant.OPERA_PASS;
			}

			// 判断当前请求的url是否在配置中
			if (this.notAuthorityFilterUrl.contains(currentUri)) {

				return SystemConstant.OPERA_SUCCESS;
			} else {

				return SystemConstant.OPERA_NOT_PASS;
			}
		} else {

			// 请求链接通过
			return SystemConstant.OPERA_PASS;
		}
	}
}
