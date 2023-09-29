package in.robin.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.robin.beans.Student;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("/in/robin/resources/applicationContext.xml");
		BeanFactory container = new XmlBeanFactory(resource);
		Student std=(Student)container.getBean("stdObj");
		std.dispaly();
		System.out.println(std.toString());
	}

}
