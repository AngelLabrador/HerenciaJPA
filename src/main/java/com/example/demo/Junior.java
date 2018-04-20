package com.example.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@PrimaryKeyJoinColumn(name = "numeroEmpleado")
@DiscriminatorValue(EmpleadoType.Values.JUNIOR)
@Entity
public class Junior extends AbstractEmpleado {

    private int sueldo;
}
