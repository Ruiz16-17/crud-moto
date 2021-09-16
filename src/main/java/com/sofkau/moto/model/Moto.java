package com.sofkau.moto.model;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name = "motors")
public class Moto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer identificacion;
    private String nombre;
    private String year;
    private String apariencia;

}
