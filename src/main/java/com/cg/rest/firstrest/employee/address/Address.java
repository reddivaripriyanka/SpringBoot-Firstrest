package com.cg.rest.firstrest.employee.address;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String city;
	private int pincode;
	private int flatNumber;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, int pincode, int flatNumber) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.flatNumber = flatNumber;
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

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", flatNumber=" + flatNumber + "]";
	}
}
