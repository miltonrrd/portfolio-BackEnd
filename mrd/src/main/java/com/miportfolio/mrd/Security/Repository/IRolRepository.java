
package com.miportfolio.mrd.Security.Repository;

import com.miportfolio.mrd.Security.Entity.Rol;
import com.miportfolio.mrd.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
