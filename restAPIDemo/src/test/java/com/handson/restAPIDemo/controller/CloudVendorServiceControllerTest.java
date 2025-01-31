package com.handson.restAPIDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.handson.restAPIDemo.model.CloudVendor;
import com.handson.restAPIDemo.service.CloudVendorService;

@WebMvcTest(CloudVendorAPIController.class)
public class CloudVendorServiceControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private  CloudVendorService cloudVendorService;
	CloudVendor cloudVendorOne;
	CloudVendor cloudVendorTwo;
	List<CloudVendor> cloudVendorList = new ArrayList<>();
	
	@BeforeEach
	void setUp() {
		cloudVendorOne = new CloudVendor("1","amz","adr","xyxyx");
		cloudVendorTwo = new CloudVendor("12","ayy","adr12","xyyyyyx");
		cloudVendorList.add(cloudVendorOne);
		cloudVendorList.add(cloudVendorTwo);
	}
	
	@AfterEach
	void tearDown(){
	}	

}
