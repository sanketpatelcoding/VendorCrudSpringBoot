package com.example.vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties.Couchbase;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vendor.model.CloudVendor;
import com.example.vendor.service.CloudVendorService;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorController {

	
	
//public	CloudVendor cloudVendor;
	
	//this dep. injection from service layer

CloudVendorService cloudVendorService;
//public CloudVendorController(){}
//constructor dependency injection
	public CloudVendorController(CloudVendorService cloudVendorService) {
	super();
	this.cloudVendorService = cloudVendorService;
}

	@GetMapping("/")
	public String hello() {
		return "namaste";

	}

	@GetMapping("/{vendorId}")
	public CloudVendor getVendorInfo(@PathVariable String vendorId) {
	//	 return new CloudVendor("3","fssccvsvf","dfetrbdfb","dfbbbbbbdf");
		
	//	return cloudVendor;
		return cloudVendorService.getCloudVendor(vendorId);
	}
	@GetMapping("/vendorsList/")
	public List<CloudVendor> getAllCloudVendorInfo() {
		 return cloudVendorService.getAllCloudVendor(); 
	}

	@PostMapping("/{vendorId}")
	public String setVendorInfo(@RequestBody CloudVendor cloudVendor) {
		//this.cloudVendor = cloudVendor;
		cloudVendorService.createCloudVendor(cloudVendor);
		
		return "set";

	}

	@PutMapping("/{vendorId}")
	public String updateVendorInfo(@RequestBody CloudVendor cloudVendor) {
		//this.cloudVendor = cloudVendor;
		
		cloudVendorService.updateCloudVendor(cloudVendor);
		
		return "updated";

	}

	@DeleteMapping("/{vendorId}")
	public String deleteVendor(@PathVariable String vendorId) {
		//this.cloudVendor=cloudVendor;
		cloudVendorService.deleteCloudVendor(vendorId);
		return "record Deleted";

	}

}
