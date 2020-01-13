/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CrudSpring;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author carlos
 */
public interface PersonaRepository extends Repository<Persona, Long>{
    
    List<Persona> findAll();
    Persona findById(Long id);
    Persona save(Persona p);
    Persona delete(Persona p);
}
