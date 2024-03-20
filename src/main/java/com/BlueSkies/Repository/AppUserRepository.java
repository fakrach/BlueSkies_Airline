package com.BlueSkies.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BlueSkies.Entity.AppUser;
@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Long>{
    
}
