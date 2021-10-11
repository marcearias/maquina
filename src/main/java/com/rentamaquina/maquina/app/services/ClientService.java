/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquina.app.services;

import com.rentamaquina.maquina.app.entities.Client;
import com.rentamaquina.maquina.app.repositories.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author MarcelaArias
 */
@Service
public class ClientService {
    
    @Autowired
    private ClientRepository repository;
    
    //GET
    public List<Client> getClient(){
        return repository.findAll();
    }
    //POST
    public Client saveClient(Client client){
        return repository.save(client);
    }
        //PUT
    public Client updateClient(Client client){
        Client existingClient = repository.findById(client.getId()).orElse(null);
        existingClient.setName(client.getName());
        existingClient.setEmail(client.getEmail());
        existingClient.setAge(client.getAge());
        return repository.save(existingClient);
    }
    //DELETE
    public String deleteClient(int id){
        repository.deleteById(id);
        return "Cliente eliminado" + id;
    }
}
