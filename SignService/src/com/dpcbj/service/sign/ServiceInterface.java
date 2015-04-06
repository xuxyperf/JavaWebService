package com.dpcbj.service.sign;

import java.io.IOException;
import java.net.UnknownHostException;

import com.jacob.activeX.*;
import com.jacob.com.*;
import com.dpcbj.service.jitvctk.*;
import com.linar.jintegra.Cleaner;
import com.linar.jintegra.AuthInfo;

public class ServiceInterface {

	public static void main(String args[]) { 
		SignJacobProcess("CN=normal, E=normal@jit.com.cn, O=jit, C=cn","Xuxy"); 
    } 

/*	public static void main(String args[]) { 
		SignWJComProcess("C=CN, O=BANK OF CHINA, OU=TEST, CN=≤‚ ‘…Ãªß","Xuxy"); 
	}	*/

	public static String SignJacobProcess(String certInfo,String srcStr){

		/*System.out.println(Runtime.getRuntime().freeMemory());  
		System.out.println(Runtime.getRuntime().totalMemory());*/

		String signStr = "";
		ActiveXComponent sign = new ActiveXComponent("JITComVCTK.JITDSign");
		try
		{
			ComThread.InitSTA();
			Dispatch signPatch = (Dispatch)sign.getObject();
			//Dispatch.put((Dispatch) sign, "Visible", new Variant(true)); 
			Variant vCertInfo = new Variant(certInfo, true);
			Variant vSrcStr = new Variant(srcStr, true);
			signStr = signPatch.call(signPatch,"DetachSign",vCertInfo,vSrcStr).getString();
			vCertInfo.safeRelease();
			vCertInfo = null;
			vSrcStr.safeRelease();
			vSrcStr = null;
			signPatch.safeRelease();
			signPatch = null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			sign.safeRelease();
			sign = null;
			ComThread.Release();
		}

		return signStr;
	}

	public static String SignWJComProcess(String certInfo,String srcStr,String host)
	{
		String signStr = "";
/*	    String domain = "home-xy";
	    String user = "signuser";
	    String password = "signuser";*/		
		try
		{
			JITDSign sign = null;
			//AuthInfo.setDefault(domain, user, password);
			try
			{
				//com.linar.jintegra.
				Cleaner.trackObjectsInCurrentThread();
				sign = new JITDSign(host);
				signStr = sign.detachSign(certInfo, srcStr);
			}
			catch(UnknownHostException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					if(sign != null)
					{
						sign.release();
						sign = null;
					}
					Cleaner.releaseAllInCurrentThread();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		finally
		{
			//Cleaner.releaseAll();
		}

		return signStr;
	}
}
