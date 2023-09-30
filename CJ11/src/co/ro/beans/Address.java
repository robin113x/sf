package co.ro.beans;

public class Address {
	private String location;
	private String city;
	private int pincode;

	

	public void setLocation(String location) {
		this.location = location;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



	@Override
	public String toString() {
		return "Address [location=" + location + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
