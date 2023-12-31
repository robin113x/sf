package co.ro.log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test2 {
	public static void main(String[] args) throws SecurityException, IOException {
		FileHandler filehander = new FileHandler("C:\\Users\\robinr\\Documents\\SpringCourse\\text.log");
		
		SimpleFormatter simpleformatter = new SimpleFormatter();
		filehander.setFormatter(simpleformatter);
		
		
		Logger logger = Logger.getLogger("Test2");
		logger.addHandler(filehander);
		logger.log(Level.SEVERE, "This Is very Important ...");
		logger.log(Level.WARNING,"Warning Message");
		logger.log(Level.INFO,"Information ");
		
	}
}
