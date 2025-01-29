package com.handson.restAPIDemo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handson.restAPIDemo.Response.ResponseHandler;
import com.handson.restAPIDemo.model.CloudVendor;
import com.handson.restAPIDemo.service.CloudVendorService;

@RestController
@RequestMapping("/api")
public class CloudVendorAPIController {
	
	CloudVendorService cloudVendorService;
	
	public CloudVendorAPIController(CloudVendorService cloudVendorService) {
		this.cloudVendorService = cloudVendorService;
	}

	//GET CLOUD VENDOR DETAILS
	@GetMapping("{vendorID}")
	public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorID") String vendorID) {
		return ResponseHandler.responseBuilder("Requested Details are being rendered", HttpStatus.OK,cloudVendorService.getCloudVendor(vendorID));
		
	}
	
	@GetMapping()
	 public List<CloudVendor> getAllCloudVendorDetails() {
		return cloudVendorService.getAllCloudVendor();
	}
	
	//ADD DETAILS TO DATABASE
	@PostMapping
	public  String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		 cloudVendorService.createCloudVendor(cloudVendor);
		 return "POSTTT";
		
	}
	
	//UPDATE THE VENDOR DETAILS
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.updateCloudVendor(cloudVendor);
		return "Cloud Vendor Details UPDATED succcessfully";
	}
	
	//DELETE VENDOR DETAILS
	@DeleteMapping("{vendorID}")
	public String deleteCloudVendorDetails(@PathVariable("vendorID")String vendorID) {
		cloudVendorService.deleteCloudVendor(vendorID);
		return "CLoud Vendor Deleted successfully";
	}
}
