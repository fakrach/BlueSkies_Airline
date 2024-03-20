package com.BlueSkies.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.BlueSkies.Services.AppUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.BlueSkies.Entity.AppUser;




@RestController("/User")
public class AppUserController {
    @Autowired
    private AppUserService appUserService;

    @GetMapping("/{id}")
    public AppUser getUser(@PathVariable long id){
        return appUserService.findById(id);
    }

    @GetMapping("/allUsers")
    public List<AppUser> getAllUsers() {
        return appUserService.allUsers();
    }
    
    
}
