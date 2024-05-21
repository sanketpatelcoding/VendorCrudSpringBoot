package com.example.vendor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
	

	@Id
	private String vendorId;
	private String 	vendorName;
	private String  vendorAddress;
	private String  vendorphoneNumber;

	CloudVendor(){
		
	}

	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorphoneNumber) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorphoneNumber = vendorphoneNumber;
	
	}

	
		
	
	
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
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
	public String getVendorphoneNumber() {
		return vendorphoneNumber;
	}
	public void setVendorphoneNumber(String vendorphoneNumber) {
		this.vendorphoneNumber = vendorphoneNumber;
	}

	@Override
	public String toString() {
		return "CloudVendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
				+ ", vendorphoneNumber=" + vendorphoneNumber + "]";
	}
	
	
	
}
