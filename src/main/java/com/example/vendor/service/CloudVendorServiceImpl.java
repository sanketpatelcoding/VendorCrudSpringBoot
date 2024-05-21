package com.example.vendor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.vendor.model.CloudVendor;
import com.example.vendor.repository.CloudVendorRepository;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

	CloudVendorRepository cloudVendorRepository;//dep. injection
	
	//depend. injection using constructor
	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		// TODO Auto-generated method stub
		
		cloudVendorRepository.save(cloudVendor);
		return " Vendor created";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		// TODO Auto-generated method stub
		cloudVendorRepository.save(cloudVendor);
		return "Vendor updated ";
	}

	@Override
	public String deleteCloudVendor(String vendorId) {
		// TODO Auto-generated method stub
		 cloudVendorRepository.deleteById(vendorId); 
		return vendorId+"deleteed";
	}

	@Override
	public CloudVendor getCloudVendor(String vendorId) {
		// TODO Auto-generated method stub
	 //Object cv=	cloudVendorRepository.findById(vendorId);
	//	return (CloudVendor) cv;
		return cloudVendorRepository.findById(vendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {
		// TODO Auto-generated method stub
		
		return cloudVendorRepository.findAll();
	}

}
