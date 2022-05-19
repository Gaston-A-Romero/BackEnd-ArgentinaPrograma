package com.portfolio.Springboot.service;

import com.portfolio.Springboot.model.Usuario;
import com.portfolio.Springboot.repository.UsuarioRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UsuarioServiceImplementado implements UsuarioService{
    
    @Autowired
    private UsuarioRepository userRep;

    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> listaUsuario = userRep.findAll();
        return listaUsuario;
    }

    @Override
    public void altaUsuario(Usuario usuario) {
          userRep.save(usuario);
    }

    @Override
    public void bajaUsuario(Long id) {
        userRep.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
        Usuario usuario = userRep.findById(id).orElse(null);
        return usuario;
    }

    @Override
    public void editUsuario(Usuario usuario) {
        userRep.save(usuario);
    }
    
   
    
}
