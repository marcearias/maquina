/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquina.app.services;

import com.rentamaquina.maquina.app.entities.Message;
import com.rentamaquina.maquina.app.repositories.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author MarcelaArias
 */
@Service
public class MessageService {
    
    @Autowired
    private MessageRepository repository;
    
    //GET
    public List<Message> getMessage(){
        return repository.findAll();
    }
    //POST
    public Message saveMessage(Message message){
        return repository.save(message);
    }
            //PUT
    public Message updateMessage(Message message){
        Message existingMessage = repository.findById(message.getId()).orElse(null);
        existingMessage.setMessageText(message.getMessageText());
        return repository.save(existingMessage);
    }
    //DELETE
    public String deleteMessage(int id){
        repository.deleteById(id);
        return "Mensaje eliminado" + id;
    }
}
