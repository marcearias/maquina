/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquina.app.services;

import com.rentamaquina.maquina.app.entities.Machine;
import com.rentamaquina.maquina.app.repositories.MachineRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author MarcelaArias
 */
@Service
public class MachineService {
    
    @Autowired
    private MachineRepository repository;
    
    //GET 
    public List<Machine> getMachine(){
        return repository.findAll();
    }
    //POST
    public Machine saveMachine(Machine machine){
        return repository.save(machine);
    }
    //PUT
    public Machine updateMachine(Machine machine){
        Machine existingMachine = repository.findById(machine.getId()).orElse(null);
        existingMachine.setBrand(machine.getBrand());
        existingMachine.setYear(machine.getYear());
        existingMachine.setCategory(machine.getCategory());
        existingMachine.setName(machine.getName());
        existingMachine.setDescription(machine.getDescription());
        existingMachine.setMessages(machine.getMessages());
        existingMachine.setReservations(machine.getReservations());
        return repository.save(existingMachine);

    }
    //DELETE
    public String deleteMachine(int id){
        repository.deleteById(id);
        return "Maquina eliminada" + id;
    }
}
