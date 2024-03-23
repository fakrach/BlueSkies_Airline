package com.BlueSkies.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BlueSkies.Repository.AppUserRepository;
import com.BlueSkies.Entity.AppUser;

@Service
public class AppUserService {
    @Autowired
    private AppUserRepository appUserRepository;

    public long Count(){
        return appUserRepository.count();
    }

    public AppUser findById(long id){
        return appUserRepository.findById(id).orElseThrow();
    }
    public List<AppUser> allUsers(){
        return appUserRepository.findAll();
    }

    public AppUser save(AppUser user){
        return appUserRepository.save(user);
    }

    public AppUser update(AppUser user){
        AppUser current = appUserRepository.findById(user.getId()).orElseThrow();
        current.setEmail(user.getEmail());
        current.setFirstName(user.getFirstName());
        current.setLastName(user.getLastName());
        current.setPhoneNumber(user.getPhoneNumber());

        return appUserRepository.save(current);
    }

    public void deleteById(long id){
        appUserRepository.deleteById(id);
    }
    public void delete(AppUser user){
        appUserRepository.delete(user);
    }
}
