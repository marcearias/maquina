/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquina.app.repositories;

import com.rentamaquina.maquina.app.entities.Message;
import com.rentamaquina.maquina.app.repositories.crud.MessageCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marcela Arias
 */
@Repository
public class MessageRepository {
        
    @Autowired
    private MessageCrudRepository messageCrudRepository;
    
    //Select
    public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }
    
    /**
     * Insert
     * @param message
     * @return 
     */
    public Message save(Message message){
        return messageCrudRepository.save(message);
    }
    
    /**
     * Buscar registro
     * @param messageId
     * @return 
     */
    public Optional<Message> getMessage(int messageId){
        return messageCrudRepository.findById(messageId);
    }
    
    /**
     * Delete
     * @param message 
     */
    public void delete(Message message){
        messageCrudRepository.delete(message);
    }
}

