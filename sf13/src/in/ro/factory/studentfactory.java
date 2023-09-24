package in.ro.factory;

import in.ro.beans.Student;

public class studentfactory {
	
	public  Student studFact() {
		
		return new Student(10);
	}

}
