package com.example.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@PrimaryKeyJoinColumn(name = "numeroEmpleado")
@DiscriminatorValue(EmpleadoType.Values.BECARIO)
@Entity
public class Becario extends AbstractEmpleado {

    private int horasRealizadas;
}
