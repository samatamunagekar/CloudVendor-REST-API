package com.handson.restAPIDemo.service;

import java.util.List;

import com.handson.restAPIDemo.model.CloudVendor;

public interface CloudVendorService {

	public String createCloudVendor(CloudVendor cloudVendor);
	public CloudVendor getCloudVendor(String vendorID);
	public List<CloudVendor> getAllCloudVendor();
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String vendorID);
	
	
}
