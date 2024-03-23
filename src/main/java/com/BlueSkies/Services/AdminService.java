package com.BlueSkies.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BlueSkies.Entity.Admin;
import com.BlueSkies.Repository.AdminRepository;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    
    public long Count(){
        return adminRepository.count();
    }

    public Admin findById(long id){
        return adminRepository.findById(id).orElseThrow();
    }
    public List<Admin> allAdmin(){
        return adminRepository.findAll();
    }

    public Admin save(Admin admin){
        return adminRepository.save(admin);
    }

    public Admin update(Admin admin){
        Admin current = adminRepository.findById(admin.getId()).orElseThrow();
        current.setEmail(admin.getEmail());
        current.setFirstName(admin.getFirstName());
        current.setLastName(admin.getLastName());
        current.setPhoneNumber(admin.getPhoneNumber());

        return adminRepository.save(current);
    }

    public void deleteById(long id){
        adminRepository.deleteById(id);
    }
    public void delete(Admin admin){
        adminRepository.delete(admin);
    }
}
