/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquina.app.repositories;

import com.rentamaquina.maquina.app.entities.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Marcela Arias
 */
public interface MachineRepository extends JpaRepository<Machine,Integer>{
    
}
