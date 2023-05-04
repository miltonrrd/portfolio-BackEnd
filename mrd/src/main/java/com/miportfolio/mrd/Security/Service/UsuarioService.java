package com.miportfolio.mrd.Security.Service;

import com.miportfolio.mrd.Security.Entity.Usuario;
import com.miportfolio.mrd.Security.Repository.IUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    IUsuarioRepository iusuariorepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return iusuariorepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean exitsByNobreUsuario(String nombreUsuario) {
        return iusuariorepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean exitsByEmail(String email) {
        return iusuariorepository.existsByEmail(email);
    }

    public void save(Usuario usuario) {
        iusuariorepository.save(usuario);
    }
}
