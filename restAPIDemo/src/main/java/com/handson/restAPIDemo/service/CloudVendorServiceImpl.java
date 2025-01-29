package com.handson.restAPIDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.handson.restAPIDemo.Exception.CloudVendorNotFoundException;
import com.handson.restAPIDemo.model.CloudVendor;
import com.handson.restAPIDemo.repository.CloudVendorRepository;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{

	CloudVendorRepository cloudVendorRepository;
	
	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository = cloudVendorRepository;
	}

	//POST
	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		 cloudVendorRepository.save(cloudVendor);
		 return "POST SUCCESS";
	}

	//GET
	@Override
	public CloudVendor getCloudVendor(String vendorID) {
		if(cloudVendorRepository.findById(vendorID).isEmpty())
			throw new CloudVendorNotFoundException("Requested vendor ID IS NOT PRSENT");
		return cloudVendorRepository.findById(vendorID).get();
	}

	//GET ALL
	@Override
	public List<CloudVendor> getAllCloudVendor() {
		return cloudVendorRepository.findAll();
	}

	//UPDATE
	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		 cloudVendorRepository.save(cloudVendor);
		 return "PUT SUCCESS";
	}

	//DELETE
	@Override
	public String deleteCloudVendor(String vendorID) {
		cloudVendorRepository.deleteById(vendorID);
		return "delete success";
	}
	

}
