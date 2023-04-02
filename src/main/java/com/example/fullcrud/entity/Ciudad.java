
package com.example.fullcrud.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
@Table(name = "Ciudades")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "id_ciudad")
    private int idCiudad;
    @Column(name = "nombre_ciudad")
    private String nameCiudad;
    @ManyToOne
    @JoinColumn(name = "nombre_pais")
    private Pais pais;
}

