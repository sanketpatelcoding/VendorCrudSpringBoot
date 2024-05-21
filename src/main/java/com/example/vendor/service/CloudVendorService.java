package com.example.vendor.service;

import java.util.List;

import com.example.vendor.model.CloudVendor;

public interface CloudVendorService {
	
	public String	createCloudVendor(CloudVendor cloudVendor);
	public String   updateCloudVendor(CloudVendor cloudVendor);
	public String   deleteCloudVendor( String vendorId);
		public	CloudVendor	getCloudVendor(String vendorId);
		public		List<CloudVendor>	getAllCloudVendor();

}
