package com.BlueSkies.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.BlueSkies.Services.AppUserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.BlueSkies.Entity.AppUser;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;








@RestController
@RequestMapping("/user")
public class AppUserController {
    @Autowired
    private AppUserService appUserService;

    @GetMapping("/{id}")
    public AppUser getUser(@PathVariable long id){
        return appUserService.findById(id);
    }

    @GetMapping("/all")
    public List<AppUser> getAllUsers() {
        return appUserService.allUsers();
    }
    
    @PostMapping("/add")
    public AppUser postMethodName(@RequestBody AppUser user) {
        return appUserService.save(user);
    }
    
     @PutMapping("/update")
    public AppUser update(@RequestBody AppUser appUser){
        return appUserService.update(appUser);
    }
    @DeleteMapping("/Delete")
    public void delete(@RequestBody AppUser appUser){
        appUserService.delete(appUser);
    } 

    @DeleteMapping("/Delete/{id}")
    public void deleteById(@PathVariable Long id){
        appUserService.deleteById(id);
    }
    
}
