
package com.miportfolio.mrd.Interface;

import com.miportfolio.mrd.Entity.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IPersonaService {
  //Traer una lista de personas
  public List<Persona> getPersonas();

  //Guardar un objeto de tipo persona
  public void savePersona(Persona persona);
  
  //Eliminar un objeto de tipo persona
  public void deletePersona(Long id);
  
  //Buscar una persona por ID
  public Persona findPersona(Long id);
}
