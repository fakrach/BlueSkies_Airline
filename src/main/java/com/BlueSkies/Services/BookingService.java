package com.BlueSkies.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.BlueSkies.Entity.Booking;
import com.BlueSkies.Repository.BookingRepository;


@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

        public long AppUserCount(){
        return bookingRepository.count();
    }

    public Booking findById(long id){
        return bookingRepository.findById(id).orElseThrow();
    }
    public List<Booking> allBooking(){
        return bookingRepository.findAll();
    }

    public Booking save(Booking user){
        return bookingRepository.save(user);
    }

    public Booking update(Booking booking){
        Booking current = bookingRepository.findById(booking.getId()).orElseThrow();
        current.setId(booking.getId());
        current.setNumberOfTicket(booking.getNumberOfTicket());
        current.setTotalPrice(booking.getTotalPrice());
        current.setFlight(booking.getFlight());
        current.setUser(booking.getUser());
        return bookingRepository.save(current);
    }

    public void deleteById(long id){
        bookingRepository.deleteById(id);
    }
    public void delete(Booking user){
        bookingRepository.delete(user);
    }
    
}
