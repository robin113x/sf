package co.ro.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import co.ro.beans.Student;

@Configuration
@PropertySource("/co/ro/resources/student.properties")
public class configFile {
	@Value("${Student.name}")
	private String name;
	
	@Value("${Student.roll}")
	private int roll;
	@Bean("stdObj")
	public Student createStdObj() {
		Student std = new Student();
		std.setName(name);
		std.setRoll(roll);
		return std;
	}
}
