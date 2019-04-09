package com.capgemini.spring.organization;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Address {
	
	@Value("331")
	private int doorNumber;

	@Value("balaji")
	private String Street;

	@Value("tangutur")
	private String cityName;

	@Value("AP")
	private String state;
	

	@Value("523275")
	private int pincode;
	
	public Address() {
		super();
	}
	public Address(int doorNumber, String street, String cityName, String state, int pincode) {
		super();
		this.doorNumber = doorNumber;
		this.Street = street;
		this.cityName = cityName;
		this.state = state;
		this.pincode = pincode;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		this.Street = street;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", Street=" + Street + ", cityName=" + cityName + ", state="
				+ state + ", pincode=" + pincode + "]";
	}
	

}
