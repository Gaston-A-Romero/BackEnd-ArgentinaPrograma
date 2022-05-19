package com.portfolio.Springboot.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long idPer;
    private String nombreP;
    private String titulo;
    private String puesto_actual;
    private String about_me;
    private String url_img_perfil;
    private String url_banner;
    private String url_github;
    private String url_instagram;
    private String url_linkedin;

   
  
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSk")
    private List<Skill> listaSkills;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_edu")
    private List<Educacion> listaEdu;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_exp")
    private List<Experiencia_Laboral> listaExpL;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro")
    private List<Proyecto> listaProyecto;
    
    
    public Long getIdPer() {
        return idPer;
    }

    public void setIdPer(Long idPer) {
        this.idPer = idPer;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPuesto_actual() {
        return puesto_actual;
    }

    public void setPuesto_actual(String puesto_actual) {
        this.puesto_actual = puesto_actual;
    }

    public String getAbout_me() {
        return about_me;
    }

    public void setAbout_me(String about_me) {
        this.about_me = about_me;
    }

    public String getUrl_img_perfil() {
        return url_img_perfil;
    }

    public void setUrl_img_perfil(String url_img_perfil) {
        this.url_img_perfil = url_img_perfil;
    }

    public String getUrl_banner() {
        return url_banner;
    }

    public void setUrl_banner(String url_banner) {
        this.url_banner = url_banner;
    }

    public String getUrl_github() {
        return url_github;
    }

    public void setUrl_github(String url_github) {
        this.url_github = url_github;
    }

    public String getUrl_instagram() {
        return url_instagram;
    }

    public void setUrl_instagram(String url_instagram) {
        this.url_instagram = url_instagram;
    }

    public String getUrl_linkedin() {
        return url_linkedin;
    }

    public void setUrl_linkedin(String url_linkedin) {
        this.url_linkedin = url_linkedin;
    }

   
    
 
    
}
