package com.logger.programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertiesFileLog4jExample {
	static Logger log=Logger.getLogger(PropertiesFileLog4jExample.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("This is the information");
		log.warn("This is the warning");
		log.debug("This is debuging");
	}

}
