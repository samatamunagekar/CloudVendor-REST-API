package com.handson.restAPIDemo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.handson.restAPIDemo.model.CloudVendor;
import com.handson.restAPIDemo.repository.CloudVendorRepository;

public class CloudVendorServiceImplTest {
	
	@Mock
	private CloudVendorRepository cloudVendorRepository;
	private CloudVendorService cloudVendorService;
	AutoCloseable autoCloseable;
	CloudVendor cloudVendor;
	
	@BeforeEach
	void setUp() {
		autoCloseable = MockitoAnnotations.openMocks(this);
		cloudVendorService  = new CloudVendorServiceImpl(cloudVendorRepository);
		cloudVendor = new CloudVendor("1","amz","adr","xyxyx");
	}
	
	@AfterEach
	void tearDown() throws Exception {
		autoCloseable.close();
	}
	
	@Test
	void testcreateCloudVendor() {
		mock(CloudVendor.class);
		mock(CloudVendorRepository.class);
		
		when(cloudVendorRepository.save(cloudVendor)).thenReturn(cloudVendor);
		assertThat(cloudVendorService.createCloudVendor(cloudVendor)).isEqualTo("POST SUCCESS");
		
	}
	
	@Test
	void testupdateCloudVendor() {
		mock(CloudVendor.class);
		mock(CloudVendorRepository.class);
		
		when(cloudVendorRepository.save(cloudVendor)).thenReturn(cloudVendor);
		assertThat(cloudVendorService.updateCloudVendor(cloudVendor)).isEqualTo("PUT SUCCESS");
		
	}
	
	@Test
	void testgetCloudVendor() {
		mock(CloudVendor.class);
		mock(CloudVendorRepository.class);
		
		when(cloudVendorRepository.findById("1")).thenReturn(Optional.ofNullable(cloudVendor));
		assertThat(cloudVendorService.getCloudVendor("1").getVendorAddress()).isEqualTo(cloudVendor.getVendorAddress());
	}
	
	@Test
	void testgetAllCloudVendor() {
		mock(CloudVendor.class);
		mock(CloudVendorRepository.class);
		
		when(cloudVendorRepository.findAll()).thenReturn(new ArrayList<CloudVendor>(Collections.singleton(cloudVendor)));
		assertThat(cloudVendorService.getAllCloudVendor().get(0).getVendorName()).isEqualTo(cloudVendor.getVendorName());	
		}
	
	@Test
	void testdeleteCloudVendor() {
		mock(CloudVendor.class);
		mock(CloudVendorRepository.class,Mockito.CALLS_REAL_METHODS);
		
		doAnswer(Answers.CALLS_REAL_METHODS).when(cloudVendorRepository).deleteById(any());
		assertThat(cloudVendorService.deleteCloudVendor("1")).isEqualTo("delete success");
	}

}
