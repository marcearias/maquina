/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquina.app.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
/**
 *
 * @author MarcelaArias
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="machine")
public class Machine implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private String brand;
    private int model;
  //@Column(name="category_id")
    private int category_id;
    private String name;
}
