package co.ro.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.ro.beans.Student;

@Configuration
public class configFile {

	@Bean("stdObj")
	public Student createStdObj() {
		Student std = new Student();
		
		return std;
	}
}
