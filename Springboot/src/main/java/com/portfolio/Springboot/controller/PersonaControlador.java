
package com.portfolio.Springboot.controller;

import com.portfolio.Springboot.model.Persona;
import com.portfolio.Springboot.service.PersonaService;
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
@RequestMapping("/persona")
public class PersonaControlador {
    @Autowired
    private PersonaService perSer;
    @GetMapping
    public List<Persona> getPersona(){
        return perSer.getPersona();
    
    }
    @PostMapping
    public String altaPersona(@RequestBody Persona persona){
        perSer.altaPersona(persona);
        return "Persona creada...";
    }    
    @DeleteMapping("/del/{id}")
    public String bajaPersona(@PathVariable Long id){
        perSer.bajaPersona(id);
        return "Persona eliminada...";
    }
    @PutMapping("/edit/{id}")
    public Persona editPersona(@PathVariable Long id,                                
                                @RequestParam ("nombreP") String new_nombre,
                                @RequestParam ("titulo") String new_titulo,
                                @RequestParam ("puesto_actual") String new_puesto_actual,                                
                                @RequestParam ("about_me") String new_about_me,
                                @RequestParam ("url_img_perfil") String img_perfil,
                                @RequestParam ("url_banner") String banner,
                                @RequestParam ("url_github") String github,
                                @RequestParam ("url_instagram") String instagram,
                                @RequestParam ("url_linkedin") String linkedin                                
                                ){
        Persona persona = perSer.findPersona(id);
        
 
        persona.setNombreP(new_nombre);
        persona.setPuesto_actual(new_puesto_actual);
        persona.setTitulo(new_titulo);
        persona.setAbout_me(new_about_me);
        persona.setUrl_img_perfil(img_perfil);
        persona.setUrl_banner(banner);
        persona.setUrl_github(github);
        persona.setUrl_instagram(instagram);
        persona.setUrl_linkedin(linkedin);
    
        perSer.altaPersona(persona);
        return persona;
    }
    
    
    
    
    
    
}
