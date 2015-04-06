package com.dpcbj.service.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;

public class ComConfig{

	final public static Logger logger = Logger.getLogger("ComServerConfig");
	private Map<String, Object> config = new HashMap<String, Object>();

	public ComConfig() {
		super();
	}
	
	
	public void contextInitialized(ServletContextEvent event) {
		initConfig(event);

	}

	private void initConfig(ServletContextEvent event) {
		config.put("ComServer", "localhost");

		try {
			String comServerIPs = event.getServletContext().getInitParameter("ComServerIPs");

			if (comServerIPs.trim().length() > 0) config.put("ComServer", comServerIPs.split(","));

		} catch (Exception e) {
			logger.log(Level.WARNING, "Configuration file does not exist or configuration is not complete, will use the default configuration.");
		}
	}
}
