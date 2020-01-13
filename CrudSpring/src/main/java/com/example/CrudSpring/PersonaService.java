
package com.example.CrudSpring;

import java.util.List;

public interface PersonaService {
    
    List<Persona> listar();
    Persona listaId(Long id);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id);
}
