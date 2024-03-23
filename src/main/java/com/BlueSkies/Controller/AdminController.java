package com.BlueSkies.Controller;

import org.springframework.web.bind.annotation.RestController;


import com.BlueSkies.Entity.Admin;
import com.BlueSkies.Services.AdminService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/Admin")
public class AdminController {
    @Autowired
    private AdminService adminService;


    @GetMapping("/{id}")
    public Admin getAdmin(@PathVariable long id){
        return adminService.findById(id);
    }

    @GetMapping("/all")
    public List<Admin> getAllAdmin() {
        return adminService.allAdmin();
    }
    
    @PostMapping("/add")
    public Admin postMethodName(@RequestBody Admin admin) {
        return adminService.save(admin);
    }
    
     @PutMapping("/update")
    public Admin update(@RequestBody Admin admin){
        return adminService.update(admin);
    }
    @DeleteMapping("/Delete")
    public void delete(@RequestBody Admin admin){
        adminService.delete(admin);
    } 

    @DeleteMapping("/Delete/{id}")
    public void deleteById(@PathVariable Long id){
        adminService.deleteById(id);
    }
    

}
