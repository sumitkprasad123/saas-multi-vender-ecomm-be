package com.coderai.ecommerce.vendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.coderai.ecommerce.vendor.entity.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {
    // TODO: add query methods
}
