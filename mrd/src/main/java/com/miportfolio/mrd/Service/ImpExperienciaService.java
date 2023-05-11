
package com.miportfolio.mrd.Service;

import com.miportfolio.mrd.Entity.Experiencia;
import com.miportfolio.mrd.Repository.IExperienciaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpExperienciaService {
    @Autowired IExperienciaRepository iExperienciaRepository;
    
    public List<Experiencia> list(){
        return iExperienciaRepository.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return iExperienciaRepository.findById(id);
    }
    
    public Optional<Experiencia> getByNombreE(String nombreE){
        return iExperienciaRepository.findByNombreE(nombreE);
    }
    
    public void save(Experiencia expe){
        iExperienciaRepository.save(expe);
    }
    
    public void delete(int id){
        iExperienciaRepository.deleteById(id);
    }
    
    public boolean exitsById(int id){
        return iExperienciaRepository.existsById(id);
    }
    
    public boolean exitsByNombreE(String nombreE){
        return iExperienciaRepository.existsByNombreE(nombreE);
    }
}

