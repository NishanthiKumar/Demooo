package com.logger.programs;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class FirstProgram {
	static Logger log= Logger.getLogger(FirstProgram.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("hii");
		log.debug("hello");
		log.error("error");
		log.fatal("fatal critical error");
		
		
	}

}
