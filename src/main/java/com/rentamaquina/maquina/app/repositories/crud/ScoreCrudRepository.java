/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquina.app.repositories.crud;

import com.rentamaquina.maquina.app.entities.Score;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Marcela Arias
 */
public interface ScoreCrudRepository extends CrudRepository<Score,Integer> {
    
}