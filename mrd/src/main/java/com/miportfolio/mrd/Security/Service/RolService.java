
package com.miportfolio.mrd.Security.Service;

import com.miportfolio.mrd.Security.Entity.Rol;
import com.miportfolio.mrd.Security.Enums.RolNombre;
import com.miportfolio.mrd.Security.Repository.IRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
   @Autowired IRolRepository irolrepository;
   
   public Optional<Rol> getByRolNombre(RolNombre rolNombre){
     return irolrepository.findByRolNombre(rolNombre);
   }
   
   public void save(Rol rol){
       irolrepository.save(rol);
   }
}
