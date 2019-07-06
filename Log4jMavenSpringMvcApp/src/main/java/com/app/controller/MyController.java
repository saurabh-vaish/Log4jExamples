package com.app.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *   For using log4j in webapp or spring app we need to mention a property file log4j.properties .  It reduces our code for writing loyout and appender again n again .
 *  
 *   SLF4J  ---> Simple Logging Facade for Java (SLF4J) serves as a simple facade or abstraction for various logging frameworks 
 *   			(e.g. java.util.logging, logback, log4j) allowing the end user to plug in the desired logging framework at deployment time.
 * 				i.e. we can change logger frameworks with out any change in code.
 * 				It provide loose coupling while only implementating Log4j provides tight coupling .
 * 
 * 				It only provides a layer for logger frameworks . it does not do logging .
 * 
 * 				Just define Slf4j object in class that needs logging , then logger will be decided at runtime
 * 
 * ***/

@Controller
public class MyController {
	
	private static final Logger log = Logger.getLogger(MyController.class);


	@RequestMapping("/reg")
	public String register()
	{
		log.info("register Method started");
		
		System.out.println("hii");
		
		log.info("register Method started");
		return "register";
	}
	
	@RequestMapping(value="/save")
	public String getRegister()
	{

		log.info("Save Method started");

		try{
			log.info("Before save employee.."); 
		
			System.out.println("saved");
			
			log.debug("emp saved with id "); 
		}
		catch(Exception e)
		{    
			log.error("exception"+e); // log.fatal(e); 
		}  
		log.warn("EMPID not used in program");  
		
		log.info("save service is at end");   
		
		return "success";
	}
	
	
	
}
