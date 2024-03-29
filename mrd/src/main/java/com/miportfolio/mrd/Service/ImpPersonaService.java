
package com.miportfolio.mrd.Service;

import com.miportfolio.mrd.Entity.Persona;
import com.miportfolio.mrd.Interface.IPersonaService;
import com.miportfolio.mrd.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonarepository;
    @Override
    public List<Persona> getPersonas() {
       List<Persona> personas = ipersonarepository.findAll();
       return personas;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonarepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonarepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonarepository.findById(id).orElse(null);
        return persona;
    }
    
}
