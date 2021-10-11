/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquina.app.services;

import com.rentamaquina.maquina.app.entities.Category;
import com.rentamaquina.maquina.app.repositories.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Marcela Arias
 */
public class CategoryService {
        
    @Autowired
    private CategoryRepository repository;
    
    //GET
    public List<Category> getCategory(){
        return repository.findAll();
    }
    //POST
    public Category saveCategory(Category category){
        return repository.save(category);
    }
            //PUT
    public Category updateCategory(Category category){
        Category existingCategory = repository.findById(category.getId()).orElse(null);
        existingCategory.setName(category.getName());
        existingCategory.setDescription(category.getDescription());
        existingCategory.setMachines(category.getMachines());
        return repository.save(existingCategory);
    }
    //DELETE
    public String deleteCategory(int id){
        repository.deleteById(id);
        return "Categoria eliminada" + id;
    }
}
