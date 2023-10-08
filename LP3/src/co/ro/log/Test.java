package co.ro.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test {
	public static void main(String[] args) {
		
		Thread.currentThread().setName("Robin");
		
		PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/co/ro/resources/log.properties");
		
		Logger logger = Logger.getLogger("Test");
		logger.fatal("This is fatel message");
		logger.info("This is INFORMATIOn");
		
		
	}
}
