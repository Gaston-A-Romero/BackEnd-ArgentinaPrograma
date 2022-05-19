
package com.portfolio.Springboot.controller;

import com.portfolio.Springboot.model.Usuario;
import com.portfolio.Springboot.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
    @Autowired
    private UsuarioService userSer;
    @GetMapping
    public List<Usuario> getUsuario(){
        return userSer.getUsuario();
    }
    @PostMapping
    public String altaUsuario(@RequestBody Usuario usuario){
        userSer.altaUsuario(usuario);
        return "Usuario creado...";
        
    }
    @DeleteMapping("/del/{id}")
    public String altaUsuario(@PathVariable Long id){
        userSer.bajaUsuario(id);
        return "Usuario eliminado...";
    }
    @PutMapping("/edit/{id}")
    public Usuario editUsuario(@PathVariable Long id,
            @RequestParam ("mail") String new_mail,
            @RequestParam ("password") String new_password){
        
        Usuario user = userSer.findUsuario(id);
        user.setMail(new_mail);
        user.setPassword(new_password);
        userSer.altaUsuario(user);
        return user;
        
    }
    
    
    
    
}
