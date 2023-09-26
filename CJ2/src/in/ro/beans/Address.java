package in.ro.beans;

public class Address {
	private String houseno;
	private String city;
	private int pincode;

	public String getHouseno() {
		return houseno;
	}

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String toString() {
		return houseno+" : "+city+" : "+pincode;
		
	}
}
