package com.dpcbj.service.sign;

import java.util.Map;

import javax.servlet.http.HttpSession;

public class ServiceProcess extends BaseService{
	
	public String DetachSign(Map paraMap) {
		
		String signStr = "";
		HttpSession session = request.getSession();
		try {
			session.setAttribute("certinfo", paraMap.get("certinfo"));
			session.setAttribute("srcstr", paraMap.get("srcstr"));
		} catch (Exception e) {
			e.printStackTrace();	    
		}
		
		return signStr;
	}
}
