package com.handson.restAPIDemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handson.restAPIDemo.model.CloudVendor;

@RestController
@RequestMapping("/api")
public class CloudVendorAPIService {
	
	CloudVendor cloudVendor;
	
	//GET CLOUD VENDOR DETAILS
	@GetMapping("{vendorID}")
	public CloudVendor getCloudVendorDetails(String vendorID) {
		return  cloudVendor;
				//("C1","Samata","Bangalore","xyzxyzxyz");
	}
	
	//ADD DETAILS TO DATABASE
	@PostMapping
	public  String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor= cloudVendor;
		return "Cloud Vendor Details added successfully";
	}
	
	//UPDATE THE VENDOR DETAILS
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor= cloudVendor;
		return "Cloud Vendor Details UPDATED succcessfully";
	}
	
	//DELETE VENDOR DETAILS
	@DeleteMapping("{vendorID}")
	public String deleteCloudVendorDetails(String vendorID) {
		this.cloudVendor = null;
		return "CLoud Vendor Deleted successfully";
	}
}
