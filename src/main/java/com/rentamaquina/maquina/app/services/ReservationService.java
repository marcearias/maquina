/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquina.app.services;

import com.rentamaquina.maquina.app.entities.Reservation;
import com.rentamaquina.maquina.app.repositories.ReservationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Marcela Arias
 */
public class ReservationService {
            
    @Autowired
    private ReservationRepository repository;
    
    //GET
    public List<Reservation> getReservation(){
        return repository.findAll();
    }
    //POST
    public Reservation saveReservation(Reservation reservation){
        return repository.save(reservation);
    }
    //PUT
    public Reservation updateReservation(Reservation reservation){
        Reservation existingReservation = repository.findById(reservation.getIdReservation()).orElse(null);
        existingReservation.setStartDate(reservation.getStartDate());
        existingReservation.setDevolutionDate(reservation.getDevolutionDate());
        existingReservation.setStatus(reservation.getStatus());
        existingReservation.setMachine(reservation.getMachine());
        existingReservation.setMessages(reservation.getMessages());
        existingReservation.setClient(reservation.getClient());
        return repository.save(existingReservation); 
    }
    //DELETE
    public String deleteReservation(int id){
        repository.deleteById(id);
        return "Reservacion eliminada" + id;
    }
}
