package com.BlueSkies.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BlueSkies.Entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long>{
    
}
