
package com.miportfolio.mrd.Repository;

import com.miportfolio.mrd.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Integer>{
   public Optional<Experiencia> findByNombreE(String nombreE);
   public boolean existsByNombreE(String nombreE);
}
