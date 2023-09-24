package in.ro.factoryStudent;

import in.ro.beans.Student;

public class studentfactory {
	
	public static Student studFact() {
		return new Student(10);
	}

}
