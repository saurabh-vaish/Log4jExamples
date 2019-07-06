package com.app.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/***
 *  Spring boot can implement many Logging frameworks like SLF4J ,Log4j , javaUtil etc .
 *  Log4j is the fastest among all and widely used.
 *  By default in spring boot we can implement logging bcs its already present  
 *  We do not need to write any property file for log4j if we want to use defaults for log4j.
 *  If we want to modify any changes then write in application.properties ,  log4j.properties not needed here 
 * 
 * 
 * 
 * **/


@Component
public class MyRunner implements CommandLineRunner {

	
	private static Logger log = LogManager.getLogger(MyRunner.class);
	
	@Override
	public void run(String... args) throws Exception {

		log.info("inside run method");
		
		int a=10 ,b=5;
		if(a>10) {
			log.info("if block executed");
		}else {
			log.info("else block executed");
		}
		
		try {
			
			log.debug("inside try block");   // default mode info so it will not print , if we will not modify in application.properties
			
			if(a==10)
			{
				throw new RuntimeException("exception occured");
			}
		}
		catch (Exception e) {
			log.error("exception is = "+e);
		}
		
	}
	
}
