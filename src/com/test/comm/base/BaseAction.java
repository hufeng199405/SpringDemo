package com.test.comm.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ModelAttribute;


public class BaseAction{

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected final Logger logger= Logger.getLogger(this.getClass().getName());
	
	@ModelAttribute
	public void getxx(HttpServletRequest request,HttpServletResponse response){
		
		this.request=request;
		this.response=response;
	}
}
