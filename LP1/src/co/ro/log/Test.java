package co.ro.log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("Test");
		logger.log(Level.SEVERE, "This Is very Important ...");
		logger.log(Level.WARNING,"Warning Message");
		logger.log(Level.INFO,"Information ");
		
	}
}
