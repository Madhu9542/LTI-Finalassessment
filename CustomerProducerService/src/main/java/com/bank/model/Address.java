package com.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	
	@Id
	@Column(name="ADDRESS_ID")
	private Integer addressId;
	@Column(name="ADDRESS_STREET")
	private String street;
	@Column(name="ADDRESS_CITY")
	private String city;
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + "]";
	}
	public Address(Integer addressId, String street, String city, String state, String zipCode) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public Address() {
		super();
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Column(name="ADDRESS_STATE")
	private String state;
	@Column(name="ADDRESS_ZIPCODE")
	private String zipCode;
	

}
