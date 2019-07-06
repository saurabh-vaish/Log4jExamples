package com.app.test;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

/***
 * 	Logging -->  It is the process to trace all types of messages when any request processed by server .
 * 
 * 		To perform Logging  three components needed ---   Logger   Appender    Layout 
 * 
 * 		For in simple Java Application--
 * 
 * 			1.  Create a Logger Object  in class in which need logging.
 * 
 * 			2.  Define a layout  ( Simple  Xml, Html, ****Pattern)
 * 		
 * 			3.  With given layout Define a appender (Console , ***File ,Smtp , Jdbc, Telnet )	
 * 	
 * 			4.  Add that appender to logger 
 * 
 * 
 * 		Dependency ---  Log4j
 *  
 * 
 * **/

public class Test {

	// creating logger object
	private static final Logger logger = Logger.getLogger(Test.class);
	
	
	public static void main(String[] args) throws IOException {

		// Define layout 
		Layout layout = new PatternLayout("%d{dd-MM-yy hh:ss:SSS} %c -%M [%p] %m %n");
		
		// definer appender with this layout
//		Appender appender = new ConsoleAppender(layout);
		Appender appender = new FileAppender(layout,"loggger.log");
		
		// add appender to logger
		logger.addAppender(appender);
		
		
		logger.info("info message");
		
		logger.warn("warn message");
		
		logger.debug("debug message");
		
		logger.error("error message");

		logger.fatal("fatal message");
		
		
		
	}

}
