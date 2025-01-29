package com.handson.restAPIDemo.model;

public class CloudVendor {
	
	private String vendorID;
	private String vendorName;
	private String vendorAddress;
	private String vendorNumber;
	
	public CloudVendor() {
		super();
	}

	public CloudVendor(String vendorID, String vendorName, String vendorAddress, String vendorNumber) {
		super();
		this.vendorID = vendorID;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorNumber = vendorNumber;
	}

	public String getVendorID() {
		return vendorID;
	}

	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVendorNumber() {
		return vendorNumber;
	}

	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}
}
