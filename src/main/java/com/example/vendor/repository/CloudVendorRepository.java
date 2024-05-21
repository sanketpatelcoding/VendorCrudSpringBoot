package com.example.vendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vendor.model.CloudVendor;

@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
