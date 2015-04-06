package com.dpcbj.service.sign;

import com.dpcbj.service.utils.DPCUtils;

import cn.com.jit.assp.dsign.DSign;

public class ServiceVSTK{
	
	public static String SignVSTKProcess(String certInfo,String srcStr)
	{
		String response = null;
		DSign ds = null;
		try
		{
			ds = new DSign();
			ds.init(DPCUtils.getConfigPath() + "cssconfig.properties");
			byte[] srcode = srcStr.getBytes();
			response = ds.detachSign(certInfo, srcode);
			if(response == null)
			{
				return ds.getErrorCode() + ds.getErrorMessage().toString();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			ds  = null;
		}
		
		return response;
	}
}
