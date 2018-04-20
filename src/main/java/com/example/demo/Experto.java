package com.example.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@PrimaryKeyJoinColumn(name = "numeroEmpleado")
@DiscriminatorValue(EmpleadoType.Values.EXPERTO)
@Entity
public class Experto {

    private long sueldo;
}
