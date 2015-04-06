package com.dpcbj.service.sign;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.log4j.Logger;

public abstract class BaseService {
	public HttpServletRequest request = null;

	public HttpServletResponse response = null;

	//public static final Logger logger = Logger.getLogger(BaseService.class);

	public void init(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

	public void distory() {
		this.request = null;
		this.response = null;
	}

}
