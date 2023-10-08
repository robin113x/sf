package co.ro.log;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Test {
	public static void main(String[] args) {
		
		Thread.currentThread().setName("Robin");
		
		BasicConfigurator.configure();
		
		Logger logger = Logger.getLogger("Test");
		logger.fatal("This is fatel message");
		logger.info("This is INFORMATIOn");
		
		
	}
}
