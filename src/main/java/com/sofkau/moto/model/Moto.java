package com.sofkau.moto.model;

import lombok.Data;
import javax.persistence.*;

@Table(name = "motors")
@Data
public class Moto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricula;
    private String marca;
    private String modelo;
    private String color;

}
