package com.BlueSkies.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    public Booking getUser(@PathVariable long id){
        return bookingService.findById(id);
    }

    @GetMapping("/allBooking")
    public List<Booking> getAllUsers() {
        return bookingService.allBooking();
    }
    
    @PostMapping("/add")
    public Booking postMethodName(@RequestBody Booking booking) {
        return bookingService.save(booking);
    }
}
