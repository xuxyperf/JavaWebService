package com.dpcbj.service.utils;

public class DPCUtils {
	
	private static String FIELD_SEPERATOR = "/";

	private static String UNDER_ROOT = "WEB-INF/";
	
	public static String getRealPath() {
		String temPath = "/"
				+ new DPCUtils().getClass().getProtectionDomain()
						.getCodeSource().getLocation().getPath();
		if (temPath.startsWith(FIELD_SEPERATOR))
			temPath = temPath.substring(1);
		String webContentPath = temPath.substring(0, temPath
				.indexOf(UNDER_ROOT));
		return webContentPath;
	}
	
	public static String getConfigPath() {
		return getRealPath() + "WEB-INF/config/";
	}
}
