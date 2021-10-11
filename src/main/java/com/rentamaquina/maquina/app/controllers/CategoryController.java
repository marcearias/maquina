/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquina.app.controllers;

import com.rentamaquina.maquina.app.entities.Category;
import com.rentamaquina.maquina.app.services.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Marcela Arias
 */
public class CategoryController {
    @Autowired
    private CategoryService service;
    
   @GetMapping("/all")
   public List<Category> findAllCategory(){
       return service.getCategory();
   }
   
   @PostMapping("/save")
   public ResponseEntity addCategory(@RequestBody Category category){
       service.saveCategory(category);
       return ResponseEntity.status(201).build();
   }
   @PutMapping("/update")
   public ResponseEntity updateCategory(@RequestBody Category category){
       service.updateCategory(category);
       return ResponseEntity.status(201).build();
   }
   @DeleteMapping("/delete")
   public ResponseEntity deleteCategory(@RequestBody Category category){
       service.deleteCategory(category.getId());
       return ResponseEntity.status(204).build();
   }
}
