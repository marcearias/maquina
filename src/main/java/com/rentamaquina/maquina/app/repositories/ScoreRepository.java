/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquina.app.repositories;

import com.rentamaquina.maquina.app.entities.Score;
import com.rentamaquina.maquina.app.repositories.crud.ScoreCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marcela Arias
 */
@Repository
public class ScoreRepository {
        
    @Autowired
    private ScoreCrudRepository scoreCrudRepository;
    
    //Select
    public List<Score> getAll(){
        return (List<Score>) scoreCrudRepository.findAll();
    }
    
    /**
     * Insert
     * @param score
     * @return 
     */
    public Score save(Score score){
        return scoreCrudRepository.save(score);
    }
    
    /**
     * Buscar registro
     * @param scoreId
     * @return 
     */
    public Optional<Score> getScore(int scoreId){
        return scoreCrudRepository.findById(scoreId);
    }
    
    /**
     * Delete
     * @param score 
     */
    public void delete(Score score){
        scoreCrudRepository.delete(score);
    }
}
