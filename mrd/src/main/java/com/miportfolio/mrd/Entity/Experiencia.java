
package com.miportfolio.mrd.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String nombreE;
   private String descripcionE;

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }
   
   
}
