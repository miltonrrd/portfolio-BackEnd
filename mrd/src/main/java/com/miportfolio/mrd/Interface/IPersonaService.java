
package com.miportfolio.mrd.Interface;

import com.miportfolio.mrd.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //Traer una lista de personas
    public List<Persona> getPersonas();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Borrar un objeto de tipo Persona
    public void deletePersona(Long id);
    
    //Buscar un objeto de tipo Persona
    public Persona findPersona(Long id);
}
