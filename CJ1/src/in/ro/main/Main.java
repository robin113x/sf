package in.ro.main;

import in.ro.beans.Address;
import in.ro.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add = new Address();
		add.setCity("patna");
		add.setHouseno("111");
		add.setPincode(800024);
		
		Student std = new Student();
		std.setAddress(add);
		std.setName("robin");
		std.setRoll(121);
		
		std.display();
				
	}

}
