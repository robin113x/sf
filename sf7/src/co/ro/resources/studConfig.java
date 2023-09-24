package co.ro.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.ro.beans.Student;

@Configuration
public class studConfig {

	@Bean(name="stdObj")
	public Student stds() {
		Student std = new Student();
		std.setName("Robin");
		std.setRoll(114);
		return std;
	}
}
