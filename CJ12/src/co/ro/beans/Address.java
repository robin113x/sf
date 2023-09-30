package co.ro.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Magarpatta")
	private String location;
	@Value("pune")
	private String city;
	@Value("123456")
	private int pincode;

	



	@Override
	public String toString() {
		return "Address [location=" + location + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
