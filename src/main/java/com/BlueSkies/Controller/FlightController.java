package com.BlueSkies.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.BlueSkies.Entity.Flight;
import com.BlueSkies.Services.FlightService;

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
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    private FlightService flightService;

     @GetMapping("/{id}")
    public Flight getUser(@PathVariable long id){
        return flightService.findById(id);
    }

    @GetMapping("/all")
    public List<Flight> getAllFlight() {
        return flightService.allFlight();
    }
    
    @PostMapping("/add")
    public Flight postMethodName(@RequestBody Flight flight) {
        return flightService.save(flight);
    }
    
     @PutMapping("/update")
    public Flight update(@RequestBody Flight flight){
        return flightService.update(flight);
    }
    @DeleteMapping("/Delete")
    public void delete(@RequestBody Flight flight){
        flightService.delete(flight);
    } 

    @DeleteMapping("/Delete/{id}")
    public void deleteById(@PathVariable Long id){
        flightService.deleteById(id);
    }
    
}
