package com.handson.restAPIDemo.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.handson.restAPIDemo.model.CloudVendor;

@DataJpaTest
public class CloudVendorRepositoryTest {
	
	//given, when, then
	
	@Autowired 
	private CloudVendorRepository  cloudVendorRepository;
	CloudVendor cloudVendor;
	
	@BeforeEach
	void setUp(){
		cloudVendor = new CloudVendor("1","sam","adr","123");
		cloudVendorRepository.save(cloudVendor);
		
	}
	@AfterEach
	void tearDown(){
		cloudVendor =null;
		cloudVendorRepository.deleteAll();	
	}
	
	//SUCCESS TEST
	@Test
	public void testFindByVendorName_Found() {
		List<CloudVendor>cloudVendorList = cloudVendorRepository.findByVendorName("sam");
		assertThat(cloudVendorList.get(0).getVendorID()).isEqualTo(cloudVendor.getVendorID());
		assertThat(cloudVendorList.get(0).getVendorAddress()).isEqualTo(cloudVendor.getVendorAddress());
	}
	
	//failure case
	@Test
	public void testFindByVendorName_NotFound() {
		List<CloudVendor>cloudVendorList = cloudVendorRepository.findByVendorName("amz");
		assertThat(cloudVendorList.isEmpty()).isTrue();
	}
	
	
	

}
