package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {
	static Logger logger = LogManager.getLogger(Log4JDemo.class);
	public static void main(String[] args) {
		System.out.println("\n Hello world..!\n");
		logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.fatal("This is fatal message");
		
		System.out.println("\n completed..");
	}

}
