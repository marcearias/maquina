/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquina.app.repositories;

import com.rentamaquina.maquina.app.entities.Category;
import com.rentamaquina.maquina.app.repositories.crud.CategoryCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marcela Arias
 */
@Repository
public class CategoryRepository {
        
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;
    
    //Select
    public List<Category> getAll(){
        return (List<Category>) categoryCrudRepository.findAll();
    }
    
    /**
     * Insert
     * @param category
     * @return 
     */
    public Category save(Category category){
        return categoryCrudRepository.save(category);
    }
    
    /**
     * Buscar registro
     * @param categoryId
     * @return 
     */
    public Optional<Category> getCategory(int categoryId){
        return categoryCrudRepository.findById(categoryId);
    }
    
    /**
     * Delete
     * @param category 
     */
    public void delete(Category category){
        categoryCrudRepository.delete(category);
    }
}
