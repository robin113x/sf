package co.ro.beans;

public class Address {
	private String location;
	private String city;
	private int pincode;
	private String state;
	
	public Address(String location,String city,int pincode, String state) {
		this.location=location;
		this.city=city;
		this.pincode=pincode;
		this.state=state;
	}
	
	@Override
	public String toString() {
		return "Address [location=" + location + ", city=" + city + ", pincode=" + pincode + ", state=" + state + "]";
	}
	
}
