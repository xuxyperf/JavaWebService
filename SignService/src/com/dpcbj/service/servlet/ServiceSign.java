package com.dpcbj.service.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dpcbj.service.sign.ServiceComLoad;
import com.dpcbj.service.sign.ServiceInterface;
import com.dpcbj.service.sign.ServiceVSTK;

public class ServiceSign extends HttpServlet{
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			doPost(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String signStr = "",connCom = "";
		String comServer = getServletContext().getInitParameter("ComServerIPs");
		if(comServer != null)
		{
			connCom = ServiceComLoad.BalanceServer(comServer);
		}
		String certInfo = request.getParameter("certinfo").toString();
		String srcStr = request.getParameter("srcstr").toString();
		String callKing = request.getParameter("callkind").toString();
		if(callKing.equalsIgnoreCase("B"))
		{
			signStr = ServiceInterface.SignWJComProcess(certInfo, srcStr,connCom);
		}
		else if(callKing.equalsIgnoreCase("A"))
		{
			signStr = ServiceVSTK.SignVSTKProcess(certInfo, srcStr);
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String docType = 
				"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0"+
						"Transitional//EN\">\n";
		out.println(docType+
				"<HTML>\n"+
				"<HEAD><TITLE>BocDetachSign</TITLE></HEAD>\n"+
				"<BODY BGCOLOR =\"#FDF5E6\">\n"+
				"<SignStr>"+ signStr +"</SignStr>\n"+
				"</BODY></HTML>");
	}
}
