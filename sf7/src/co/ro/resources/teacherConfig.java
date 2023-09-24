package co.ro.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.ro.beans.Teacher;

@Configuration
public class teacherConfig {
	@Bean(name="tech")
	public Teacher tec() {
		Teacher teObj = new Teacher();
		teObj.setId(3);
		teObj.setName("Rexx");
		return teObj;
	}
}
