
package com.portfolio.Springboot.service;

import com.portfolio.Springboot.model.Usuario;
import java.util.List;

public interface UsuarioService {
    public List<Usuario> getUsuario();
    public void altaUsuario(Usuario usuario);
    public void bajaUsuario(Long id);
    public Usuario findUsuario(Long id);
    public void editUsuario(Usuario usuario);
    
}
