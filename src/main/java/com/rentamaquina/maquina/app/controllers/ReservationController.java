/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquina.app.controllers;

import com.rentamaquina.maquina.app.entities.Reservation;
import com.rentamaquina.maquina.app.services.ReservationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Marcela Arias
 */
public class ReservationController {
    @Autowired
    private ReservationService service;
    
   @GetMapping("/all")
   public List<Reservation> findAllReservation(){
       return service.getReservation();
   }
   
   @PostMapping("/save")
   public ResponseEntity addReservation(@RequestBody Reservation reservation){
       service.saveReservation(reservation);
       return ResponseEntity.status(201).build();
   }
   @PutMapping("/update")
   public ResponseEntity updateReservation(@RequestBody Reservation reservation){
       service.updateReservation(reservation);
       return ResponseEntity.status(201).build();
   }
   @DeleteMapping("/delete")
   public ResponseEntity deleteReservation(@RequestBody Reservation reservation){
       service.deleteReservation(reservation.getIdReservation());
       return ResponseEntity.status(204).build();
   }
}
