package in.ro.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ro.beans.Student;

@Configuration
public class springConfigFile {

	@Bean(name="aishu")
	public Student stdObj() {
		return new Student();
	}
}
