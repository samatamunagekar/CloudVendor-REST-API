package com.handson.restAPIDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handson.restAPIDemo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{

}
