/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquina.app.repositories;

import com.rentamaquina.maquina.app.entities.Machine;
import com.rentamaquina.maquina.app.repositories.crud.MachineCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marcela Arias
 */
@Repository
public class MachineRepository {
        
    @Autowired
    private MachineCrudRepository machineCrudRepository;
    
    //Select
    public List<Machine> getAll(){
        return (List<Machine>) machineCrudRepository.findAll();
    }
    
    /**
     * Insert
     * @param machine
     * @return 
     */
    public Machine save(Machine machine){
        return machineCrudRepository.save(machine);
    }
    
    /**
     * Buscar registro
     * @param machineId
     * @return 
     */
    public Optional<Machine> getMachine(int machineId){
        return machineCrudRepository.findById(machineId);
    }
    
    /**
     * Delete
     * @param machine 
     */
    public void delete(Machine machine){
        machineCrudRepository.delete(machine);
    }
}
