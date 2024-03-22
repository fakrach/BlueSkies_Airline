package com.BlueSkies.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.BlueSkies.Entity.Booking;
import com.BlueSkies.Services.BookingService;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/booking")
public class BookingController {
     @Autowired
    private BookingService bookingService;

    @GetMapping("/{id}")
    public Booking getUser(@PathVariable Long id){
        return bookingService.findById(id);
    }

    @GetMapping("/all")
    public List<Booking> getAllUsers() {
        return bookingService.allBooking();
    }
    
    @PostMapping("/add")
    public Booking insert(@RequestBody Booking booking) {
        return bookingService.save(booking);
    }
    @PutMapping("/update")
    public Booking update(@RequestBody Booking booking){
        return bookingService.update(booking);
    }
    @DeleteMapping("/Delete")
    public void delete(@RequestBody Booking booking){
        bookingService.delete(booking);
    } 

    @DeleteMapping("/Delete/{id}")
    public void deleteById(@PathVariable Long id){
        bookingService.deleteById(id);
    }
}
