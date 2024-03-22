package com.BlueSkies.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BlueSkies.Entity.Flight;
import com.BlueSkies.Repository.FlightRepository;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public long AppUserCount(){
        return flightRepository.count();
    }

    public Flight findById(long id){
        return flightRepository.findById(id).orElseThrow();
    }
    public List<Flight> allFlight(){
        return flightRepository.findAll();
    }

    public Flight save(Flight flight){
        return flightRepository.save(flight);
    }

    public Flight update(Flight flight){
        Flight current = flightRepository.findById(flight.getId()).orElseThrow();
        current.setArrivalTime(flight.getArrivalTime());
        current.setAvailableSeats(flight.getAvailableSeats());
        current.setDeparture(flight.getDeparture());
        current.setDepartureTime(flight.getDepartureTime());
        current.setDestination(flight.getDestination());
        current.setPrice(flight.getPrice());
        current.setTotalSeates(flight.getTotalSeates());
        return flightRepository.save(current);
    }

    public void deleteById(long id){
        flightRepository.deleteById(id);
    }
    public void delete(Flight flight){
        flightRepository.delete(flight);
    }
    
}
